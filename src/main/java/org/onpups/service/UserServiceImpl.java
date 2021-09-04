package org.onpups.service;

import org.onpups.domain.TableUserAuthVO;
import org.onpups.domain.TableUserVO;
import org.onpups.domain.ZozoVO;
import org.onpups.mapper.Sample1Mapper;
import org.onpups.mapper.UserAuthMapper;
import org.onpups.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class UserServiceImpl implements UserService{
	@Setter(onMethod_ = @Autowired)
	private UserMapper userMapper;
	@Autowired
	private UserAuthMapper authMapper;
	@Override
	public void createUser(TableUserVO vo) {
		// TODO Auto-generated method stub
		TableUserAuthVO vo2 = new TableUserAuthVO();
		vo2.setId(vo.getId());
		vo2.setAuth("ROLE_NORMAL");
		userMapper.create(vo);
		authMapper.create(vo2);
	}
	@Override
	public String viewUserInfo(String id) {
		
		return authMapper.read(id);
	}
	@Override
	public void editUserInfo(TableUserVO vo) {
		userMapper.update(vo);
	}
	@Override
	public String idCheck(String id) {
		String tmp = userMapper.idcheck(id);
		
		if(tmp == null) {
			return "Y";
		} else {
			return "X";
		}
		
	}
	@Override
	public String loginCheck(String id, String password) {
		TableUserVO vo = userMapper.loginCheck(id);
		if(vo.getId().equals(id) && vo.getPassword().equals(password) ) { return "Y";}
		else {return "N";}
	}
	


}
