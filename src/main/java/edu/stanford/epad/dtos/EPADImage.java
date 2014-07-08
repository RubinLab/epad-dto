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

	public final String projectID, patientID, studyUID, seriesUID, imageUID, insertDate, imageDate, sliceLocation;
	public final int instanceNumber;
	public final String pngPath, jpegPath;
	public final DICOMElementList dicomElements;
	public final DICOMElementList calculatedDICOMElements;
	public final int numberOfFrames;
	public final boolean isDSO;

	public EPADImage(String projectID, String patientID, String studyUID, String seriesUID, String imageUID,
			String insertDate, String imageDate, String sliceLocation, int instanceNumber, String pngPath, String jpegPath,
			DICOMElementList dicomElements, DICOMElementList calculatedDICOMElements, int numberOfFrames, boolean isDSO)
	{
		this.projectID = projectID;
		this.patientID = patientID;
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.imageUID = imageUID;
		this.insertDate = insertDate;
		this.imageDate = imageDate;
		this.sliceLocation = sliceLocation;
		this.instanceNumber = instanceNumber;
		this.pngPath = pngPath;
		this.jpegPath = jpegPath;
		this.dicomElements = dicomElements;
		this.calculatedDICOMElements = calculatedDICOMElements;
		this.numberOfFrames = numberOfFrames;
		this.isDSO = isDSO;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
