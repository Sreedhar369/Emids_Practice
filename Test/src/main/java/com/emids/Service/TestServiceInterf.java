package com.emids.Service;

import java.util.List;

import com.emids.Model.Test;
import com.emids.Model.TestVO;

public interface TestServiceInterf {
  
	public Test saveData(Test t);
	public List<Test> getData();
	public void deleteData(int id);
	public String updateData();
}
