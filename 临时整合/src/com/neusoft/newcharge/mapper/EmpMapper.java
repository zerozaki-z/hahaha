package com.neusoft.newcharge.mapper;

import java.util.List;

import com.neusoft.newcharge.po.Emp;

public interface EmpMapper {
	public List<Emp> findAll() throws Exception;
	public void save(String ename) throws Exception;
}
