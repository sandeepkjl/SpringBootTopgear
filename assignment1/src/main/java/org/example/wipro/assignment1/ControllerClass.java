package org.example.wipro.assignment1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@RequestMapping(value="/getBankName", method=RequestMethod.GET)
	public String displayBankName()
	{
		
		return "HDFC Bank";
		
	}
	
	@RequestMapping(value="/getBankAddress", method=RequestMethod.GET)
	public String displayBankAddress()
	{
		
		return "Hinjewadi Pune";
		
	}
	

}
