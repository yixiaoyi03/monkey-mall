package com.lingyi.laboratory.spring.aop.transactional;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * 开启事务支持
 *
 * @author Yixiaoyi03
 * @Date 2022/3/26 0026 21:17
 */
//@EnableTransactionManagement
public class MytransactionManager {
    // 使用DataSourceTransactionManager来管理事务
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager(dataSource);
        return dataSourceTransactionManager;
    }
}
