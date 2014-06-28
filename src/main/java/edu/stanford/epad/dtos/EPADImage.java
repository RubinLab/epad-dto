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

	public final String projectID, patientID, studyUID, seriesUID, imageUID, insertDate, imageDate, sliceLocation;
	public final int instanceNumber;
	public final int numberOfFrames;
	public final String pngURL, jpegURL;

	public EPADImage(String projectID, String patientID, String studyUID, String seriesUID, String imageUID,
			String insertDate, String imageDate, String sliceLocation, int instanceNumber, int numberOfFrames,
			String pngURL, String jpegURL)
	{
		this.projectID = projectID;
		this.patientID = patientID;
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.imageUID = imageUID;
		this.insertDate = insertDate;
		this.imageDate = imageDate;
		this.sliceLocation = sliceLocation;
		this.instanceNumber = instanceNumber;
		this.numberOfFrames = numberOfFrames;
		this.pngURL = pngURL;
		this.jpegURL = jpegURL;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
