package cn.itcast.springboot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/fm")
public class UserController {
	@RequestMapping("/query/{userId}")
	public String queryId(@PathVariable("userId") Long userId, Map<String, Object> root) {
		System.out.println("query====================");
		root.put("userId", userId);
		root.put("userName", "黑马" + userId);
		return "user/list";
	};

	@RequestMapping("/query2/{userId}")
	public ModelAndView queryId2(@PathVariable("userId") Long userId) {
		System.out.println("query2====================");
		ModelAndView mav = new ModelAndView("user/list");
		mav.addObject("userId", userId);
		mav.addObject("userName", "传智播客" + userId);
		return mav;
	}
	
}
