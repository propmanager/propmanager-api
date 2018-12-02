package com.propertymanager.api.service;

import com.propertymanager.api.model.Tenant;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class TenantService implements CommonService<Tenant>{
	private Map<String, Tenant> tenantMap;

	@PostConstruct
	@Override
	public void init(){
		tenantMap = new HashMap<>();
	}

	@Override
	public void add(Tenant tenant)
	{
		String id = UUID.randomUUID().toString();
		tenant.setId(id);
		tenantMap.put(id, tenant);
	}

	@Override
	public void delete(String tenantId){
		tenantMap.remove(tenantId);
	}

	@Override
	public Tenant get(String tenantId){
		return tenantMap.get(tenantId);
	}

	@Override
	public List<Tenant> getAll(){
		List<Tenant> tenantList = new ArrayList<>();
		for(String key: tenantMap.keySet()){
			tenantList.add(tenantMap.get(key));
		}
		return tenantList;
	}
}
