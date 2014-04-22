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

	public final String projectID, patientID, patientName, studyUID, seriesUID;
	public final String seriesDate, seriesDescription, examType, bodyPart, accessionNumber;
	public final int numberOfImages, numberOfSeriesRelatedInstances;
	public final int numberOfAnnotations;
	public final String institution, stationName, department;
	public final SeriesProcessingStatus seriesProcessingStatus;

	public EPADSeries(String projectID, String patientID, String patientName, String studyUID, String seriesUID,
			String seriesDate, String seriesDescription, String examType, String bodyPart, String accessionNumber,
			int numberOfImages, int numberOfSeriesRelatedInstances, int numberOfAnnotations, String institution,
			String stationName, String department, SeriesProcessingStatus seriesProcessingStatus)
	{
		this.projectID = projectID;
		this.patientID = patientID;
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
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
		this.seriesProcessingStatus = seriesProcessingStatus;
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
