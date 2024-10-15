package com.in28minutes.rest.webservice.restful_web_service.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

	// Use URI to version
	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPersion() {
		return new PersonV1("Bob Charlie");
	}

	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionOfPersion() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
}
