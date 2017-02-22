package com.netsong7.core2;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class CustomAuthenticationProvider implements AuthenticationProvider{
	private static final Logger logger = 
			LoggerFactory.getLogger(CustomAuthenticationProvider.class);
	
	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return arg0.equals(UsernamePasswordAuthenticationToken.class);
	}
	
	@Override
	public Authentication authenticate(Authentication arg0) throws AuthenticationException {
		// TODO Auto-generated method stub
		String _id = (String)arg0.getPrincipal();
		String _pw = (String)arg0.getCredentials();
		
		logger.info("Welcome authenticate! {}", _id + "/ " + _pw);
		
		if(_id.equals("user1") && _pw.equals("1111")){
			List<GrantedAuthority> roles = new ArrayList<>();
			roles.add(new SimpleGrantedAuthority("ROLE_USER"));
			
			UsernamePasswordAuthenticationToken result = 
				new UsernamePasswordAuthenticationToken(_id, _pw, roles);
			
			result.setDetails(new CustomUserDetails(_id, _pw, "ROLE_USER"));
			
			return result;
		}
		else{
			return null;
		}
	}
}









