package com.BugTracking;
// Generated 30 May, 2018 4:11:36 PM by Hibernate Tools 5.3.0.Beta2

/**
 * Milestonecomment generated by hbm2java
 */
public class Milestonecomment implements java.io.Serializable {

	private long commentId;
	private Milestone milestone;
	private User user;
	private String commnet;

	public Milestonecomment() {
	}

	public Milestonecomment(long commentId) {
		this.commentId = commentId;
	}

	public Milestonecomment(long commentId, Milestone milestone, User user, String commnet) {
		this.commentId = commentId;
		this.milestone = milestone;
		this.user = user;
		this.commnet = commnet;
	}

	public long getCommentId() {
		return this.commentId;
	}

	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}

	public Milestone getMilestone() {
		return this.milestone;
	}

	public void setMilestone(Milestone milestone) {
		this.milestone = milestone;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCommnet() {
		return this.commnet;
	}

	public void setCommnet(String commnet) {
		this.commnet = commnet;
	}

}
