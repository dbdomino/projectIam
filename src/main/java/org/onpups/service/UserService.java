package org.onpups.service;

import org.onpups.domain.TableUserVO;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
	public void createUser(TableUserVO vo);
	public String viewUserInfo(String id);
	public void editUserInfo(TableUserVO id);
	public String idCheck(String id);
	public String loginCheck(String id, String password);
}
