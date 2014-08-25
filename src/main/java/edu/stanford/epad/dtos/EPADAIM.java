package edu.stanford.epad.dtos;

import java.io.Serializable;

import com.google.gson.Gson;

public class EPADAIM implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String aimID;
	public final String userName;
	public final String projectID, subjectID, studyUID, seriesUID, imageUID;
	public final int instanceOrFrameNumber;

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

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
