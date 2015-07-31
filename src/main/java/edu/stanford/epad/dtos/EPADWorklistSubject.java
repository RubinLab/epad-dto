package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;

/**
 * A description of an EPAD user
 * 
 * @author dev
 */
public class EPADWorklistSubject implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String workListID, username, projectID, subjectID, status;
	
	public final String startDate, completionDate;

	public EPADWorklistSubject(String workListID, String username, String projectID, String subjectID,String status, String startDate,
			String completionDate) {
		super();
		this.workListID = workListID;
		this.username = username;
		this.projectID = projectID;
		this.subjectID = subjectID;
		this.status = status;
		this.startDate = startDate;
		this.completionDate = completionDate;
	}



	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}