package edu.stanford.epad.dtos;

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * A description of an image returned from ePAD. Designed to be JSON serializable.
 * 
 * 
 * @author martin
 */
public class EPADImage implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String id, insertDate, date, sliceLocation;
	public final int instanceNumber;

	public EPADImage(String id, String insertDate, String date, String sliceLocation, int instanceNumber)
	{
		this.id = id;
		this.insertDate = insertDate;
		this.date = date;
		this.sliceLocation = sliceLocation;
		this.instanceNumber = instanceNumber;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
