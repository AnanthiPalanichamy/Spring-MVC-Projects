package com.ananthi.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController {
	
	
	@RequestMapping("/bat")
	public String giveBat() {
		return "bat";
	}

}
