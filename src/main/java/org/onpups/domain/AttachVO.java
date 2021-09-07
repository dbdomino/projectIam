package org.onpups.domain;

import lombok.Data;

@Data
public class AttachVO {
	private String uuid;
	private String uploadPath;
	private String filename;
	private String newfilename;
	private String fileType;
	
}
