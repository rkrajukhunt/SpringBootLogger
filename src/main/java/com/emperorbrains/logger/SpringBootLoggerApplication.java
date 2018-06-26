package com.emperorbrains.logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.emperorbrains.logger.Controller.indexController;
import com.emperorbrains.logger.Model.Login;
import com.emperorbrains.logger.Resp.LoginResp;
import com.emperorbrains.logger.Service.LoginService;

@SpringBootApplication
@ComponentScan(basePackageClasses= {indexController.class,Login.class,LoginResp.class,LoginService.class})
public class SpringBootLoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoggerApplication.class, args);
	}
}
