package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.Date;

import com.google.gson.Gson;

public class EPADAIM implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String aimID;
	public final String userName;
	public final String projectID, subjectID, studyUID, seriesUID, imageUID;
	public final int instanceOrFrameNumber;
	public String dsoSeriesUID;
	public String name;
	public String template;
	public String date;
	public String patientName;
	public String studyDate;
	public String comment;
	public String xml;
	public String templateType;
	public String dsoStatus;

	public EPADAIM(String aimID, String userName, String projectID, String subjectID, String studyUID, String seriesUID, String imageUID,
			int instanceOrFrameNumber)
	{
		this.aimID = aimID;
		this.userName = userName;
		this.projectID = projectID;
		this.subjectID = subjectID;
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.imageUID = imageUID;
		this.instanceOrFrameNumber = instanceOrFrameNumber;
	}

	public EPADAIM(String aimID, String userName, String projectID, String subjectID, String studyUID, String seriesUID, String imageUID,
			int instanceOrFrameNumber, String dsoSeriesUID)
	{
		this.aimID = aimID;
		this.userName = userName;
		this.projectID = projectID;
		this.subjectID = subjectID;
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.imageUID = imageUID;
		this.instanceOrFrameNumber = instanceOrFrameNumber;
		this.dsoSeriesUID = dsoSeriesUID;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
