package org.onpups.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.onpups.domain.ZozoVO;
import org.onpups.service.SampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/main/*")
@RequiredArgsConstructor     // 이게있어야 서비스 final로 선언시 impl 과 연결시켜 자동매핑 
public class MainController {
	private final SampleService sampleService;
	
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
	@GetMapping("sign-up-complete")	
	public void sign3() { 
		log.info("open sign-up-complete");
	}
	@GetMapping("password-reset")	
	public void passwordReset() { 
		log.info("password-reset");
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
