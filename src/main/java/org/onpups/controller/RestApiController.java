package org.onpups.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.servlet.http.HttpServletRequest;

import org.onpups.service.SampleService;
import org.onpups.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor 
@Log4j
public class RestApiController {
	private final UserService userservice;
	@GetMapping(value="/idcheck")
	public String idcheck(HttpServletRequest request, @RequestParam Map<String, Object> param) {
//	public String idcheck(HttpServletRequest request, @RequestBody String param) { // VO로받을때 {
//	public String idcheck(HttpServletRequest request, @PathVariable("id") String id) {
		String id = (String) param.get("id");
		log.info("api control idcheck --------------------");
		log.info("id = " + id);
		log.info("param = " + param);
//		log.info("Api idcheck---------result = "+userservice.idCheck(id));
		
		return userservice.idCheck(id);
	}
	
//	
//	// produces속성은 반드시 필요한 것은아니므로 생략해도되지만 쓴다면 다음과같다.
////	produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
////	@GetMapping(value="/getSample", produces = MediaType.APPLICATION_JSON_VALUE)  // json형식 반환
////	@GetMapping(value="/getSample", produces = MediaType.APPLICATION_XML_VALUE)   // xml형식 반환
//	@GetMapping(value="/getSample", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
//	public SampleRestVO getSample() {
//		log.info("MIME TYPE getSample: "+ MediaType.TEXT_PLAIN_VALUE);
//		SampleRestVO aa = new SampleRestVO(112, "스타", "로드");
//		log.info("MIME TYPE getSample: "+ aa);
//		
////		return aa;
//		return aa = new SampleRestVO(1212, "23스타", "로45드");
//	}
//	
//	@GetMapping(value="/getList")
//	public List<SampleRestVO> getList() {
//		
//		log.info("MIME TYPE getList: ");
//		// IntStream 은 뭔가?? 1부터 10미만 까지의 루프를 처리하며 SampleRestVO 객체를 만들어냄
//		return IntStream.range(1,10).mapToObj(i -> new SampleRestVO(i,i+"First", i+"Last")).collect(Collectors.toList());
//	}
//	
//		
//	@GetMapping(value= "/check", params= {"height", "weight"})
//	public ResponseEntity<SampleRestVO> check(Double height, Double weight){
//		SampleRestVO vo = new SampleRestVO(0, ""+height,""+weight);
//		
//		ResponseEntity<SampleRestVO> result = null;
//		
//		// 헤더에 게이트웨이
//		if (height < 150) {
//			result = ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(vo);
//		} else {
//			result = ResponseEntity.status(HttpStatus.OK).body(vo);
//		}
//		
//		return result;
//	}
//	
//	@GetMapping(value= "/product/{cat}/{pid}")
//	public String[] getPath(@PathVariable("cat") String cat, @PathVariable("pid") Integer pid) {
//				
//		log.info("getPath");
//		
//		return new String[] {"category: "+cat, "productid: "+pid};
//	}
//	
//	@PostMapping(value= "/ticket")
//	public Ticket convert(@RequestBody Ticket ticket) {
////
////		ticket.setTno(123);
////		ticket.setOwner("Admin");
////		ticket.setGrade("AAA");
////		
////		String jsonStr= new Gson().toJson(ticket);
////		
////		log.info(jsonStr);
////		ResponseEntity<Ticket> result = null;
////		// 헤더에 게이트웨이
////		result = ResponseEntity.status(HttpStatus.OK).body(ticket);
////				
////		return result;
//		
//		return ticket;
//	}
}
