package org.onpups.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class TableUserVO {
	private int num;
	private String id;
	private String nick;
	private String email;
	private Date regDate;
	private String isDel;
	private Date delDate;
	private String password;
	private List<AuthVO> authList;
	
	
}
