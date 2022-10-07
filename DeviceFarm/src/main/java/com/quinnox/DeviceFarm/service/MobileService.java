package com.quinnox.DeviceFarm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.DeviceFarm.entity.Mobile;
import com.quinnox.DeviceFarm.repository.MobileRepository;
import com.quinnox.DeviceFarm.service.MobileServiceInterface;


@Service
public abstract class MobileService implements MobileServiceInterface{
	
	@Autowired
	private MobileRepository mobile;

	@Override
	public Mobile addMobile(Mobile mobile) {
		Mobile savedMobile = mobile.save(mobile);
		return savedMobile;
		
	}

	@Override
	public List<Mobile> getAllMobiles() {
		return mobile.findAll();
	}

	@Override
	public Mobile getmobileById(Long mobileidL) {
		return mobile.findById(mobileidL).get();
	}

	public void deleteMobileById(Long mobileidL) {
		mobile.deleteById(mobileidL);
	}
    

}
