package com.quinnox.DeviceFarm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quinnox.DeviceFarm.entity.Mobile;

@Repository
public interface MobileRepository  extends JpaRepository<Mobile, Long>{

	List <Mobile> findAll();
	
	
}
