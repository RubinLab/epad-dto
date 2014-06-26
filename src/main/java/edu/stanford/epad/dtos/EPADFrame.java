package edu.stanford.epad.dtos;

import java.io.Serializable;

import com.google.gson.Gson;

public class EPADFrame implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String projectID, patientID, studyUID, seriesUID, imageUID;
	public final int frameNumber;

	public EPADFrame(String projectID, String patientID, String studyUID, String seriesUID, String imageUID,
			String insertDate, String imageDate, String sliceLocation, int frameNumber)
	{
		this.projectID = projectID;
		this.patientID = patientID;
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.imageUID = imageUID;
		this.frameNumber = frameNumber;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}