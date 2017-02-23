package com.netsong7.core2;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberDao memberDao;
	
	@RequestMapping("/user/login")
	public void login(Member member){
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ROLE_USER"));
		UsernamePasswordAuthenticationToken token = 
			new UsernamePasswordAuthenticationToken(member.getUserid(), member.getUserpw());
		Authentication auth = token;
		SecurityContextHolder.getContext().setAuthentication(auth);
	}
	
	@RequestMapping("/user/login_success")
	public void login_success(HttpSession session){
		/*
		CustomUserDetails details =
			(CustomUserDetails)SecurityContextHolder.getContext()
								.getAuthentication().getDetails();
		
		logger.info("Welcome login_success! {}, {}", 
				details.getUsername(), details.getPassword());
		*/
		
		//session.setAttribute("userLogInfo", details);
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
	
	@RequestMapping(value="/user/addMember", method=RequestMethod.POST)
	public String addMemberPost(Member member){
		memberDao.insertMember(member);
		return "user/login_success";
	}
}









