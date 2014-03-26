package edu.stanford.epad.dtos;

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * Represents an image description in the result from a query to the ePAD database. Designed to be JSON serializable.
 * 
 * @author martin
 * 
 * @see EPADDatabaseSeries
 */
public class EPADDatabaseImage implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String fileName;
	public final int instanceNumber;
	public final String sliceLocation, contentTime;

	public EPADDatabaseImage(String fileName, int instanceNumber, String sliceLocation, String contentTime)
	{
		this.fileName = fileName;
		this.instanceNumber = instanceNumber;
		this.sliceLocation = sliceLocation;
		this.contentTime = contentTime;
	}

	public String getImageUID()
	{
		int lastDotIndex = fileName.lastIndexOf('.');

		String uidPart = fileName;
		if (lastDotIndex > 0) {
			uidPart = fileName.substring(0, lastDotIndex);
		}
		uidPart = uidPart.replaceAll("_", ".");
		return uidPart;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
