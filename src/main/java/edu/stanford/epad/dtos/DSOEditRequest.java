package edu.stanford.epad.dtos;

import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

/**
 * Describes a DSO edit request. The request contains the identifiers of the DSO and the modified frames masks, which
 * are uploaded in a multi-part request.
 * 
 * @author martin
 * 
 * @see DSOEditResult
 */
public class DSOEditRequest
{
	public String projectID, patientID, studyUID, seriesUID, imageUID, aimID;
	public final List<Integer> editedFrameNumbers;

	public DSOEditRequest(String projectID, String patientID, String studyUID, String seriesUID, String imageUID, String aimID,
			List<Integer> editedFrameNumbers)
	{
		this.projectID = projectID;
		this.patientID = patientID;
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.imageUID = imageUID;
		this.aimID = aimID;
		this.editedFrameNumbers = Collections.unmodifiableList(editedFrameNumbers);
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
