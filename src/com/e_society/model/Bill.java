package com.e_society.model;

import javax.persistence.Transient;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="bill")
public class Bill 
{
	@Id
	@Column(name = "memberId", unique = true, nullable = false, length = 45)
	private String memberId;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdOn", length = 0)
	private Date createdOn;
	
	@Column(name="bmcTax")
	private int bmcTax;
	
	@Column(name="waterChargers")
	private int waterChargers;
	
	@Column(name="subletCharges")
	private int subletCharges;

	@Column(name="sinkingFund")
	private int sinkingFund;
	
	
	@Column(name="insuranceCharger")
	private int insuranceCharger;
	
	@Column(name="conveyance")
	private int conveyance;
	
	@Column(name="maintainceCharger")
	private int maintainceCharger;
	
	@Column(name="parkingCharge")
	private int parkingCharge;
	
	@Column(name="repairFund")
	private int repairFund;
	
	@Column(name="others")
	private int others;
	
	
	@Column(name="arrears")
	private int arrears;
	
	@Column(name="interestOnArrears")
	private int interestOnArrears;
	
	@Transient
	private double area;
	
	@Transient
	private int maintenanceRate;

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public int getBmcTax() {
		return bmcTax;
	}

	public void setBmcTax(int bmcTax) {
		this.bmcTax = bmcTax;
	}

	public int getWaterChargers() {
		return waterChargers;
	}

	public void setWaterChargers(int waterChargers) {
		this.waterChargers = waterChargers;
	}

	public int getSubletCharges() {
		return subletCharges;
	}

	public void setSubletCharges(int subletCharges) {
		this.subletCharges = subletCharges;
	}

	public int getSinkingFund() {
		return sinkingFund;
	}

	public void setSinkingFund(int sinkingFund) {
		this.sinkingFund = sinkingFund;
	}

	public int getInsuranceCharger() {
		return insuranceCharger;
	}

	public void setInsuranceCharger(int insuranceCharger) {
		this.insuranceCharger = insuranceCharger;
	}

	public int getConveyance() {
		return conveyance;
	}

	public void setConveyance(int conveyance) {
		this.conveyance = conveyance;
	}

	public int getMaintainceCharger() {
		return maintainceCharger;
	}

	public void setMaintainceCharger(int maintainceCharger) {
		this.maintainceCharger = maintainceCharger;
	}

	public int getParkingCharge() {
		return parkingCharge;
	}

	public void setParkingCharge(int parkingCharge) {
		this.parkingCharge = parkingCharge;
	}

	public int getRepairFund() {
		return repairFund;
	}

	public void setRepairFund(int repairFund) {
		this.repairFund = repairFund;
	}

	public int getOthers() {
		return others;
	}

	public void setOthers(int others) {
		this.others = others;
	}

	public int getArrears() {
		return arrears;
	}

	public void setArrears(int arrears) {
		this.arrears = arrears;
	}

	public int getInterestOnArrears() {
		return interestOnArrears;
	}

	public void setInterestOnArrears(int interestOnArrears) {
		this.interestOnArrears = interestOnArrears;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getMaintenanceRate() {
		return maintenanceRate;
	}

	public void setMaintenanceRate(int maintenanceRate) {
		this.maintenanceRate = maintenanceRate;
	}
	
	}
