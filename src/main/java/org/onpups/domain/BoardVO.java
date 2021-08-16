package org.onpups.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class BoardVO {
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date upregdate;
	private String keyword;
	private String type;
	
	private int replycnt;
	
//	private List<AttachVO> attachList;
	
	public BoardVO(){
		this("01","W");//작동안함
//		this.keyword = "01";
//		this.type = "W";
	}
	public BoardVO(String keyword, String type) {
		this.keyword = keyword;
		this.type = type;
	}
	
}
