package com.BugTracking;
// Generated 30 May, 2018 4:11:36 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Admin generated by hbm2java
 */
public class Admin implements java.io.Serializable {

	private long adminId;
	private String adminCompanyName;
	private String adminEmailId;
	private String adminName;
	private Set events = new HashSet(0);
	private Set projectses = new HashSet(0);

	public Admin() {
	}

	public Admin(long adminId) {
		this.adminId = adminId;
	}

	public Admin(long adminId, String adminCompanyName, String adminEmailId, String adminName, Set events,
			Set projectses) {
		this.adminId = adminId;
		this.adminCompanyName = adminCompanyName;
		this.adminEmailId = adminEmailId;
		this.adminName = adminName;
		this.events = events;
		this.projectses = projectses;
	}

	public long getAdminId() {
		return this.adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}

	public String getAdminCompanyName() {
		return this.adminCompanyName;
	}

	public void setAdminCompanyName(String adminCompanyName) {
		this.adminCompanyName = adminCompanyName;
	}

	public String getAdminEmailId() {
		return this.adminEmailId;
	}

	public void setAdminEmailId(String adminEmailId) {
		this.adminEmailId = adminEmailId;
	}

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public Set getEvents() {
		return this.events;
	}

	public void setEvents(Set events) {
		this.events = events;
	}

	public Set getProjectses() {
		return this.projectses;
	}

	public void setProjectses(Set projectses) {
		this.projectses = projectses;
	}

}