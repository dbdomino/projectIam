package org.onpups.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.onpups.domain.BoardVO;
import org.onpups.domain.Criteria;
import org.onpups.domain.Criteria2;

public interface BoardMapper {
	//@Select("select * from tbl_board where bno>2")
	public List<BoardVO> getList();
	public List<BoardVO> getListWithPaging(Criteria cri);
	public List<BoardVO> getListWithPaging2(Criteria2 cri);
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(int bno);
	
	public int delete(int bno);
	
	public int update(BoardVO board);
	
	public int total();
	public int gettotalwithpaging(Criteria cri);
//	public List<AttachVO> getAttachList(int bno);
	
	public void updateReplyCnt(@Param("bno") int bno, @Param("amount") int amount);
	
	
	
	public List<BoardVO> testOGNL(BoardVO vo);
	public List<BoardVO> searchTest(Map<String, Map<String,String>> map);
	public List<BoardVO> searchTest2(Map<String, String> map);
	public List<BoardVO> searchTest3(List<String> lowParam);
	public List<BoardVO> searchTest4(String[] StrArray);
	public List<BoardVO> searchTest_1(Map<String, Map<String,String>> map);
	public List<BoardVO> searchTest_2(Map<String, Map<String,String>> map);
}
