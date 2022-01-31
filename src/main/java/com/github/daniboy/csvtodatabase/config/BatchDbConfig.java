package com.github.daniboy.csvtodatabase.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@EnableAutoConfiguration
public class BatchDbConfig {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "batch.datasource")
    public DataSource batchDataSource() {
        return DataSourceBuilder.create().build();
    }
}
