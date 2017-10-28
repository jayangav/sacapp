package jay.first.allsacapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class pagecontroller {
	
	@RequestMapping(value = {"/","/home","/index"})
	
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","home");
		mv.addObject("userClickHome","true");
		return mv;
		
	}
	
//	@RequestMapping(value ="/test")
//public ModelAndView test(@RequestParam("greeting")String greeting ) {
//		
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting",greeting);
//		return mv;
//		
//	}
	
@RequestMapping(value = {"/gallery"})
	
	public ModelAndView gallery() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Gallery");
		mv.addObject("userClickgallery",true);
		return mv;
		
		
}	


@RequestMapping(value = {"/content1"})

public ModelAndView content1() {
	
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title","Home");
	mv.addObject("userClickcontent1",true);
	return mv;

}

}

