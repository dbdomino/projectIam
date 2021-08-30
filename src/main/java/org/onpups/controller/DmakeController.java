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
@RequestMapping("/dmake/*")
@RequiredArgsConstructor     // 이게있어야 서비스 final로 선언시 impl 과 연결시켜 자동매핑 
public class DmakeController {
	private final SampleService sampleService;
	
	@GetMapping("/home")	
	public String home(Model model) {
		log.info("open dmake home");
		model.addAttribute("zozo", sampleService.view(6));
		
		return "/dmake/home";
	}
	@GetMapping("qlist")	
	public void qlist() { 
		log.info("open qlist");
	}
	@GetMapping("chkmain")	
	public void chkmain() { 
		log.info("open chkmain");
	}
	@GetMapping("chkmine")	
	public void chkmine() { 
		log.info("chkmine");
	}
	@GetMapping("emotion")	
	public void emotion() { 
		log.info("emotion");
	}
	@GetMapping("dstress")	
	public void dstress() { 
		log.info("dstress");
	}
	@GetMapping("habit")	
	public void habit() { 
		log.info("habit");
	}
}
