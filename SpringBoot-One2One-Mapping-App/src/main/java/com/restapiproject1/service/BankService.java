package com.restapiproject1.service;
import java.util.List;

import com.restapiproject1.model.Bank;

public interface BankService {
void save(Bank bank);
void modify(Bank bank);
void deleteById(int id);
Bank selectById(int id);
List<Bank> selectAllEmployee();
List<Bank> getAlPaginatedAndSorted(int pageNo, int sizeSize, String field);

}
