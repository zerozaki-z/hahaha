package com.neusoft.newcharge.service;

import java.util.List;

import com.neusoft.newcharge.vo.VInputTeacher;
import com.neusoft.newcharge.vo.VOutputTeacher;

public interface TeacherService {
	public boolean addTeacher(VInputTeacher vit);
	public boolean deleteTeacher(VInputTeacher vit);
	public boolean editTeacher(VInputTeacher vit);
	public List<VOutputTeacher> showTeacher();
	
	

}
