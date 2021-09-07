package org.onpups.controller;

import java.security.Principal;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.onpups.domain.AttachVO;
import org.onpups.domain.TableUserVO;
import org.onpups.domain.ZozoVO;
import org.onpups.security.domain.CustomUser;
import org.onpups.service.SampleService;
import org.onpups.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/main/*")
@RequiredArgsConstructor     // 이게있어야 서비스 final로 선언시 impl 과 연결시켜 자동매핑 
public class MainController {
	private final SampleService sampleService;
	private final UserService userService;
	
	@GetMapping("/quest")	
	public String quest(Model model) {
		log.info("open quest");
		model.addAttribute("zozo", sampleService.view(6));
		
		return "/main/quest";
	}
//	@GetMapping("sign-in")	
//	public void sign1() { 
//		log.info("open sign-in");
//	}
//	@GetMapping("sign-up")	
//	public void sign2() { 
//		log.info("open sign-up");
//	}
	@GetMapping("all")	
	public void all(Principal principal) { 
		// 파라메터 (Principal principal) 안쓸거면 이걸로 불러오기 가능
//		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal(); 
//		UserDetails userDetails = (UserDetails)principal; 
//		String username = userDetails.getUsername();
//		log.info(username);
		
		if (principal != null) {
			CustomUser activeUser = (CustomUser) ((Authentication) principal).getPrincipal();
			TableUserVO vo = activeUser.getUser();
			log.info(vo);
			log.info(vo.getNum());
		} else {
			log.info("not logined");
		}
		log.info("open all.jsp");
	}
	@GetMapping("all2")	
	public void all2() { 
		
		log.info("open all2.jsp");
	}
	@GetMapping("sign-up-complete")	
	public void sign3() { 
		log.info("open sign-up-complete");
	}
	
	@GetMapping("profile")	
	@PreAuthorize("isAuthenticated()")
	public void profile() { 
		log.info("profile");
	}
	
	@GetMapping("profile-edit")	
	@PreAuthorize("isAuthenticated()")
	public void profileEdit(Principal principal) { 
		System.out.println("username = " + principal.getName());
		log.info("profile-edit");
	}
	@PostMapping("profile-edit")	
	@PreAuthorize("isAuthenticated()")
	public String profileEditComplete(TableUserVO userVO, AttachVO attachVO, RedirectAttributes rttr) { 
		userService.editUserInfo(userVO);
		log.info("profile-edit-complete");
		return "redirect:/main/profile";
	}
	
	@GetMapping("ckinfo")	
	public void ckinfo() { 
		log.info("ckinfo");
	}
	@GetMapping("openinfo")	
	public void openinfo() { 
		log.info("openinfo");
	}
}
