package com.excel.spring.jdbc;

import java.sql.DriverManager;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.excel.spring.jdbc")
public class JdbcConfig {
	@Bean("ds")
	public	DataSource dataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Sa123");
		return ds;
	}
	@Bean("jdbcTemplate")
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(dataSource());
		return template;

	}
}
 