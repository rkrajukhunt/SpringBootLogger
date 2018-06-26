package com.emperorbrains.logger.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.emperorbrains.logger.Model.Login;
import com.emperorbrains.logger.Service.LoginService;

@RestController
public class indexController implements ErrorController{
	private static final String PATH="/error";
	private static final Logger log = LoggerFactory.getLogger(indexController.class);

	@RequestMapping("/")
	public String wel() {
		log.error("Error");
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.trace("trace");
		return "Welcome to Emperor Brains";
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}
	
	@RequestMapping(value=PATH,method=RequestMethod.GET)
	public String getDefaultError() {
		return "Error";
	}
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/save")
	public String save(@RequestBody Login l) {
		loginService.save(l);
		return "Data Save";
	}
	
	@GetMapping("/get")
	public Iterable<Login> get(){
		return loginService.getAll();
	}
}
