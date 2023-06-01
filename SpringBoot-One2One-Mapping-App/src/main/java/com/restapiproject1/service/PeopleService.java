package com.restapiproject1.service;

import java.util.List;

import com.restapiproject1.model.People;

public interface PeopleService {

	void save(People People);
	void modify(People People);
	void deleteById(int id);
	People selectById(int id);
	List<People> selectAllEmployee();
	List<People> getAlPaginatedAndSorted(int pageNo, int sizeSize, String field);
}
