package com.BugTracking;
// Generated 30 May, 2018 4:11:36 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Bug generated by hbm2java
 */
public class Bug implements java.io.Serializable {

	private long bugId;
	private Milestone milestone;
	private String bugDescription;
	private String bugTitle;
	private String dueOn;
	private Long fixId;
	private Set bugStatuses = new HashSet(0);
	private Set flags = new HashSet(0);
	private Set affectedmilestones = new HashSet(0);
	private Set bugcomments = new HashSet(0);
	private Set reproducibles = new HashSet(0);
	private Set classifications = new HashSet(0);
	private Set users = new HashSet(0);
	private Set severities = new HashSet(0);

	public Bug() {
	}

	public Bug(long bugId) {
		this.bugId = bugId;
	}

	public Bug(long bugId, Milestone milestone, String bugDescription, String bugTitle, String dueOn, Long fixId,
			Set bugStatuses, Set flags, Set affectedmilestones, Set bugcomments, Set reproducibles, Set classifications,
			Set users, Set severities) {
		this.bugId = bugId;
		this.milestone = milestone;
		this.bugDescription = bugDescription;
		this.bugTitle = bugTitle;
		this.dueOn = dueOn;
		this.fixId = fixId;
		this.bugStatuses = bugStatuses;
		this.flags = flags;
		this.affectedmilestones = affectedmilestones;
		this.bugcomments = bugcomments;
		this.reproducibles = reproducibles;
		this.classifications = classifications;
		this.users = users;
		this.severities = severities;
	}

	public long getBugId() {
		return this.bugId;
	}

	public void setBugId(long bugId) {
		this.bugId = bugId;
	}

	public Milestone getMilestone() {
		return this.milestone;
	}

	public void setMilestone(Milestone milestone) {
		this.milestone = milestone;
	}

	public String getBugDescription() {
		return this.bugDescription;
	}

	public void setBugDescription(String bugDescription) {
		this.bugDescription = bugDescription;
	}

	public String getBugTitle() {
		return this.bugTitle;
	}

	public void setBugTitle(String bugTitle) {
		this.bugTitle = bugTitle;
	}

	public String getDueOn() {
		return this.dueOn;
	}

	public void setDueOn(String dueOn) {
		this.dueOn = dueOn;
	}

	public Long getFixId() {
		return this.fixId;
	}

	public void setFixId(Long fixId) {
		this.fixId = fixId;
	}

	public Set getBugStatuses() {
		return this.bugStatuses;
	}

	public void setBugStatuses(Set bugStatuses) {
		this.bugStatuses = bugStatuses;
	}

	public Set getFlags() {
		return this.flags;
	}

	public void setFlags(Set flags) {
		this.flags = flags;
	}

	public Set getAffectedmilestones() {
		return this.affectedmilestones;
	}

	public void setAffectedmilestones(Set affectedmilestones) {
		this.affectedmilestones = affectedmilestones;
	}

	public Set getBugcomments() {
		return this.bugcomments;
	}

	public void setBugcomments(Set bugcomments) {
		this.bugcomments = bugcomments;
	}

	public Set getReproducibles() {
		return this.reproducibles;
	}

	public void setReproducibles(Set reproducibles) {
		this.reproducibles = reproducibles;
	}

	public Set getClassifications() {
		return this.classifications;
	}

	public void setClassifications(Set classifications) {
		this.classifications = classifications;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

	public Set getSeverities() {
		return this.severities;
	}

	public void setSeverities(Set severities) {
		this.severities = severities;
	}

}