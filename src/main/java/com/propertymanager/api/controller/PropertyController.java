package com.propertymanager.api.controller;

import com.propertymanager.api.model.Property;
import com.propertymanager.api.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/properties")
public class PropertyController {

	@Autowired
	private PropertyService propertyService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Property> getProperties() {
		return propertyService.getAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Property getProperty(@PathVariable("id") String id) {
		return propertyService.get(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void addProperty(@RequestBody Property property) {
		propertyService.add(property);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteProperty(@PathVariable("id") String id) {
		propertyService.delete(id);
	}
}


