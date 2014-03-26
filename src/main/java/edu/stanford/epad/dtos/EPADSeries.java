package edu.stanford.epad.dtos;

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * A description of a series returned from an ePAD query. Designed to be JSON serializable.
 * 
 * @author martin
 */
public class EPADSeries implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String studyUID, seriesUID, patientID, patientName;
	public final String seriesDate, seriesDescription, examType, bodyPart;
	public final int numberOfImages;
	public final int numberOfAnnotations;

	public EPADSeries(String studyUID, String seriesUID, String patientID, String patientName, String seriesDate,
			String seriesDescription, String examType, String bodyPart, int numberOfImages, int numberOfAnnotations)
	{
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.patientID = patientID;
		this.patientName = patientName;
		this.seriesDate = seriesDate;
		this.seriesDescription = seriesDescription;
		this.examType = examType;
		this.bodyPart = bodyPart;
		this.numberOfImages = numberOfImages;
		this.numberOfAnnotations = numberOfAnnotations;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}

// this.bodyPart = bodyPart;
// this.institution = institution;
// this.stationName = stationName;
// this.department = department;
// this.accessionNumber = accessionNumber;
