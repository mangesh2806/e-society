// default package
// Generated Nov 13, 2015 2:04:17 PM by Hibernate Tools 3.4.0.CR1
package com.e_society.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UserType generated by hbm2java
 */
@Entity
@Table(name = "user_type", catalog = "e_society")
public class UserType implements java.io.Serializable {

	private int userTypeId;
	private String userType;

	public UserType() {
	}

	public UserType(int userTypeId) {
		this.userTypeId = userTypeId;
	}

	public UserType(int userTypeId, String userType) {
		this.userTypeId = userTypeId;
		this.userType = userType;
	}

	@Id
	@Column(name = "user_type_id", unique = true, nullable = false)
	public int getUserTypeId() {
		return this.userTypeId;
	}

	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}

	@Column(name = "user_type", length = 45)
	public String getUserType() {
		System.out.println("1234555");
		return this.userType;
	}

	public void setUserType(String userType) {
		System.out.println("12345558888888888");
		this.userType = userType;
	}

}