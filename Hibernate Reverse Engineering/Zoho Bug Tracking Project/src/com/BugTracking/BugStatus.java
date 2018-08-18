package com.BugTracking;
// Generated 30 May, 2018 4:11:36 PM by Hibernate Tools 5.3.0.Beta2

/**
 * BugStatus generated by hbm2java
 */
public class BugStatus implements java.io.Serializable {

	private long bugStatusId;
	private Bug bug;
	private String statusOfBugIs;

	public BugStatus() {
	}

	public BugStatus(long bugStatusId) {
		this.bugStatusId = bugStatusId;
	}

	public BugStatus(long bugStatusId, Bug bug, String statusOfBugIs) {
		this.bugStatusId = bugStatusId;
		this.bug = bug;
		this.statusOfBugIs = statusOfBugIs;
	}

	public long getBugStatusId() {
		return this.bugStatusId;
	}

	public void setBugStatusId(long bugStatusId) {
		this.bugStatusId = bugStatusId;
	}

	public Bug getBug() {
		return this.bug;
	}

	public void setBug(Bug bug) {
		this.bug = bug;
	}

	public String getStatusOfBugIs() {
		return this.statusOfBugIs;
	}

	public void setStatusOfBugIs(String statusOfBugIs) {
		this.statusOfBugIs = statusOfBugIs;
	}

}