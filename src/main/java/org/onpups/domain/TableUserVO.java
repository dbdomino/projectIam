package org.onpups.domain;

import java.util.Date;

import lombok.Data;

@Data
public class TableUserVO {
	private int num;
	private String id;
	private String email;
	private Date regDate;
	private String isDel;
	private Date delDate;
	private String password;
	
	
	
}
