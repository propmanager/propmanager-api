package com.propertymanager.api.controller;

import com.propertymanager.api.model.Tenant;
import com.propertymanager.api.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tenants")
public class TenantController {

	@Autowired
	private TenantService tenantService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Tenant> getProperties() {
		return tenantService.getAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Tenant getTenant(@PathVariable("id") String id) {
		return tenantService.get(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void addTenant(@RequestBody Tenant tenant) {
		tenantService.add(tenant);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteTenant(@PathVariable("id") String id) {
		tenantService.delete(id);
	}
}
