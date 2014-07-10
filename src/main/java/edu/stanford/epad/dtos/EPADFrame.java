package edu.stanford.epad.dtos;

import java.io.Serializable;

import com.google.gson.Gson;

import edu.stanford.epad.dtos.internal.DICOMElementList;

public class EPADFrame implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String projectID, subjectID, studyUID, seriesUID, imageUID;
	public final int frameNumber;
	public final String losslessImage, lossyImage;
	public final DICOMElementList dicomElements;
	public final DICOMElementList defaultDICOMElements;

	public EPADFrame(String projectID, String subjectID, String studyUID, String seriesUID, String imageUID,
			String insertDate, String imageDate, String sliceLocation, int frameNumber, String losslessImage,
			String lossyImage, DICOMElementList dicomElements, DICOMElementList defaultDICOMElements)
	{
		this.projectID = projectID;
		this.subjectID = subjectID;
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.imageUID = imageUID;
		this.frameNumber = frameNumber;
		this.losslessImage = losslessImage;
		this.lossyImage = lossyImage;
		this.dicomElements = dicomElements;
		this.defaultDICOMElements = defaultDICOMElements;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}