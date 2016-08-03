package com.e_society.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "notice", catalog = "e_society")
public class Notice implements Serializable {
	
	private int noticeId;
	private String description;
	private Date notice_date;
	private String createdBy;
	private Date createdon;
	
	@Id
	@Column(name = "noticeId", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}
	
	@Column(name = "description", length = 200)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "notice_date", length = 0)
	public Date getNotice_date() {
		return notice_date;
	}
	public void setNotice_date(Date notice_date) {
		this.notice_date = notice_date;
	}
	
	@Column(name = "createdBy", length = 45)
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "createdOn", length = 0)
	public Date getCreatedon() {
		return createdon;
	}
	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}	

}
