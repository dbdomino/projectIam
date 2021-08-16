package org.onpups.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.onpups.domain.BoardVO;
import org.onpups.domain.Criteria;
import org.onpups.domain.Criteria2;
import org.onpups.domain.ZozoVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
//XML setting
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//JAVA setting
//@ContextConfiguration(classes= {RootConfig.class})
@Log4j
public class SampleMapperTests {
//	@Setter(onMethod_ = @Autowired)
//	private BoardMapper mapper;
//	@Autowired
//	private TimeMapper timeMapper;
	@Autowired
	private Sample1Mapper Mapper1;
	
//	@Test
	public void testGetList() {
		Mapper1.getList().forEach(board -> log.info(board));
	}
	
//	@Test
	public void testInsert1() {
				
//		Mapper1.insertCol1("새타이틀1dofamero아하111", "go#@&))(@&*_)@{}@@)urod.채젝", 111);
		ZozoVO Zozo = new ZozoVO();
		Zozo.setCumd1("새타이틀1dofamero아하111");
		Zozo.setCumd2("go#@&))(@&*_)@{}@@)urod.채젝");
		Zozo.setNumd1(111);

		Mapper1.insertCol1(Zozo);
		
		log.info(Zozo);
	}
	
	@Test
	public void testRead() {
		log.info("board_before: ----------------");
		ZozoVO zz = Mapper1.read(6);
		log.info(zz);
//		log.info("board: ----------------" +board);
	}
	
	
//	@Test
	public void testInsert2() {
		ZozoVO Zozo = new ZozoVO();
		Zozo.setCumd1("새로운 타이틀222dsfwe군dfwer");
		Zozo.setCumd2("net content 새로운 내용22");
		Zozo.setNumd1(222);

		Mapper1.insertCol2(Zozo);
		
		log.info(Zozo);
	}
	
//	@Test
	public void testGetListWithPaging() {
		Criteria cri = new Criteria();
//		cri.setType("C");
//		cri.setKeyword("테스");
		cri.setPageNum(1);
//		List<BoardVO> list = mapper.getListWithPaging(cri);
		
//		list.forEach(board -> log.info(board));
	}
//	@Test
	public void testGetListWithPaging2() {
		Criteria2 cri = new Criteria2();
		
		cri.setType("TCP");
		cri.setKeyword("테스");
		// type 의 값으로 문자열을 받았을 때 한글자씩 분리하여 각 문자가 조건에 맞는다면 출력하는 기능을 구현하는법
		// type으로 받은 문자열을 한글자 씩 분리한 것을 foreach 에 넣어 반복문을 돌려야한다.
		// 순서 1 foreach를 돌릴 속성a(list 또는 array 또는 Map)를 만든다.
		// 순서 2 type으로 받은 문자열을 한글자씩 분리하여 속성a(list 또는 array 또는 map)에 저장시킬 메소드1를 정의한다.
		//        메소드는 어디에다 정의할 것인가?? 입력받는 VO나 DTO에 하는게 제일 깔끔하다. 해당 클래스에 메소드1를 정의한다.
		// 순서 3 컨트롤러로 출력시 메소드를 호출하여 속성a에 저장시킬 메소드1을 실행한다.
		// 순서 4 mapper 인터페이스에 사용할 메소드에 파라미터로 속성a가 들어갈 수 있도록 수정한다.
		// 순서 5 mapper xml에 foreach에 사용할 collection으로 요소a를 등록해야 하는데......속성a가 list나 array라면 그대로 입력
		//        map이라면 속성a의 변수명 입력 ????이거 되나몰라??
		// 순서 6 메소드1 실행
		//
		// 이런 긴 과정을 거칠 필요없이 mybatis에서 제공하는 특성을 이용하면, 순서1~5과정을 거칠 필요가없다.
		// mybatis는 get/set 메소드만을 활용하는 방식, 즉 이름을 이용해 get/set메소드를 맞춰 원하는 속성을 찾아오는 특성을 가졌다.
		// foreach 를 돌릴때 collection에 정의되지 않은 속성을 사용할 경우, 즉 정의되지 않은 getter와 setter메소드를 이용하는 건 가능하다.
		// 속성을 정의하지 않았는데 어떻게 getter와 setter메소드를 사용할 수 있는가??
		// 
		// foreach에서 collection으로 사용하는건 불러와야한다. 즉 mybatis에서 getter를 사용하여 불러온다. 
		// 위의 순서 2에서 필요한 속성a를 정의 하는 것(정적) 말고 정의되지 않은 속성B를 collection에 넣으면 어떻게될까? 
		// mybatis에서는 속성B에 대한 getter를 사용하여 불러올것이다. (mybatis의 특성이다 매우중요)
		// 그렇다면 속성B를 정의하지 않고 속성B에 대한 getter만 따로 정의한다면, mybatis에서 속성B에 대한 getter를 불러오는것은 가능할까??
		// 가능하다.(mybatis의 특성 때문이다. 매우중요.)
		// 그러므로 다시 위의 요구조건을 구현하려면,
		// foreach의 collection으로 속성B를 등록하고, 속성B의 getter로 type으로 받은 문자열을 한글자씩 분리한 것을 리턴하는 것으로 정의하면
		// 즉, 동적으로 속성B를 만들어서 foreach에 collection으로 등록하여 사용한다면
		// 순서 1~5의 과정을 생략할 수 있을것이다. 즉 코드가 간편해진다. 하 어렵고 매우 복잡하지만 정리하는데 성공했다.
		
		// OGNL표현식, mybatis의 특성, foreach의 사용법 및 요소, 속성들의 자료구조와 입력 및 변환방법, getter/setter 메소드, lombok의 어노테이션
		// mapper 메소드 사용법, mapper 메소드에 동적SQL에 들어갈 파라미터 등록방법(클래스 내의 속성, 메소드상의 파라미터) 들을 알아야
		// 이 소스가 왜 동작하는지 이해할 수 있다.
//		log.info("cri getTypeArr() : "+ cri.getTypeArvdsdsdfr());
//		log.info("cri getTypeArr() : "+ cri.TypeArvdsdsdfr);
//		log.info("cri getTypeArr() : "+ cri.getTypeArvdsdsdfr()[0]);
//		log.info("cri getTypeArr() : "+ cri.getTypeArvdsdsdfr()[1]);
//		log.info("cri getTypeArr() : "+ cri.getTypeArvdsdsdfr()[2]);
//		log.info("cri getTypeArr() : "+ cri.getTypeArvdsdsdfr()[3]);
//		log.info("cri getTypeArr() : "+ cri.getTypeArvdsdsdfr()[4]);
//		log.info("cri getTypeArr() : "+ cri.getTypeArvdsdsdfr()[5]);
//		List<BoardVO> list = mapper.getListWithPaging2(cri);
		
//		list.forEach(board -> log.info(board));
	}
	
