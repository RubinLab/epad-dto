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

	public final String workListID, username, name, description, status;
	
	public final String startDate, completionDate, dueDate;
	
	public final List<String> projectIDs;
	
	public final List<String> studyUIDs;

	public final List<String> studyStatus;

	public EPADWorklist(String workListID, String username,
			String description, String status, String startDate,
			String completionDate, String dueDate, List<String> projectIDs, List<String> studyUIDs, List<String> studyStatus) {
		super();
		this.workListID = workListID;
		this.username = username;
		this.name = "";
		this.description = description;
		this.status = status;
		this.startDate = startDate;
		this.completionDate = completionDate;
		this.dueDate = dueDate;
		this.projectIDs = projectIDs;
		this.studyUIDs = studyUIDs;
		this.studyStatus = studyStatus;
	}

	public EPADWorklist(String workListID, String username, String name,
			String description, String status, String startDate,
			String completionDate, String dueDate, List<String> projectIDs, List<String> studyUIDs, List<String> studyStatus) {
		super();
		this.workListID = workListID;
		this.username = username;
		this.name = name;
		this.description = description;
		this.status = status;
		this.startDate = startDate;
		this.completionDate = completionDate;
		this.dueDate = dueDate;
		this.projectIDs = projectIDs;
		this.studyUIDs = studyUIDs;
		this.studyStatus = studyStatus;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
