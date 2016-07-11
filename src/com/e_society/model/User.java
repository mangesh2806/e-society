// default package

// Generated Dec 5, 2015 12:06:34 PM by Hibernate Tools 3.4.0.CR1

package com.e_society.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "e_society")
public class User implements java.io.Serializable {

	private String userId;
	private String userType;
	private Date createdOn;
	private String password;
	private String firstname;
	private String lastname;
	private String wing;
	private String flat;
	

	@Transient
	public String getWing() {
		return wing;
	}

	public void setWing(String wing) {
		this.wing = wing;
	}
	@Transient
	public String getFlat() {
		return flat;
	}

	public void setFlat(String flat) {
		this.flat = flat;
	}

	public User() {
	}

	public User(String userId) {
		this.userId = userId;
	}

	public User(String userId, String userType, Date createdOn,
			String password, String firstname, String lastname) {
		this.userId = userId;
		this.userType = userType;
		this.createdOn = createdOn;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		}

	@Id
	@Column(name = "user_id", unique = true, nullable = false, length = 10)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "user_type", length = 20)
	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on", length = 0)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "password", length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "firstname", length = 45)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "lastname", length = 45)
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	}
