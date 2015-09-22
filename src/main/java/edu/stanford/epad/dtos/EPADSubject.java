package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.google.gson.Gson;

/**
 * Represents a patient in ePAD. Designed to be JSON serializable.
 * 
 * @author martin
 */
public class EPADSubject implements Serializable
{
	private static final long serialVersionUID = 1L;

	public String subjectName, subjectID, projectID, insertUser, xnatID, insertDate, uri;
	public Integer numberOfStudies;
	public Integer numberOfAnnotations;
	public Set<String> examTypes;
	public String userProjectStatus;

	public EPADSubject(String projectID, String subjectID, String subjectName, String insertUser, String xnatID,
			String insertDate, String uri, int numberOfStudies, int numberOfAnnotations, Set<String> examTypes)
	{
		this.projectID = projectID;
		this.subjectName = subjectName;
		this.insertUser = insertUser;
		this.xnatID = xnatID;
		this.insertDate = insertDate;
		this.subjectID = subjectID;
		this.uri = uri;
		this.numberOfStudies = numberOfStudies;
		this.numberOfAnnotations = numberOfAnnotations;
		this.examTypes = new HashSet<String>(examTypes);
	}

	public String getUserProjectStatus() {
		return userProjectStatus;
	}

	public void setUserProjectStatus(String userProjectStatus) {
		this.userProjectStatus = userProjectStatus;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
