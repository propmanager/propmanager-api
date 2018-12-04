package com.propertymanager.api.service;

import java.util.List;

public interface CommonService<E> {
	void init();
	void add(E item);
	void delete(String propertyId);
	E get(String propertyId);
	List<E> getAll();
}
