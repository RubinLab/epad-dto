package edu.stanford.epad.dtos;

import com.google.gson.Gson;

/**
 * Describe the result of a DSO edit operation.
 * 
 * @author martin
 * 
 * @see DSOEditRequest
 */
public class DSOEditResult
{
	public final String projectID, patientID, studyUID, seriesUID, imageUID, aimID;

	public DSOEditResult(String projectID, String patientID, String studyUID, String seriesUID, String imageUID,
			String aimID)
	{
		this.projectID = projectID;
		this.patientID = patientID;
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.imageUID = imageUID;
		this.aimID = aimID;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
