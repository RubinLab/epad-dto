package edu.stanford.epad.dtos;

import com.google.gson.Gson;

import edu.stanford.epad.dtos.internal.DICOMElementList;

public class EPADDSOFrame extends EPADFrame
{
	private static final long serialVersionUID = 1L;

	public final String sourceSeriesUID, sourceImageUID, sourceLosslessImage, sourceLossyImage;

	public EPADDSOFrame(String projectID, String subjectID, String studyUID, String seriesUID, String imageUID,
			String insertDate, String imageDate, String sliceLocation, int frameNumber, String losslessImage,
			String lossyImage, DICOMElementList dicomElements, DICOMElementList defaultDICOMElements, String sourceSeriesUID,
			String sourceImageUID, String sourceLosslessImage, String sourceLossyImage)
	{
		super(projectID, subjectID, studyUID, seriesUID, imageUID, insertDate, imageDate, sliceLocation, frameNumber,
				losslessImage, lossyImage, dicomElements, defaultDICOMElements);
		this.sourceSeriesUID = sourceSeriesUID;
		this.sourceImageUID = sourceImageUID;
		this.sourceLossyImage = sourceLossyImage;
		this.sourceLosslessImage = sourceLosslessImage;
	}

	@Override
	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}