package org.onpups.mapper;

import org.onpups.domain.TableUserAuthVO;

public interface UserAuthMapper {
	public void create(TableUserAuthVO vo);
	public String read(String id);
	public void update(TableUserAuthVO vo);
	public void delete(String id);
}
