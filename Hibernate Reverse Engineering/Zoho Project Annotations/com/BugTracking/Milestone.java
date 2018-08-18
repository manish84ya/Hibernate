package com.BugTracking;
// Generated 30 May, 2018 6:17:26 PM by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Milestone generated by hbm2java
 */
@Entity
@Table(name = "milestone", catalog = "bt2")
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

	@Id

	@Column(name = "MileStone_ID", unique = true, nullable = false)
	public long getMileStoneId() {
		return this.mileStoneId;
	}

	public void setMileStoneId(long mileStoneId) {
		this.mileStoneId = mileStoneId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Project_Id")
	public Projects getProjects() {
		return this.projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}

	@Column(name = "Milestone_Flag")
	public String getMilestoneFlag() {
		return this.milestoneFlag;
	}

	public void setMilestoneFlag(String milestoneFlag) {
		this.milestoneFlag = milestoneFlag;
	}

	@Column(name = "Milestone_Status")
	public String getMilestoneStatus() {
		return this.milestoneStatus;
	}

	public void setMilestoneStatus(String milestoneStatus) {
		this.milestoneStatus = milestoneStatus;
	}

	@Column(name = "Task_Assign_Date")
	public String getTaskAssignDate() {
		return this.taskAssignDate;
	}

	public void setTaskAssignDate(String taskAssignDate) {
		this.taskAssignDate = taskAssignDate;
	}

	@Column(name = "Task_End_Date")
	public String getTaskEndDate() {
		return this.taskEndDate;
	}

	public void setTaskEndDate(String taskEndDate) {
		this.taskEndDate = taskEndDate;
	}

	@Column(name = "Task_Name")
	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "milestone")
	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "milestone")
	public Set getAffectedmilestones() {
		return this.affectedmilestones;
	}

	public void setAffectedmilestones(Set affectedmilestones) {
		this.affectedmilestones = affectedmilestones;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "milestone")
	public Set getBugs() {
		return this.bugs;
	}

	public void setBugs(Set bugs) {
		this.bugs = bugs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "milestone")
	public Set getMilestonecomments() {
		return this.milestonecomments;
	}

	public void setMilestonecomments(Set milestonecomments) {
		this.milestonecomments = milestonecomments;
	}

}