package com.lingyi.laboratory;

import com.lingyi.mall.oms.api.OrderFeignClient;
import com.lingyi.mall.pms.api.SkuFeignClient;
import com.lingyi.mall.ums.api.MemberFeignClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 实验室启动类
 *
 * @author Yixiaoyi03
 * @date 2021/11/29 0029 22:50
 */
@SpringBootApplication
@EnableFeignClients(basePackageClasses = {OrderFeignClient.class, SkuFeignClient.class, MemberFeignClient.class})
@EnableDiscoveryClient
public class LaboratoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LaboratoryApplication.class, args);
    }
}
