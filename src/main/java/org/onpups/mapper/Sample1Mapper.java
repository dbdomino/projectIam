package org.onpups.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.onpups.domain.ZozoVO;

public interface Sample1Mapper {
	@Insert("insert into zozo (cumd1, cumd2, numd1) values(#{cumd1}, #{cumd2}, #{numd1}) ")
	public void insertCol1(ZozoVO zozo);
	// public void insertCol1(String cumd1, String cumd2, int numd1); 단순 파라미터 선언한걸로 @Insert 문 안에 넣을 수 없다. 객체내의 변수들만 안에 넣을 수 있다.
	
	public void insertCol2(ZozoVO zozo);
	
	public List<ZozoVO> getList();
	
	public ZozoVO read(int num);

	

	
}