	//@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("new title 새로운 타이틀3");
		board.setContent("net content 새로운 내용3");
		board.setWriter("newbie");
		
//		mapper.insert(board);
		
		log.info(board);
	}
	
	//@Test
	public void testInsertSelectKey() {
		BoardVO board = new BoardVO();
		log.info("board-before: ---------------------"+board);
		board.setTitle("new title 새로운 타이틀5");
		board.setContent("net content 새로운 내용5");
		board.setWriter("newbie");
		log.info("board-mid: ---------------------"+board);
//		mapper.insertSelectKey( board);
		
		log.info("board-after: ---------------------"+board);
	}
	
//	@Test
	public void testDelete() {
//		log.info("DELETE COUNT:----------"+mapper.delete(3));
	}
	
//	@Test
	public void testUpdate() throws ParseException {
		/*
		String from = timeMapper.getTime();
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date to = fm.parse(from);
		log.info("to time------------"+to);
		*/
		
		BoardVO board = new BoardVO();
		log.info("before UPDATE------------"+board);
		board.setBno(6);
		board.setTitle("updated title2");
		board.setContent("updated content2");
		board.setWriter("newbeast");
//		board.setUpregdate(to);
		log.info("mid UPDATE------------"+board);
//		int count = mapper.update(board);
//		log.info("UPDATE COUNT--------------: "+count);
	}
	
//	@Test
	public void testTotal() {
//		int total = mapper.total();
//		log.info("total COUNT--------------: "+total);
	}
	
//	@Test
	public void testOGNLonMethod() {
		// char 타입은 ''   String 타입은 ""로 처리;
		 BoardVO vo = new BoardVO("1", "W");
		 log.info("keyword -> "+vo.getKeyword());
		 log.info("type -> "+vo.getType());
		// mapper xml에 변수로 등록할때 파라미터이름으로 인터페이스에 아래처럼 등록하고 테스트를 진행하면 매개변수 keyword와 type은 xml에서 인식하지 못한다. 
//		 public List<BoardVO> testOGNL(String keyword, String type);
//		 mapper.testOGNL("1", "W").forEach(board -> log.info(board));
//		 때문에 xml에 변수를 이용한 동적 쿼리를 작성하기 위해 호출시 매개변수로 객체를 넣고, 객체안에는 변수로 사용할 파라미터들이 들어있으면 좋다.
//		mapper.testOGNL(vo).forEach(board -> log.info(board));
	}
