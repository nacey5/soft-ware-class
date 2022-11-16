package com.hzh.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @NAME: DruidConfig
 * @USER: DaHuangGO
 * @DATE: 2022/11/15
 * @TIME: 16:12
 * @YEAR: 2022
 * @MONTH: 11
 * @DAY: 15
 */
@Configuration
public class DruidConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druid(){
        return new DruidDataSource();
    }
}
