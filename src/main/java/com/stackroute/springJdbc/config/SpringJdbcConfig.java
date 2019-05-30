package com.stackroute.springJdbc.config;

import com.stackroute.springJdbc.controller.SpringJdbcController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
@Configuration
@ComponentScan("com.stackroute.*")
public class SpringJdbcConfig {

    @Bean("dataSource")
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/moviedatabase");
        dataSource.setUsername("root");
        dataSource.setPassword("Root@123");

        return dataSource;
    }

    @Bean("springJdbcController")
    public SpringJdbcController getController(){
        return new SpringJdbcController();
    }
}