//	@Test
	public void searchTest() {
		Map<String, String> mapo_0 = new HashMap<>();
		mapo_0.put("ㅋ", "ㅋㅋㅋㅋ");
		mapo_0.put("ㅌ", "ㅌㅌㅌㅌ"); 
		mapo_0.put("ㄹ", "ㄹㄹㄹㄹ"); 
		mapo_0.put("ㅅ", "ㅅㅅㅅㅅ"); 
		Map<String, String> mapo = new HashMap<>();
		mapo.put("T", "TTT1");
		mapo.put("T", "TTT2"); // map의 특성, {key=value, key=value, key=value.... 형태}
		mapo.put("T", "TTT3"); // map에 데이터추가와 데이터수정은 put으로 해결한다. 있은 key의 값을 수정하고싶다면 put으로 한다.
		mapo.put("T", "TTT4"); 
		log.info("mapo의 T의 값 : "+mapo.get("T")); // key에 해당되는 값을 얻기 위해서는 다음과 같이 get을 사용 한다. key값은 대소문자 구분함
		mapo.put("X", "XXX2");
		mapo.put("G", "GGG3");
		mapo.put("S", "SSS4"); 
		mapo.put("TX1", "TXTX1111"); 
		mapo.put("GT2", "GTGT2222"); 
		// containsKey 키가 있는지 확인하는 메소드, true/false 로 출력
		log.info("containsKey G : "+ mapo.containsKey("G"));
		// remove 키 삭제
		mapo.remove("S");
		// size map의 현재크기 출력
		log.info("mapo size : "+ mapo.size());
		
		// map을 통해 mybatis에서 foreach를 돌리려면 Map<String, Map<String, String>> 형식으로 map안에 map을 넣어서 보내야한다.
		// Map<String, String> 형식으로 보내면 foreach가 map을 인식을 못한다.
		// map(변수) : {T=TTT4, G=GGG3, X=XXX2}    outer(변수) : {mapinouter={T=TTT4, G=GGG3, X=XXX2}} 이다.
		// foreach에서 collection은 map(타입)이아닌 mapinouter(키값)을 적어야한다. 아래처럼 outer가 collection에 들어가야한다.
		// list나 array로 foreach를 이용하려면 collection에 list(타입)나 array(타입)을 입력해야한다.
		// foreach안에 돌릴 반복문의 인자는 for처럼 1개만 들어간다.
		// foreach돌릴때 map으로 돌린다면 반복돌릴 map의 key값을 입력하여 선택적으로 반복 가능
		// 그러나 list나 array는 mapper의 1개 파라미터로 등록해야한다. 2개이상 등록하면 foreach사용 불가능.
		Map<String, Map<String, String>> outer = new HashMap<>();
		outer.put("mapinouter",mapo);
		outer.put("mapinouter2",mapo_0);
		log.info("map : " + mapo);
		log.info("outer : " + outer);
//		List<BoardVO> list = mapper.searchTest(outer);
//		List<BoardVO> list2 = mapper.searchTest2(mapo);
//		log.info("list2 : " + list2);
		
		List<String> lafwer =  new ArrayList();
		lafwer.add("TTT1");
		lafwer.add("XXX2");
		lafwer.add("GGG3");
		lafwer.add("WWW4");
		List<String> lafwer2 =  new ArrayList();
		lafwer2.add("ㄷㄷㄷㄷㄷ");
		lafwer2.add("ㅅㅅㅅㅅ");
		lafwer2.add("ㄹㄹㄹ");
		lafwer2.add("ㅈㅈ");
		log.info("list lafwer : "+lafwer);
//		List<BoardVO> list3 = mapper.searchTest3(lafwer);
//		List<BoardVO> list3 = mapper.searchTest3(lafwer2);
//		List<BoardVO> list3 = mapper.searchTest3(lafwer, lafwer2);
		
		String[] sonss = new String[4];
		String[] sons2 =  {"sosn11","sosn22","sosn33","sosn44"};
//		List<BoardVO> list4 = mapper.searchTest4(sons2);
		
//		List<BoardVO> list_1 = mapper.searchTest_1(outer);
//		List<BoardVO> list_2 = mapper.searchTest_2(outer);
		
	}
}
