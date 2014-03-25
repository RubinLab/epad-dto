package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.Set;

import com.google.gson.Gson;

/**
 * @author martin
 */
public class EPADStudy implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String projectID, studyUID, insertDate, date, uri;
	public final String studyDescription, studyAccessionNumber;
	public final Set<String> examTypes;
	public final int numberOfSeries;
	public final int numberOfAnnotations;

	public EPADStudy(String projectID, String studyUID, String insertDate, String date, String uri,
			Set<String> examTypes, String studyDescription, String studyAccessionNumber, int numberOfSeries,
			int numberOfAnnotations)
	{
		this.projectID = projectID;
		this.studyUID = studyUID;
		this.insertDate = insertDate;
		this.date = date;
		this.uri = uri;
		this.examTypes = examTypes;
		this.studyDescription = studyDescription;
		this.studyAccessionNumber = studyAccessionNumber;
		this.numberOfSeries = numberOfSeries;
		this.numberOfAnnotations = numberOfAnnotations;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
