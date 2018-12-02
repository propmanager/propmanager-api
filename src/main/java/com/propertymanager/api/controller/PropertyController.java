package com.propertymanager.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController {

	@RequestMapping("/property")
	public String getPropertyById(@RequestParam(value = "id") String id) {
		return "Property " + id;
	}
}


