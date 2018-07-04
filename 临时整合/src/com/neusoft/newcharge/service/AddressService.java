package com.neusoft.newcharge.service;

import java.util.List;

import com.neusoft.newcharge.vo.VInputAddress;
import com.neusoft.newcharge.vo.VOutputAddress;

public interface AddressService {
	public boolean addAddress(VInputAddress via);
	public boolean deleteAddress(VInputAddress via);
	public boolean editAddress(VInputAddress via);
	public List<VOutputAddress> showAddress();
}
