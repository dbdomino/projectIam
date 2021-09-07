package org.onpups.mapper;

import java.util.List;

import org.onpups.domain.AttachVO;

public interface AttachMapper {
	public void insert(AttachVO vo);
	public void delete(String uuid);
	
	public void delete2(String newfilename);
	
	public List<AttachVO> getOldFiles();
}