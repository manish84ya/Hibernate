package com.BugTracking;
// Generated 30 May, 2018 4:11:36 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private long userId;
	private Milestone milestone;
	private Projects projects;
	private String firstName;
	private String lastName;
	private String userPassword;
	private String userDesignation;
	private String userEmailId;
	private String username;
	private String dateOfJoining;
	private Set bugcomments = new HashSet(0);
	private Set bugs = new HashSet(0);
	private Set events = new HashSet(0);
	private Set milestonecomments = new HashSet(0);

	public User() {
	}

	public User(long userId) {
		this.userId = userId;
	}

	public User(long userId, Milestone milestone, Projects projects, String firstName, String lastName,
			String userPassword, String userDesignation, String userEmailId, String username, String dateOfJoining,
			Set bugcomments, Set bugs, Set events, Set milestonecomments) {
		this.userId = userId;
		this.milestone = milestone;
		this.projects = projects;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userPassword = userPassword;
		this.userDesignation = userDesignation;
		this.userEmailId = userEmailId;
		this.username = username;
		this.dateOfJoining = dateOfJoining;
		this.bugcomments = bugcomments;
		this.bugs = bugs;
		this.events = events;
		this.milestonecomments = milestonecomments;
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Milestone getMilestone() {
		return this.milestone;
	}

	public void setMilestone(Milestone milestone) {
		this.milestone = milestone;
	}

	public Projects getProjects() {
		return this.projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserDesignation() {
		return this.userDesignation;
	}

	public void setUserDesignation(String userDesignation) {
		this.userDesignation = userDesignation;
	}

	public String getUserEmailId() {
		return this.userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDateOfJoining() {
		return this.dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Set getBugcomments() {
		return this.bugcomments;
	}

	public void setBugcomments(Set bugcomments) {
		this.bugcomments = bugcomments;
	}

	public Set getBugs() {
		return this.bugs;
	}

	public void setBugs(Set bugs) {
		this.bugs = bugs;
	}

	public Set getEvents() {
		return this.events;
	}

	public void setEvents(Set events) {
		this.events = events;
	}

	public Set getMilestonecomments() {
		return this.milestonecomments;
	}

	public void setMilestonecomments(Set milestonecomments) {
		this.milestonecomments = milestonecomments;
	}

}