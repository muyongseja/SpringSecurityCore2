package com.netsong7.core2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
		
		return "home";
	}
	
	@RequestMapping("/user/login")
	public void login(){
	
	}
	
	@RequestMapping("/user/login_success")
	public void login_success(HttpSession session){
		CustomUserDetails details =
			(CustomUserDetails)SecurityContextHolder.getContext()
								.getAuthentication().getDetails();
		
		logger.info("Welcome login_success! {}, {}", 
				details.getUsername(), details.getPassword());
		
		session.setAttribute("userLogInfo", details);
	}
	
	@RequestMapping("/user/login_duplicate")
	public void login_duplicate(){
		
	}
	
	@RequestMapping("/user/logout")
	public void logout(HttpSession session){
		session.invalidate();
	}
	
	@RequestMapping("/admin/admin")
	public void admin(){
		
	}
	
	@RequestMapping("/page1")
	public void page1(){
		
	}
}



