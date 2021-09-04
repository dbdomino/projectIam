package org.onpups.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
//XML setting
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//JAVA setting
//@ContextConfiguration(classes= {RootConfig.class})

@Log4j
public class UserServiceTests {
//	@Autowired
	@Setter(onMethod_ = {@Autowired})
	private SampleService service;
	
//	@Test
	public void testPring() {
		log.info("-------------------------------------");
		log.info(service);
		assertNotNull(service);
	}
	@Test
	public void testView() {
		log.info("-------------------------------------");
		log.info("test servece view: "+service.view(5));
	}
	
	@Test
	public void testRegister() {
//		BoardVO board = new BoardVO();
//		board.setTitle("운 타이틀1");
//		board.setContent("운 내용1");
//		board.setWriter("newbie");
//		
//		service.register(board);
//		
//		log.info("생성된 게시물번호 : "+board.getBno());
				
	}
	
//	@Test
	/*
	public void testGetList() {
//		BoardVO board = new BoardVO();
		//forEach(board -> log.info(board));
		service.getList().forEach(i -> log.info(i));
	}*/
//	@Test
	public void testGetList() {
//		Criteria cri = new Criteria(1, 10);
//		BoardVO board = new BoardVO();
		//forEach(board -> log.info(board));
//		service.getList(cri).forEach(i -> log.info(i));
	}
	
	
//	@Test
	public void testGet() {
//		log.info("test serveic get: "+service.get(11));
		
	}
	
//	@Test
	public void testModify() {
//		BoardVO board = service.get(11); // 이게 실행코드가 될 수 있다는거. 얘는 어디에다가??
//		
//		if(board == null) {
//			return ;
//		}
//		board.setTitle("제목수정1");
//		log.info("Modify Result : "+ service.modify(board));
		
	}
	
//	@Test
	public void testRemove() {
		// 게시물 존재하는지 확인  1이면 삭제완료 0이면 삭제실패
//		log.info("Remove Result : "+ service.remove(10));
	}
	
//	@Test
	public void testTotal() {
		// 게시물 존재하는지 확인  1이면 삭제완료 0이면 삭제실패
//		log.info("getTotal Result : "+ service.getTotal());
	}
}
