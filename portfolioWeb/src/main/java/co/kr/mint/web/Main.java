package co.kr.mint.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {
	
	@RequestMapping("/main")
	public String Main() {
		return"index";
	}
}
