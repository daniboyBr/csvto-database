package com.github.daniboy.csvtodatabase.config;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import com.github.daniboy.csvtodatabase.repository.PhoneRepository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(entityManagerFactoryRef = "phoneEntityManager", transactionManagerRef = "phoneTransactionManager", basePackageClasses = PhoneRepository.class)
@EnableTransactionManagement
@EnableAutoConfiguration
public class PhoneDbConfig {

    @Bean
    @ConfigurationProperties(prefix = "destino.datasource")
    public DataSource phoneDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean phoneEntityManager(
            EntityManagerFactoryBuilder builder,
            @Qualifier("phoneDataSource") DataSource dataSource) {

        return builder.dataSource(dataSource).packages("com.github.daniboy.csvtodatabase.model")
                .build();

    }

    @Bean
    public PlatformTransactionManager phoneTransactionManager(
            @Qualifier("phoneEntityManager") EntityManagerFactory emFactory) {

        return new JpaTransactionManager(emFactory);

    }

}
