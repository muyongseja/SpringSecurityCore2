package com.netsong7.core2;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
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
	
	@RequestMapping("/user/addMember")
	public void addMemberGet(){
		
	}
}









