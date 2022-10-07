package com.quinnox.DeviceFarm.service;

import java.util.List;


import com.quinnox.DeviceFarm.entity.Mobile;


public interface MobileServiceInterface {

	public Mobile addMobile(Mobile mobile);

	public List<Mobile> getAllMobiles();

	public Mobile getmobileById(Long empidL);

	public void deletemobileById(Long mobileidL);
}
