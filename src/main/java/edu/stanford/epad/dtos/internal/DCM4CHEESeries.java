package edu.stanford.epad.dtos.internal;

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * Represents result returned by DCM4CHEE series search. Designed to be JSON serializable.
 * 
 * @author martin
 */
public class DCM4CHEESeries implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String studyUID, seriesUID, patientID, patientName, seriesDate, examType, thumbnailURL,
			seriesDescription;
	public final int numberOfSeriesRelatedInstances, imagesInSeries, seriesStatus;
	public final String bodyPart, institution, stationName, department, accessionNumber;
	public final String createdTime;
	public final boolean isDSO;

	public DCM4CHEESeries(String studyUID, String seriesUID, String patientID, String patientName, String seriesDate,
			String examType, String thumbnailURL, String seriesDescription, int numberOfSeriesRelatedInstances,
			int imagesInSeries, int seriesStatus, String bodyPart, String institution, String stationName, String department,
			String accessionNumber, String createdTime, boolean isDSO)
	{
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.patientID = patientID;
		this.patientName = patientName;
		this.seriesDate = seriesDate;
		this.examType = examType;
		this.thumbnailURL = thumbnailURL;
		this.seriesDescription = seriesDescription;
		this.numberOfSeriesRelatedInstances = numberOfSeriesRelatedInstances;
		this.imagesInSeries = imagesInSeries;
		this.seriesStatus = seriesStatus;
		this.bodyPart = bodyPart;
		this.institution = institution;
		this.stationName = stationName;
		this.department = department;
		this.accessionNumber = accessionNumber;
		this.createdTime = createdTime;
		this.isDSO = isDSO;
	}

	public DCM4CHEESeries(String studyUID, String seriesUID, String patientID, String patientName, String seriesDate,
			String examType, String thumbnailURL, String seriesDescription, int numberOfSeriesRelatedInstances,
			int imagesInSeries, int seriesStatus, String bodyPart, String institution, String stationName, String department,
			String accessionNumber, String createdTime)
	{
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.patientID = patientID;
		this.patientName = patientName;
		this.seriesDate = seriesDate;
		this.examType = examType;
		this.thumbnailURL = thumbnailURL;
		this.seriesDescription = seriesDescription;
		this.numberOfSeriesRelatedInstances = numberOfSeriesRelatedInstances;
		this.imagesInSeries = imagesInSeries;
		this.seriesStatus = seriesStatus;
		this.bodyPart = bodyPart;
		this.institution = institution;
		this.stationName = stationName;
		this.department = department;
		this.accessionNumber = accessionNumber;
		this.createdTime = createdTime;
		this.isDSO = false;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
