//package com.example.demo;
package com.app.shopping;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public Map<String, String> hello() {
		Map<String, String> test = new HashMap<>();
		test.put("Hello1", "こんにちは");
		test.put("Hello2", "こんにちは");
		test.put("Hello3", "こんにちは");
		return test;
	}
}
