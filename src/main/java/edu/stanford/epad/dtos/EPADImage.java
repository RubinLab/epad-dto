package edu.stanford.epad.dtos;

import java.io.Serializable;

import com.google.gson.Gson;

import edu.stanford.epad.dtos.internal.DICOMElementList;

/**
 * A description of an image returned from ePAD. Designed to be JSON serializable.
 * 
 * 
 * @author martin
 */
public class EPADImage implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String projectID, patientID, studyUID, seriesUID, imageUID, classUID;
	public final String insertDate, imageDate, sliceLocation;
	public final int instanceNumber;
	public final String losslessImage, lossyImage;
	public final DICOMElementList dicomElements;
	public final DICOMElementList defaultDICOMElements;
	public final int numberOfFrames;
	public final boolean isDSO;
	public boolean multiFrameImage = false;

	public EPADImage(String projectID, String patientID, String studyUID, String seriesUID, String imageUID,
			String classUID, String insertDate, String imageDate, String sliceLocation, int instanceNumber,
			String losslessImage, String lossyImage, DICOMElementList dicomElements, DICOMElementList defaultDICOMElements,
			int numberOfFrames, boolean isDSO)
	{
		this.projectID = projectID;
		this.patientID = patientID;
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.imageUID = imageUID;
		this.classUID = classUID;
		this.insertDate = insertDate;
		this.imageDate = imageDate;
		this.sliceLocation = sliceLocation;
		this.instanceNumber = instanceNumber;
		this.losslessImage = losslessImage;
		this.lossyImage = lossyImage;
		this.dicomElements = dicomElements;
		this.defaultDICOMElements = defaultDICOMElements;
		this.numberOfFrames = numberOfFrames;
		this.isDSO = isDSO;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
