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
@RequestMapping("/meal/*")
@RequiredArgsConstructor     // 이게있어야 서비스 final로 선언시 impl 과 연결시켜 자동매핑 
public class MealController {
	private final SampleService sampleService;
	
	@GetMapping("/home")	
	public String home(Model model) {
		log.info("open meal home");
		model.addAttribute("zozo", sampleService.view(6));
		
		return "/meal/home";
	}
	@GetMapping("mealbook")	
	public void mealbook() { 
		log.info("open mealbook");
	}
	@GetMapping("mealdiary")	
	public void mealdiary() { 
		log.info("open mealdiary");
	}
	@GetMapping("mealdiaryedit")	
	public void mealdiaryedit() { 
		log.info("mealdiaryedit");
	}
	@GetMapping("meallist")	
	public void meallist() { 
		log.info("meallist");
	}
	@GetMapping("mealpunk")	
	public void mealpunk() { 
		log.info("mealpunk");
	}
	@GetMapping("mealstat")	
	public void mealstat() { 
		log.info("mealstat");
	}
	@GetMapping("recipe")	
	public void recipe() { 
		log.info("recipe");
	}
	@GetMapping("recipeedit")	
	public void recipeedit() { 
		log.info("recipeedit");
	}
}
