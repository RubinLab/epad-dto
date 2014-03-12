package edu.stanford.epad.dtos;

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * Class representing a DICOM element returned from a query to ePAD.
 * 
 * @author martin
 */
public class DICOMElement implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String tagCode, tagName, value;

	public DICOMElement(String tagCode, String tagName, String value)
	{
		this.tagCode = tagCode;
		this.tagName = tagName;
		this.value = value;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
