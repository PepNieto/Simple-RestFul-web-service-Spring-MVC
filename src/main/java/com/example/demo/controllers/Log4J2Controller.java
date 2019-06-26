package com.example.demo.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log4J2Controller {

		private static final Logger LOG = LogManager.getLogger(Log4J2Controller.class);

		@GetMapping("/log") 
		public String greeting() {
			
			LOG.debug("Debug");
			LOG.info("Info");
			LOG.warn("Warn");
			LOG.fatal("Fatal Error");
			
		return "log";	
		}
}
