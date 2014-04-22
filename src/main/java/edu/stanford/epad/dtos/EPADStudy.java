package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.Set;

import com.google.gson.Gson;

/**
 * Representation of a DICOM study in ePAD. Designed to be JSON serializable.
 * 
 * @author martin
 */
public class EPADStudy implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String projectID, patientID, patientName, studyUID, insertDate;
	public final String firstSeriesUID, firstSeriesDateAcquired;
	public final String physicianName, birthdate, sex;
	public final StudyProcessingStatus studyProcessingStatus;
	public final String studyDescription, studyAccessionNumber;
	public final Set<String> examTypes;
	public final int numberOfImages;
	public final int numberOfSeries;
	public final int numberOfAnnotations;

	public EPADStudy(String projectID, String patientID, String patientName, String studyUID, String insertDate,
			String firstSeriesUID, String firstSeriesDateAcquired, String physicianName, String birthdate, String sex,
			StudyProcessingStatus studyProcessingStatus, Set<String> examTypes, String studyDescription,
			String studyAccessionNumber, int numberOfSeries, int numberOfImages, int numberOfAnnotations)
	{
		this.projectID = projectID;
		this.patientID = patientID;
		this.patientName = patientName;
		this.studyUID = studyUID;
		this.insertDate = insertDate;

		this.firstSeriesUID = firstSeriesUID;
		this.firstSeriesDateAcquired = firstSeriesDateAcquired;
		this.physicianName = physicianName;
		this.birthdate = birthdate;
		this.sex = sex;
		this.studyProcessingStatus = studyProcessingStatus;

		this.examTypes = examTypes;
		this.studyDescription = studyDescription;
		this.studyAccessionNumber = studyAccessionNumber;
		this.numberOfSeries = numberOfSeries;
		this.numberOfImages = numberOfImages;
		this.numberOfAnnotations = numberOfAnnotations;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
