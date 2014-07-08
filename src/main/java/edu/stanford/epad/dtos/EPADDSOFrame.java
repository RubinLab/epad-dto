package edu.stanford.epad.dtos;

import com.google.gson.Gson;

public class EPADDSOFrame extends EPADFrame
{
	private static final long serialVersionUID = 1L;

	public final String sourceSeriesUID, sourceImageUID, sourcePNGURL, maskURL;

	public EPADDSOFrame(String projectID, String patientID, String studyUID, String seriesUID, String imageUID,
			String insertDate, String imageDate, String sliceLocation, int frameNumber, String pngURL, String jpegURL,
			String sourceSeriesUID, String sourceImageUID, String sourcePNGURL, String maskURL)
	{
		super(projectID, patientID, studyUID, seriesUID, imageUID, insertDate, imageDate, sliceLocation, frameNumber,
				pngURL, jpegURL);
		this.sourceSeriesUID = sourceSeriesUID;
		this.sourceImageUID = sourceImageUID;
		this.sourcePNGURL = sourcePNGURL;
		this.maskURL = maskURL;
	}

	@Override
	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}