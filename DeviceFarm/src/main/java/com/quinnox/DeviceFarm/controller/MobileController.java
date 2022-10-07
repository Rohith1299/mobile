package com.quinnox.DeviceFarm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.DeviceFarm.entity.Mobile;
import com.quinnox.DeviceFarm.service.MobileServiceInterface;

@RestController
@RequestMapping("/mobile")
public class MobileController {

	@Autowired
	private MobileServiceInterface mobileServiceInterface;
	
	@PostMapping("/add")
	public ResponseEntity<Mobile> addMobile(@RequestBody Mobile mobile){
		Mobile mobileSaved = mobileServiceInterface.addMobile(mobile);
		return new ResponseEntity<Mobile>(mobileSaved, HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity <HttpStatus> getAllMobiles(){
		
		//List<Mobile> listOfAllmobs = mobileServiceInterface.getAllMobiles();
		 this.mobileServiceInterface.getAllMobiles();
		 return new ResponseEntity <>(HttpStatus.OK);
				//ResponseEntity <Mobile>(listOfAllmobs, HttpStatus.OK);
	}
	
	@GetMapping("/mobile/{mobileid}")
	public ResponseEntity<Mobile> getEmpById(@PathVariable("mobileid") Long mobileidL){
		
		Mobile mobileRetrieved = mobileServiceInterface.getmobileById(mobileidL);
		return new ResponseEntity<Mobile>(mobileRetrieved, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{mobileid}")
	public ResponseEntity<Void> deletemobileById(@PathVariable("mobileid") Long mobileidL){
		
		mobileServiceInterface.deletemobileById(mobileidL);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Mobile> updateMobile(@RequestBody Mobile mobile){
		Mobile mobileSaved = mobileServiceInterface.addMobile(mobile);
		return new ResponseEntity<Mobile>(mobileSaved, HttpStatus.CREATED);
	}

	
	
}