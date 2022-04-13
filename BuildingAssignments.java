package com.example.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="building_locations")
public class BuildingAssignments {

	@Id
	@Column(name="employee_number")
	public int employeenumb;
	@Column(name="buildingID")
	public String buildingname;
	@Column(name="building_address")
	public String buildingadd;
	
	public int getEmployeenumb() {
		return employeenumb;
	}
	public void setEmployeenumb(int employeenumb) {
		this.employeenumb = employeenumb;
	}
	public String getBuildingname() {
		return buildingname;
	}
	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
	}
	public String getBuildingadd() {
		return buildingadd;
	}
	public void setBuildingadd(String buildingadd) {
		this.buildingadd = buildingadd;
	}
	
	@Override
	public String toString() {
		return "BuildingAssignments [employeenumb=" + employeenumb + ", buildingname=" + buildingname + ", buildingadd="
				+ buildingadd + "]";
	}
	
	
	
}
