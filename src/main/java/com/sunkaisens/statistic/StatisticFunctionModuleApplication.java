package com.sunkaisens.statistic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class StatisticFunctionModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatisticFunctionModuleApplication.class, args);
	}
}
