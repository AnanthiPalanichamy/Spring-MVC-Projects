package com.mvc.example;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MomsHotel {
	
	@RequestMapping("/order")
	public String getOrder()
	{
		return"welcomepage";
	}
    
	@RequestMapping("/getItem")
	public String getItem()
	{
	//  String userinput= request.getParameter("item");
	 // model.addAttribute("userinputvalue",userinput);
		return"getitem";
	}
}
