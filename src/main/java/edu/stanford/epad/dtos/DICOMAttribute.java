package edu.stanford.epad.dtos;

public class DICOMAttribute
{
	public final String attribute, value;

	public DICOMAttribute(String attribute, String value)
	{
		this.attribute = attribute;
		this.value = value;
	}
}