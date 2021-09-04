package org.onpups.controller;


import org.onpups.domain.TableUserVO;
import org.onpups.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/*")
@RequiredArgsConstructor     // 이게있어야 서비스 final로 선언시 impl 과 연결시켜 자동매핑 
public class CommonController {
	private final UserService userService;
	
	@GetMapping("/accessError")	
	public void accessDenied(Authentication auth, Model model) { // Criteria 객체를 이용해서 페이징 조건을 적용시킨 쿼리를 이용해 데이터불러오고 model에 주입해 화면에 출력
		//criteria 객체를 매개변수로 잡았기에, 
		log.info("access Error page open : "+ auth);
		
		model.addAttribute("msg", "Access Denied");
	}
//	@GetMapping("/sign-in")	
//	public void sign1() { 
//		log.info("open sign-in");
//	}
	@GetMapping("/sign-up")	
	public void sign2() { 
		log.info("open sign-up");
	}
	@GetMapping("/sign-up-complete")	
	public void sign3() { 
		log.info("open sign-up-cumplete");
	}

	@PostMapping("/sign-up")
	public String createUser(TableUserVO vo, RedirectAttributes rttr) {
		log.info("open post sign-up");
		log.info("vo -> " + vo);
		log.info("voojo -> " + vo.getId());
		userService.createUser(vo);
		//rttr.addFlashAttribute("result", "success");
		log.info("create user complete");
		return "redirect:/sign-up-complete";
	}
	
	@GetMapping("/sign-in")
	public void loginInput(String error, String logout, Model model) {
		log.info("error loginInput: "+error);
		log.info("logout: "+logout);
		
		if (error != null) {
			model.addAttribute("error", "Login Error Check YOur Account");
			
		}
		if (logout != null) {
			model.addAttribute("logout", "Login out");
			
		}
	}
	
	@GetMapping("/logout")
	public void logoutGET() {
		log.info("logout page open");
	}
	
}
