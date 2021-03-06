package com.BugTracking;
// Generated 30 May, 2018 4:11:36 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Milestone generated by hbm2java
 */
public class Milestone implements java.io.Serializable {

	private long mileStoneId;
	private Projects projects;
	private String milestoneFlag;
	private String milestoneStatus;
	private String taskAssignDate;
	private String taskEndDate;
	private String taskName;
	private Set users = new HashSet(0);
	private Set affectedmilestones = new HashSet(0);
	private Set bugs = new HashSet(0);
	private Set milestonecomments = new HashSet(0);

	public Milestone() {
	}

	public Milestone(long mileStoneId) {
		this.mileStoneId = mileStoneId;
	}

	public Milestone(long mileStoneId, Projects projects, String milestoneFlag, String milestoneStatus,
			String taskAssignDate, String taskEndDate, String taskName, Set users, Set affectedmilestones, Set bugs,
			Set milestonecomments) {
		this.mileStoneId = mileStoneId;
		this.projects = projects;
		this.milestoneFlag = milestoneFlag;
		this.milestoneStatus = milestoneStatus;
		this.taskAssignDate = taskAssignDate;
		this.taskEndDate = taskEndDate;
		this.taskName = taskName;
		this.users = users;
		this.affectedmilestones = affectedmilestones;
		this.bugs = bugs;
		this.milestonecomments = milestonecomments;
	}

	public long getMileStoneId() {
		return this.mileStoneId;
	}

	public void setMileStoneId(long mileStoneId) {
		this.mileStoneId = mileStoneId;
	}

	public Projects getProjects() {
		return this.projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}

	public String getMilestoneFlag() {
		return this.milestoneFlag;
	}

	public void setMilestoneFlag(String milestoneFlag) {
		this.milestoneFlag = milestoneFlag;
	}

	public String getMilestoneStatus() {
		return this.milestoneStatus;
	}

	public void setMilestoneStatus(String milestoneStatus) {
		this.milestoneStatus = milestoneStatus;
	}

	public String getTaskAssignDate() {
		return this.taskAssignDate;
	}

	public void setTaskAssignDate(String taskAssignDate) {
		this.taskAssignDate = taskAssignDate;
	}

	public String getTaskEndDate() {
		return this.taskEndDate;
	}

	public void setTaskEndDate(String taskEndDate) {
		this.taskEndDate = taskEndDate;
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

	public Set getAffectedmilestones() {
		return this.affectedmilestones;
	}

	public void setAffectedmilestones(Set affectedmilestones) {
		this.affectedmilestones = affectedmilestones;
	}

	public Set getBugs() {
		return this.bugs;
	}

	public void setBugs(Set bugs) {
		this.bugs = bugs;
	}

	public Set getMilestonecomments() {
		return this.milestonecomments;
	}

	public void setMilestonecomments(Set milestonecomments) {
		this.milestonecomments = milestonecomments;
	}

}
