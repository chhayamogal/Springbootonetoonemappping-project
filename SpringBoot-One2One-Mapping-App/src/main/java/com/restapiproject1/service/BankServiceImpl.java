package com.restapiproject1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.restapiproject1.Dao.BankDao;
import com.restapiproject1.model.Bank;


@Service
public class BankServiceImpl implements BankService {
@Autowired
private BankDao bankDao;


public void deleteById(int id) {
bankDao.deleteById(id);
}
@Override
public Bank selectById(int id) {
Optional<Bank> opt = bankDao.findById(id);
if (opt.isPresent()) {
return opt.get();
}
return null;
}
@Override
public List<Bank> selectAllEmployee() {
Iterable<Bank> itr = bankDao.findAll();
List<Bank> lst = new ArrayList<Bank>();
itr.forEach(ele -> lst.add(ele));
return lst;
}
@Override
public List<Bank> getAlPaginatedAndSorted(int pageNo, int sizeSize, String field) {
Pageable p = PageRequest.of(pageNo, sizeSize, Direction.ASC, field);
return bankDao.findAll(p).toList();
}
@Override
public void save(Bank bank) {
	bankDao.save(bank);
	
}
@Override
public void modify(Bank bank) {
	bankDao.save(bank);
	
}
}
