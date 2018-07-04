package com.neusoft.newcharge.service;

import java.util.List;

import com.neusoft.newcharge.po.Emp;

public interface EmpService {
	public List<Emp> findAll() throws Exception;
	public void save(String ename) throws Exception;
}
