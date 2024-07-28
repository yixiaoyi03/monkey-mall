package com.lingyi.auth.userdetails.member;

import com.lingyi.common.result.Result;
import com.lingyi.common.result.ResultCode;
import com.lingyi.mall.ums.api.MemberFeignClient;
import com.lingyi.mall.ums.dto.MemberAuthDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 商城会员用户认证服务
 *
 * @author Yixiaoyi03
 */
@Service("memberUserDetailsService")
@RequiredArgsConstructor
public class MemberUserDetailsServiceImpl implements UserDetailsService {

    private final MemberFeignClient memberFeignClient;

    @Override
    public UserDetails loadUserByUsername(String username) {
        return null;
    }


    /**
     * 手机号码认证方式
     *
     * @param mobile
     * @return
     */
    public UserDetails loadUserByMobile(String mobile) {
        MemberUserDetails userDetails = null;
        Result<MemberAuthDTO> result = memberFeignClient.loadUserByMobile(mobile);
        if (Result.isSuccess(result)) {
            MemberAuthDTO member = result.getData();
            if (null != member) {
                userDetails = new MemberUserDetails(member);
            }
        }
        if (userDetails == null) {
            throw new UsernameNotFoundException(ResultCode.USER_NOT_EXIST.getMsg());
        } else if (!userDetails.isEnabled()) {
            throw new DisabledException("该账户已被禁用!");
        } else if (!userDetails.isAccountNonLocked()) {
            throw new LockedException("该账号已被锁定!");
        } else if (!userDetails.isAccountNonExpired()) {
            throw new AccountExpiredException("该账号已过期!");
        }
        return userDetails;
    }

    /**
     * openid 认证方式
     *
     * @param openId
     * @return
     */
    public UserDetails loadUserByOpenId(String openId) {
        MemberUserDetails userDetails = null;
        Result<MemberAuthDTO> result = memberFeignClient.loadUserByOpenId(openId);

        if (Result.isSuccess(result)) {
            MemberAuthDTO member = result.getData();
            if (null != member) {
                userDetails = new MemberUserDetails(member);
            }
        }
        if (userDetails == null) {
            throw new UsernameNotFoundException(ResultCode.USER_NOT_EXIST.getMsg());
        } else if (!userDetails.isEnabled()) {
            throw new DisabledException("该账户已被禁用!");
        } else if (!userDetails.isAccountNonLocked()) {
            throw new LockedException("该账号已被锁定!");
        } else if (!userDetails.isAccountNonExpired()) {
            throw new AccountExpiredException("该账号已过期!");
        }
        return userDetails;
    }
}
