package org.onpups.security;

import org.onpups.domain.TableUserVO;
import org.onpups.mapper.UserMapper;
import org.onpups.security.domain.CustomUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import lombok.extern.log4j.Log4j;

@Log4j
public class CustomUserDetailsService implements UserDetailsService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		log.warn("load user by id : "+id);
		TableUserVO vo = userMapper.readMap(id);
		log.warn("queried by UserMapper : "+vo);
		
		return vo == null ? null : new CustomUser(vo);
	}
}
