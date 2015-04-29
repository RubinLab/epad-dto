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
public class EPADWorklist implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String workListID, username, projectID, description, status;
	
	public final String startDate, completionDate, dueDate;
	
	public final List<String> studyUIDs;

	public final List<String> studyStatus;

	public EPADWorklist(String workListID, String username, String projectID,
			String description, String status, String startDate,
			String completionDate, String dueDate, List<String> studyUIDs, List<String> studyStatus) {
		super();
		this.workListID = workListID;
		this.username = username;
		this.projectID = projectID;
		this.description = description;
		this.status = status;
		this.startDate = startDate;
		this.completionDate = completionDate;
		this.dueDate = dueDate;
		this.studyUIDs = studyUIDs;
		this.studyStatus = studyStatus;
	}



	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
