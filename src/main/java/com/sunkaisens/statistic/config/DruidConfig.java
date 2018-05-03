package com.sunkaisens.statistic.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DruidConfig {
	
	private Logger logger = LoggerFactory.getLogger(DruidConfig.class);
	
	@Value("${spring.datasource.url}")
	private String dbUrl;
	  
	@Value("${spring.datasource.username}")
	private String username;
	  
	@Value("${spring.datasource.password}")
	private String password;
	  
	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;
	  
	@Value("${spring.datasource.initialSize}")
	private int initialSize;
	  
	@Value("${spring.datasource.minIdle}")
	private int minIdle;
	  
	@Value("${spring.datasource.maxActive}")
	private int maxActive;
	  
	@Value("${spring.datasource.maxWait}")
	private int maxWait;
	  
	@Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
	private int timeBetweenEvictionRunsMillis;
	  
	@Value("${spring.datasource.minEvictableIdleTimeMillis}")
	private int minEvictableIdleTimeMillis;
	  
	@Value("${spring.datasource.validationQuery}")
	private String validationQuery;
	  
	@Value("${spring.datasource.testWhileIdle}")
	private boolean testWhileIdle;
	  
	@Value("${spring.datasource.testOnBorrow}")
	private boolean testOnBorrow;
	  
	@Value("${spring.datasource.testOnReturn}")
	private boolean testOnReturn;
	  
	@Value("${spring.datasource.poolPreparedStatements}")
	private boolean poolPreparedStatements;
	  
	@Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
	private int maxPoolPreparedStatementPerConnectionSize;
	  
	@Value("${spring.datasource.filters}")
	private String filters;
	  
	@Value("${spring.datasource.connectionProperties}")
	private String connectionProperties;
	
	@Value("${spring.datasource.maxOpenPreparedStatements}")
	private int maxOpenPreparedStatements;
	  
	@Bean
	@Primary  //Spring优先选择被该注解所标记的数据源
	public DataSource dataSource(){
	    DruidDataSource datasource = new DruidDataSource();  
	    
	    datasource.setUrl(dbUrl);
	    datasource.setUsername(username);
	    datasource.setPassword(password);
	    datasource.setDriverClassName(driverClassName);
	      
	    datasource.setInitialSize(initialSize);
	    datasource.setMinIdle(minIdle);
	    datasource.setMaxActive(maxActive);
	    datasource.setMaxWait(maxWait);
	    datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
	    datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
	    datasource.setValidationQuery(validationQuery);
	    datasource.setTestWhileIdle(testWhileIdle);
	    datasource.setTestOnBorrow(testOnBorrow);
	    datasource.setTestOnReturn(testOnReturn);
	    datasource.setPoolPreparedStatements(poolPreparedStatements);
	    datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
	    datasource.setConnectionProperties(connectionProperties);
	    datasource.setMaxOpenPreparedStatements(maxOpenPreparedStatements);
	    
	    try {
	        datasource.setFilters(filters);
	    } catch (SQLException e) {
	        logger.error("druid configuration initialization filter", e);
	    }
	    datasource.setConnectionProperties(connectionProperties);
	    
	    return datasource;
	}  

}
