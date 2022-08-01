package com.emids.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emids.Model.Test;
import com.emids.Repository.TestRepository;

@Service
public class TestService implements TestServiceInterf{

	@Autowired
	private TestRepository repo;
	@Override
	public Test saveData(Test t) {
		return repo.save(t)	;
	}

	@Override
	public List<Test> getData() {

		return repo.findAll();
	}

	@Override
	public void deleteData(int id) {
		
		 repo.deleteById(id);
	}

	@Override
	public String updateData() {
		// TODO Auto-generated method stub
		return "Data updated Successfully";
	}

}
