package com.autoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value = "/App")
public class autoappController {

	@GetMapping(value = "/show")
	public String show() {
		return "Welcome Bharathi";
	}

}
