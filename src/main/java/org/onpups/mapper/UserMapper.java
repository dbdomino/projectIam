package org.onpups.mapper;

import org.onpups.domain.TableUserVO;

public interface UserMapper {
	public void create(TableUserVO vo);
	public TableUserVO read(int num);
	public TableUserVO readId(String id);
	public String idcheck(String id);
	public TableUserVO loginCheck(String id);
	public void update(TableUserVO vo);
	public void delete(int num);
}
