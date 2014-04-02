package edu.stanford.epad.dtos;

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * A description of an image returned from ePAD. Designed to be JSON serializable.
 * 
 * 
 * @author martin
 */
public class EPADImage implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String imageUID, seriesUID, studyUID, subjectID, insertDate, imageDate, sliceLocation;
	public final int instanceNumber;

	public EPADImage(String imageUID, String seriesUID, String studyUID, String subjectID, String insertDate,
			String imageDate, String sliceLocation, int instanceNumber)
	{
		this.imageUID = imageUID;
		this.seriesUID = seriesUID;
		this.studyUID = studyUID;
		this.subjectID = subjectID;
		this.insertDate = insertDate;
		this.imageDate = imageDate;
		this.sliceLocation = sliceLocation;
		this.instanceNumber = instanceNumber;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
