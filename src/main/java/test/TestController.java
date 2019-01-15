package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/hello.action")
	@ResponseBody
	public String sayHello(String hello) {
		return "helloWorld";
	}
}
