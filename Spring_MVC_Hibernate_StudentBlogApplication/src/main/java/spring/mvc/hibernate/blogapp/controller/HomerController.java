package spring.mvc.hibernate.blogapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomerController {

	@RequestMapping("/")
	public String loginPage()
	{
		return "loginPage";
	}
}
