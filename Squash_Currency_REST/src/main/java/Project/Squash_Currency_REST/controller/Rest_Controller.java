package Project.Squash_Currency_REST.controller;

import java.io.IOException;

import org.jdom2.JDOMException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Project.Squash_Currency_REST.parser.JDOM_Parser;

@RestController
public class Rest_Controller {

	@GetMapping("/rest")
	public String getActualCurrency() throws JDOMException, IOException {
		
		JDOM_Parser jp=new JDOM_Parser();
		String currency=jp.getCurrency(); 
		
		return currency;
		
	}
	
}
