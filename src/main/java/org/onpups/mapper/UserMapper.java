package org.onpups.mapper;

import org.onpups.domain.TableUserVO;

public interface UserMapper {
	public void create();
	public TableUserVO read(String id);
	public void update();
	public void delete();
}
