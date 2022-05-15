package com.gehc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("hello")
	public SampleView api() {

		return new SampleView();
	}
}
