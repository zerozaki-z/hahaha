package com.neusoft.newcharge.service;

import java.util.List;

import com.neusoft.newcharge.vo.VInputFreelisten;
import com.neusoft.newcharge.vo.VOutputFreelisten;

public interface FreelistenService 
{
	public boolean addFreelisten(VInputFreelisten vif);
	public boolean editFreelisten(VInputFreelisten vif);
	public boolean deleteFreelisten(VInputFreelisten vif);
	public List<VOutputFreelisten> showFreelisten();
}
