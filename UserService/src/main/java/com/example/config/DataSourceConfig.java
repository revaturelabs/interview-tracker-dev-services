package com.example.config;

import javax.sql.DataSource;



@Configuration
public class DataSourceConfig 
{	
	
	@Bean
	public DataSource getDataSource()
	{
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName("org.postgresql.Driver");
		dataSourceBuilder.url(System.getenv("url"));
		dataSourceBuilder.username(System.getenv("username"));
		dataSourceBuilder.password(System.getenv("password"));
		return dataSourceBuilder.build();
	}
}
