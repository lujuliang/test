package com.good.web.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



/**
 * @version 1.0
 *
 */
@RestController
public class LoginController  {
	
	private static Logger log = LoggerFactory.getLogger(LoginController.class);

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {

			return new ModelAndView("index");
	}
	
}
