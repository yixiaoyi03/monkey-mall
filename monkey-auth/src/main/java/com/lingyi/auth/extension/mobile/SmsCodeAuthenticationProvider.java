package com.lingyi.auth.extension.mobile;

import cn.hutool.core.util.StrUtil;
import com.lingyi.auth.userdetails.member.MemberUserDetailsServiceImpl;
import com.lingyi.common.constant.SecurityConstants;
import com.lingyi.common.web.exception.BizException;
import com.lingyi.mall.ums.api.MemberFeignClient;
import lombok.Data;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.HashSet;

/**
 * 短信验证码认证授权提供者
 *
 * @author Yixiaoyi03
 * @date 2021/9/25
 */
@Data
public class SmsCodeAuthenticationProvider implements AuthenticationProvider {

    private UserDetailsService userDetailsService;
    private MemberFeignClient memberFeignClient;
    private StringRedisTemplate redisTemplate;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        SmsCodeAuthenticationToken authenticationToken = (SmsCodeAuthenticationToken) authentication;
        String mobile = (String) authenticationToken.getPrincipal();
        String code = (String) authenticationToken.getCredentials();

        if (!code.equals("666666")) { // 666666 是后门，因为短信收费，正式环境删除这个if分支
            String codeKey = SecurityConstants.SMS_CODE_PREFIX + mobile;
            String correctCode = redisTemplate.opsForValue().get(codeKey);
            // 验证码比对
            if (StrUtil.isBlank(correctCode) || !code.equals(correctCode)) {
                throw new BizException("验证码不正确");
            }
            // 比对成功删除缓存的验证码
            redisTemplate.delete(codeKey);
        }
        UserDetails userDetails = ((MemberUserDetailsServiceImpl) userDetailsService).loadUserByMobile(mobile);
        SmsCodeAuthenticationToken result = new SmsCodeAuthenticationToken(userDetails, authentication.getCredentials(), new HashSet<>());
        result.setDetails(authentication.getDetails());
        return result;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return SmsCodeAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
