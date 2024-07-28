package com.lingyi.common.sms.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 阿里云短信配置
 * <p>
 * 配置文件 lingyi-common.yml
 *
 * @author Yixiaoyi03
 * @date 2021/10/13 22:44
 */
@ConfigurationProperties(prefix = "aliyun.sms")
@Configuration
@Data
public class AliyunSmsProperties {

    private String accessKeyId;

    private String accessKeySecret;

    private String domain;

    private String regionId;

    private String templateCode;

    private String signName;

}
