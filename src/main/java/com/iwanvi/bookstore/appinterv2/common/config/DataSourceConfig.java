package com.iwanvi.bookstore.appinterv2.common.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


/**
 * @Description 数据源配置
 * @Author zzw
 * @Date 2018年7月9日09:22:57
 */

@Configuration
public class DataSourceConfig {

    @Primary
    @Bean(name = "resourceProcessDataSource")
    @Qualifier("resourceProcessDataSource")
    @ConfigurationProperties(prefix="spring.datasource.resourceprocess")
    public DataSource resourceProcessDaryDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "resourceProcessJdbcTemplate")
    public JdbcTemplate resourceProcessJdbcTemplate(
            @Qualifier("resourceProcessDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }



}