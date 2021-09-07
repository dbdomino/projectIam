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
	private Date upregDate;
	private String isDel;
	private Date delDate;
	private String password;
	private String enabled;
	private List<TableUserAuthVO> authList;
	
	
}
