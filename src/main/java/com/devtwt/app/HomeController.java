package com.devtwt.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devtwt.app.constants.ClassNameConstants;
import com.devtwt.app.util.Bus;
import com.devtwt.app.bklogic.*;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		try {
			Test test = new Test();
			test.testout();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "home";
	}
	
	@RequestMapping(value = "/test1", method = RequestMethod.POST)
	@ModelAttribute("test.itm1")
	public String test1(Locale locale, Model model) {
		logger.info("Move to test1! The client locale is {}.", locale);
		
		System.out.println(model.getClass());
		model.addAttribute("receivedData", "test.itm1");
		return "test1";
	}
	
	@RequestMapping(value = "/test1_1", method = RequestMethod.POST)
	public String test1_1(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "test1_1";
	}
	@RequestMapping(value = "/test1_2", method = RequestMethod.POST)
	public String test1_2(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		
		return "test1_2";
	}
	@RequestMapping(value = "/test1_2_1", method = RequestMethod.POST)
	public String test1_2_1(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "test1_2_1";
	}
}
