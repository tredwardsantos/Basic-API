package com.pleasee.basic.helo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helocon {

	@RequestMapping("/helo")
	public String speak() {
		return "hleno";
	}
	
}
