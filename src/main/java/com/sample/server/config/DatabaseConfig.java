package com.sample.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@Configuration
@EnableJpaRepositories("com.sample.server.repository")
@EnableTransactionManagement
@PropertySource(value = "file:db.properties")
//@ComponentScans("com.sample.server")
public class DatabaseConfig {
    @Resource
    private Environment env;
}