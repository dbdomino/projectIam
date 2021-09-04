package org.onpups.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.onpups.domain.TableUserVO;
import org.onpups.mapper.UserMapper;
import org.onpups.security.domain.CustomUser;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
public class CustomUserDetailsService implements UserDetailsService{
	@Setter(onMethod_ = {@Autowired})
	private UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.warn("load User by username : " + username);
		
		TableUserVO vo= userMapper.readId(username);
		log.warn("load User member mapper : " + vo);
		
		
		return vo == null ? null : new CustomUser(vo);
	}
	
	
}
