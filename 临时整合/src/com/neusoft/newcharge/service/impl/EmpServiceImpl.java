package com.neusoft.newcharge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.newcharge.mapper.EmpMapper;
import com.neusoft.newcharge.po.Emp;
import com.neusoft.newcharge.service.EmpService;


@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpMapper empMapper;
	

	@Transactional
	@Override
	public List<Emp> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<Emp> list = empMapper.findAll();
		return list;
	}

	@Transactional
	@Override
	public void save(String ename) throws Exception {
		// TODO Auto-generated method stub
		empMapper.save(ename);
	}
}
