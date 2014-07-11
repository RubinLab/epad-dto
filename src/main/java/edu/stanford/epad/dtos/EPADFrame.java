package edu.stanford.epad.dtos;

import java.io.Serializable;

import com.google.gson.Gson;

import edu.stanford.epad.dtos.internal.DICOMElementList;

public class EPADFrame implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String projectID, patientID, studyUID, seriesUID, imageUID;
	public final int frameNumber;
	public final String losslessImage, lossyImage;
	public final DICOMElementList dicomElements;
	public final DICOMElementList defaultDICOMElements;

	public EPADFrame(String projectID, String patientID, String studyUID, String seriesUID, String imageUID,
			String insertDate, String imageDate, String sliceLocation, int frameNumber, String losslessImage,
			String lossyImage, DICOMElementList dicomElements, DICOMElementList defaultDICOMElements)
	{
		this.projectID = projectID;
		this.patientID = patientID;
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.imageUID = imageUID;
		this.frameNumber = frameNumber;
		this.losslessImage = losslessImage;
		this.lossyImage = lossyImage;
		this.dicomElements = new DICOMElementList(); // TODO Removal temporary for testing
		// this.dicomElements = dicomElements;
		this.defaultDICOMElements = defaultDICOMElements;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}