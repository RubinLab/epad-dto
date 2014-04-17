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
	public final String seriesDate, seriesDescription, examType, bodyPart, accessionNumber;
	public final int numberOfImages, numberOfSeriesRelatedInstances;
	public final int numberOfAnnotations;
	public final String institution, stationName, department;
	public final int pngProcessingStatus;

	public EPADSeries(String studyUID, String seriesUID, String patientID, String patientName, String seriesDate,
			String seriesDescription, String examType, String bodyPart, String accessionNumber, int numberOfImages,
			int numberOfSeriesRelatedInstances, int numberOfAnnotations, String institution, String stationName,
			String department, int pngProcessingStatus)
	{
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.patientID = patientID;
		this.patientName = patientName;
		this.seriesDate = seriesDate;
		this.seriesDescription = seriesDescription;
		this.examType = examType;
		this.bodyPart = bodyPart;
		this.accessionNumber = accessionNumber;
		this.numberOfImages = numberOfImages;
		this.numberOfSeriesRelatedInstances = numberOfSeriesRelatedInstances;
		this.numberOfAnnotations = numberOfAnnotations;
		this.institution = institution;
		this.stationName = stationName;
		this.department = department;
		this.pngProcessingStatus = pngProcessingStatus;
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
