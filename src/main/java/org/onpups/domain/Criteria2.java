package org.onpups.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria2 {
	private int pageNum;
	private int amount;
	
	private String typeo;
	private String keyword;
	public String[] TypeArr;
	
	public Criteria2() {
		this(1, 10);
	}
	
	public Criteria2(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
	public Criteria2(int pageNum) {
		this.pageNum = pageNum;
	}
	
	public String[] getTypeArr() {
		
		return typeo == null?new String[] {}: typeo.split("");
	}
	
	

	public void setType(String i) {
		this.typeo = i;
		
	}

	public String getType(String i) {
		return this.typeo;
		
	}
	public void setKeyword(String i) {
		this.keyword = i;
		
	}

	public String getKeyword(String i) {
		return this.keyword;
		
	}
}
