package com.BugTracking;
// Generated 30 May, 2018 4:11:36 PM by Hibernate Tools 5.3.0.Beta2

/**
 * Classification generated by hbm2java
 */
public class Classification implements java.io.Serializable {

	private long classificationId;
	private Bug bug;
	private String classificationType;

	public Classification() {
	}

	public Classification(long classificationId) {
		this.classificationId = classificationId;
	}

	public Classification(long classificationId, Bug bug, String classificationType) {
		this.classificationId = classificationId;
		this.bug = bug;
		this.classificationType = classificationType;
	}

	public long getClassificationId() {
		return this.classificationId;
	}

	public void setClassificationId(long classificationId) {
		this.classificationId = classificationId;
	}

	public Bug getBug() {
		return this.bug;
	}

	public void setBug(Bug bug) {
		this.bug = bug;
	}

	public String getClassificationType() {
		return this.classificationType;
	}

	public void setClassificationType(String classificationType) {
		this.classificationType = classificationType;
	}

}
