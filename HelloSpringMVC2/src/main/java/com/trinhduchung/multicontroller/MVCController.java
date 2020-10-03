package com.trinhduchung.multicontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVCController {
	@RequestMapping("/mvc")
	public ModelAndView showMVC()
	{
		ModelAndView mv = new ModelAndView("view_mvc");
		return mv;
	}
	//dung hung
	@RequestMapping("/boot")
	public ModelAndView showBoot()
	{
		ModelAndView mv = new ModelAndView("view_boot");
		return mv;
	}
}
