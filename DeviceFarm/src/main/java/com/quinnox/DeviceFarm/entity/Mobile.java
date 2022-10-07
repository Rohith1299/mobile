package com.quinnox.DeviceFarm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "mobile")
public class Mobile {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private Long id;
	
	private String typeofdevice;
	private String deviceid;
	private String manufacturer;
	private String make;
	private String model;
	private String os;
	private String dateofpurchase;
	private String currentclient;
	private String serialnumber;
	private String locationofhosting;
	private String status;
	private String ipaddress;
	private String phonenumber;
	private String byod;
	

	public String getTypeofdevice() {
		return typeofdevice;
	}

	public void setTypeofdevice(String typeofdevice) {
		this.typeofdevice = typeofdevice;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getDateofpurchase() {
		return dateofpurchase;
	}

	public void setDateofpurchase(String dateofpurchase) {
		this.dateofpurchase = dateofpurchase;
	}

	public String getCurrentclient() {
		return currentclient;
	}

	public void setCurrentclient(String currentclient) {
		this.currentclient = currentclient;
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	public String getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}

	public String getLocationofhosting() {
		return locationofhosting;
	}

	public void setLocationofhosting(String locationofhosting) {
		this.locationofhosting = locationofhosting;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getByod() {
		return byod;
	}

	public void setByod(String byod) {
		this.byod = byod;
	}

	public Mobile add(Mobile mobile) {
		// TODO Auto-generated method stub
		return mobile;
	}

	public Mobile save(Mobile mobile) {
		// TODO Auto-generated method stub
		return mobile;
	}

}
