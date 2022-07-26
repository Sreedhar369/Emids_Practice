package com.emids.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emids.Model.Test;
import com.emids.Service.TestServiceInterf;

@RestController
@RequestMapping("/controller")
public class TestController {

	@Autowired
	private TestServiceInterf service;
	
	@PostMapping("/save")
	public String saveData(@RequestBody Test t) {
		 service.saveData(t);	
		 return "Data saved Successfully";
	}
	
	@GetMapping("/get")
	public List<Test> getData(){		
		return service.getData();
	}
	
	@DeleteMapping("/delete")
	public String deleteData(@RequestParam int id) {		
		service.deleteData(id);
		return "Deleted Successfully";
	}
	
	
}
