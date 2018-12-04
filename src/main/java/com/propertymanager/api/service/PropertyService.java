package com.propertymanager.api.service;

import com.propertymanager.api.model.Property;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class PropertyService implements CommonService<Property>{
	private Map<String, Property> propertyMap;

	@PostConstruct
	@Override
	public void init(){
		propertyMap = new HashMap<>();
	}

	@Override
	public void add(Property property)
	{
		String id = UUID.randomUUID().toString();
		property.setId(id);
		propertyMap.put(id, property);
	}

	@Override
	public void delete(String propertyId){
		propertyMap.remove(propertyId);
	}

	@Override
	public Property get(String propertyId){
		return propertyMap.get(propertyId);
	}

	@Override
	public List<Property> getAll(){
		List<Property> propertyList = new ArrayList<>();
		for(String key: propertyMap.keySet()){
			propertyList.add(propertyMap.get(key));
		}
		return propertyList;
	}
}
