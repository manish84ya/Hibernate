package com.BugTracking;
// Generated 30 May, 2018 6:17:26 PM by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Bug generated by hbm2java
 */
@Entity
@Table(name = "bug", catalog = "bt2")
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

	@Id

	@Column(name = "Bug_ID", unique = true, nullable = false)
	public long getBugId() {
		return this.bugId;
	}

	public void setBugId(long bugId) {
		this.bugId = bugId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MileStone_ID")
	public Milestone getMilestone() {
		return this.milestone;
	}

	public void setMilestone(Milestone milestone) {
		this.milestone = milestone;
	}

	@Column(name = "Bug_Description")
	public String getBugDescription() {
		return this.bugDescription;
	}

	public void setBugDescription(String bugDescription) {
		this.bugDescription = bugDescription;
	}

	@Column(name = "Bug_Title")
	public String getBugTitle() {
		return this.bugTitle;
	}

	public void setBugTitle(String bugTitle) {
		this.bugTitle = bugTitle;
	}

	@Column(name = "Due_On")
	public String getDueOn() {
		return this.dueOn;
	}

	public void setDueOn(String dueOn) {
		this.dueOn = dueOn;
	}

	@Column(name = "fix_id")
	public Long getFixId() {
		return this.fixId;
	}

	public void setFixId(Long fixId) {
		this.fixId = fixId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bug")
	public Set getBugStatuses() {
		return this.bugStatuses;
	}

	public void setBugStatuses(Set bugStatuses) {
		this.bugStatuses = bugStatuses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bug")
	public Set getFlags() {
		return this.flags;
	}

	public void setFlags(Set flags) {
		this.flags = flags;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bug")
	public Set getAffectedmilestones() {
		return this.affectedmilestones;
	}

	public void setAffectedmilestones(Set affectedmilestones) {
		this.affectedmilestones = affectedmilestones;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bug")
	public Set getBugcomments() {
		return this.bugcomments;
	}

	public void setBugcomments(Set bugcomments) {
		this.bugcomments = bugcomments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bug")
	public Set getReproducibles() {
		return this.reproducibles;
	}

	public void setReproducibles(Set reproducibles) {
		this.reproducibles = reproducibles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bug")
	public Set getClassifications() {
		return this.classifications;
	}

	public void setClassifications(Set classifications) {
		this.classifications = classifications;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "bugs_user", catalog = "bt2", joinColumns = {
			@JoinColumn(name = "Bug_id_fk", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "User_ID_FK", nullable = false, updatable = false) })
	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bug")
	public Set getSeverities() {
		return this.severities;
	}

	public void setSeverities(Set severities) {
		this.severities = severities;
	}

}