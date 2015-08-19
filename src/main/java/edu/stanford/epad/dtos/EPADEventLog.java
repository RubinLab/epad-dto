package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.Date;

import org.apache.log4j.Level;

import com.google.gson.Gson;

public class EPADEventLog implements Serializable
{
	private static final long serialVersionUID = 1L;

	String createdTime;
	String username;
	String projectID;
	String subjectUID;
	String studyUID;
	String seriesUID;
	String imageUID;
	String aimID;
	String filename;
	String function;
	String params;
	
	public EPADEventLog(String createdTime, String username, String projectID,
			String subjectUID, String studyUID, String seriesUID,
			String imageUID, String aimID, String function, String params) {
		super();
		this.createdTime = createdTime;
		this.username = username;
		this.projectID = projectID;
		this.subjectUID = subjectUID;
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.imageUID = imageUID;
		this.aimID = aimID;
		this.function = function;
		this.params = params;
	}
	
	public EPADEventLog(String createdTime, String username, String projectID,
			String subjectUID, String studyUID, String seriesUID,
			String imageUID, String aimID, String filename, String function, String params) {
		super();
		this.createdTime = createdTime;
		this.username = username;
		this.projectID = projectID;
		this.subjectUID = subjectUID;
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.imageUID = imageUID;
		this.aimID = aimID;
		this.filename = filename;
		this.function = function;
		this.params = params;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
