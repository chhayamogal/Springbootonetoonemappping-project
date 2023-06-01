package com.restapiproject1.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapiproject1.model.Bank;
import com.restapiproject1.service.BankService;

@RestController
public class BankController {
@Autowired
private BankService bankService;
// insert
@PostMapping(value = "/bank")
public String addPeople(@RequestBody Bank bank) {
bankService.save(bank);
return "bank added successfully";
}
// update
@PutMapping(value = { "/bank" })
public String updatePeople(@RequestBody Bank bank) {
bankService.modify(bank);
return "people updated successfully";
}
// delete
@DeleteMapping(value = { "/bank" })
public String deletePeople(@RequestParam int id) {
System.out.println("first delete");
bankService.deleteById(id);
return "bank deleted successfully";
}
// delete by id
@DeleteMapping(value = { "/bank/{id}" })
public String deletePeople1(@PathVariable int id) {
System.out.println("second delete");
bankService.deleteById(id);
return "bank deleted successfully";
}
// get by id
@GetMapping(value = { "/bank/{id}" })
public Bank getEmployeeById(@PathVariable int id) {
return bankService.selectById(id);
}
// get all
@GetMapping(value = { "/bank" })
public List<Bank> getAllEmployee() {
return bankService.selectAllEmployee();
}
// get all in pages and sorted
@GetMapping("/bankPageAndSort")
public List<Bank> getAllPaginatedAndSorted(@RequestParam int pageNo,
@RequestParam int pageSize,
@RequestParam String field) {
return bankService.getAlPaginatedAndSorted(pageNo, pageSize, field);
}
}
