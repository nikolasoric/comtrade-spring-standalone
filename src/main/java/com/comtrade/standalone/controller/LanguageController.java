package com.comtrade.standalone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.comtrade.standalone.entity.Language;
import com.comtrade.standalone.services.LanguageService;
@Controller
@RequestMapping(value = { "", "language"})
public class LanguageController {
	
	@Autowired
	private LanguageService languageService;
	
	@RequestMapping("/")
	public String home() {
		return "index.html";
	}
	@RequestMapping(value="addLanguage", method = RequestMethod.GET) //ADD Language
	public String addLanguage(Language language) {
		languageService.save(language);
		return "index.html";
	}

	@RequestMapping(value = "hello", method= RequestMethod.GET) // Return Translation
	public ModelAndView hello(@RequestParam String name) {
		ModelAndView mv = new ModelAndView("hello.html");
		Language language = languageService.findByName(name);
		mv.addObject(language);
		return mv;
	}
}
