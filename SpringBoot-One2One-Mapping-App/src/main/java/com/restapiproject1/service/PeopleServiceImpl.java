package com.restapiproject1.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.restapiproject1.Dao.PeopleDao;
import com.restapiproject1.model.People;

@Service
public class PeopleServiceImpl implements PeopleService {
@Autowired
private PeopleDao peopleDao;

@Override
public void deleteById(int id) {
peopleDao.deleteById(id);
}
@Override
public People selectById(int id) {
Optional<People> opt = peopleDao.findById(id);
if (opt.isPresent()) {
return opt.get();
}
return null;
}
@Override
public List<People> selectAllEmployee() {
Iterable<People> itr = peopleDao.findAll();
List<People> lst = new ArrayList<People>();
itr.forEach(ele -> lst.add(ele));
return lst;
}
@Override
public List<People> getAlPaginatedAndSorted(int pageNo, int sizeSize, String field) {
Pageable p = PageRequest.of(pageNo, sizeSize, Direction.ASC, field);
return peopleDao.findAll(p).toList();
}
@Override
public void save(People People) {
	peopleDao.save(People);
	
}
@Override
public void modify(People People) {
	peopleDao.save(People);
	
}
}