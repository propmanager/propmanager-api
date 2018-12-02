package com.propertymanager.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TenantController {

	@RequestMapping("/property")
	public String getTenantById(@RequestParam(value = "id") String id) {
		return "Tenant " + id;
	}
}
