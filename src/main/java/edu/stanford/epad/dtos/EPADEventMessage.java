package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.Date;

import org.apache.log4j.Level;

import com.google.gson.Gson;

public class EPADEventMessage implements Serializable
{
	private static final long serialVersionUID = 1L;

    public int number;
    public String event; // See edu.stanford.epad.common.util.EventMessageCodes
    public String more;
    public String subjectID;
    public String subjectName;
    public String projectID;
    public String projectName;
    public String studyID;
    public String seriesID;
    public String aimID;
    public String aimName;
    public String templateID;
    public String templateName;
    public String pluginID;
    public String pluginName;
    public String date;
    public boolean error;


	
	public EPADEventMessage(int number, String event, String more,
			String subjectID, String subjectName, String projectID,
			String projectName, String studyID, String seriesID,
			String aimID, String aimName,
			String templateID, String templateName, String pluginID,
			String pluginName, String date, boolean error) {
		super();
		this.number = number;
		this.event = event;
		this.more = more;
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.projectID = projectID;
		this.projectName = projectName;
		this.studyID = studyID;
		this.seriesID = seriesID;
		this.aimID = aimID;
		this.aimName = aimName;
		this.templateID = templateID;
		this.templateName = templateName;
		this.pluginID = pluginID;
		this.pluginName = pluginName;
		this.date = date;
		this.error = error;
	}



	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
