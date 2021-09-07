package com.abc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.abc")
public class MyConfiguration2 {

	@Bean
	public DriverManagerDataSource getDataSourceBean() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(null);
		dataSource.setUrl(null);
		dataSource.setUsername(null);
		dataSource.setPassword(null);
		
		return dataSource;
	}
	
}
