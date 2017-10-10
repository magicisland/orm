package org.javabrains.koushik.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue
	public int vehicleId;
	
	@Column
	public String vehicleName;
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	public Vehicle(){
		
	}
}
