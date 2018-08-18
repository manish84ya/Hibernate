package com.BugTracking;
// Generated 30 May, 2018 4:11:36 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Projects generated by hbm2java
 */
public class Projects implements java.io.Serializable {

	private long projectId;
	private Admin admin;
	private String endDate;
	private String projectOverview;
	private String projectOwner;
	private String projectTitle;
	private String startDate;
	private Set users = new HashSet(0);
	private Set milestones = new HashSet(0);

	public Projects() {
	}

	public Projects(long projectId) {
		this.projectId = projectId;
	}

	public Projects(long projectId, Admin admin, String endDate, String projectOverview, String projectOwner,
			String projectTitle, String startDate, Set users, Set milestones) {
		this.projectId = projectId;
		this.admin = admin;
		this.endDate = endDate;
		this.projectOverview = projectOverview;
		this.projectOwner = projectOwner;
		this.projectTitle = projectTitle;
		this.startDate = startDate;
		this.users = users;
		this.milestones = milestones;
	}

	public long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getProjectOverview() {
		return this.projectOverview;
	}

	public void setProjectOverview(String projectOverview) {
		this.projectOverview = projectOverview;
	}

	public String getProjectOwner() {
		return this.projectOwner;
	}

	public void setProjectOwner(String projectOwner) {
		this.projectOwner = projectOwner;
	}

	public String getProjectTitle() {
		return this.projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

	public Set getMilestones() {
		return this.milestones;
	}

	public void setMilestones(Set milestones) {
		this.milestones = milestones;
	}

}
