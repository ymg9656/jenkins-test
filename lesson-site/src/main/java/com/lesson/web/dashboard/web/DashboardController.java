package com.lesson.web.dashboard.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class DashboardController {
	private static final Logger logger =Logger.getLogger(DashboardController.class);
	   
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index() { 
		logger.error("error---------> logging test");
		logger.debug("debug---------> logging test");
		logger.warn("warn---------> logging test");
		logger.info("info---------> logging test");
		return "index";
	}
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String test() { 
		logger.error("error---------> logging test");
		logger.debug("debug---------> logging test");
		logger.warn("warn---------> logging test");
		logger.info("info---------> logging test");
		return "index";
	}
	
	@RequestMapping(value="/test2",method=RequestMethod.GET)
	public String test2() { 
		logger.error("error---------> logging test");
		logger.debug("debug---------> logging test");
		logger.warn("warn---------> logging test");
		logger.info("info---------> logging test");
		return "index";
	}
	
}
