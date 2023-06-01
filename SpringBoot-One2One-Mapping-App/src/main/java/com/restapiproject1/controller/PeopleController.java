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

import com.restapiproject1.model.People;
import com.restapiproject1.service.PeopleService;

@RestController
public class PeopleController {
@Autowired
private PeopleService peopleService;
// insert
@PostMapping(value = "/people")
public String addPeople(@RequestBody People People) {
peopleService.save(People);
return "People added successfully";
}
// update
@PutMapping(value = { "/people" })
public String updatePeople(@RequestBody People people) {
peopleService.modify(people);
return "people updated successfully";
}
// delete
@DeleteMapping(value = { "/people" })
public String deletePeople(@RequestParam int id) {
System.out.println("first delete");
peopleService.deleteById(id);
return "people deleted successfully";
}
// delete by id
@DeleteMapping(value = { "/people/{id}" })
public String deletePeople1(@PathVariable int id) {
System.out.println("second delete");
peopleService.deleteById(id);
return "people deleted successfully";
}
// get by id
@GetMapping(value = { "/people/{id}" })
public People getEmployeeById(@PathVariable int id) {
return peopleService.selectById(id);
}
// get all
@GetMapping(value = { "/people" })
public List<People> getAllEmployee() {
return peopleService.selectAllEmployee();
}
// get all in pages and sorted
@GetMapping("/peoplePageAndSort")
public List<People> getAllPaginatedAndSorted(@RequestParam int pageNo,
@RequestParam int pageSize,
@RequestParam String field) {
return peopleService.getAlPaginatedAndSorted(pageNo, pageSize, field);
}
}

