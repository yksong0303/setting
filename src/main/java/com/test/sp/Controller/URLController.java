package com.test.sp.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class URLController {
	@GetMapping("/views/**")
	public String goPage(HttpServletRequest req) {
		return req.getRequestURI().substring(7);
	}
	@GetMapping("/")
	public String goHome() {
		return "home";
	}
}
