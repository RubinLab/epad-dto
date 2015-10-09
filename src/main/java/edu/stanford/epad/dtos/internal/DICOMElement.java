package edu.stanford.epad.dtos.internal;

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * Class representing a DICOM element returned from a query to ePAD. Designed to be JSON serializable.
 * 
 * @author martin
 */
public class DICOMElement implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String tagCode, tagName, value;
	public String parentSequenceName;

	public DICOMElement(String tagCode, String tagName, String value)
	{
		this.tagCode = tagCode;
		this.tagName = tagName;
		this.value = value;
	}

	@Override
	public String toString()
	{
		return "(tagCode: " + tagCode + ", tagName: " + tagName + ", value: " + value + ")";
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.tagCode == null) ? 0 : this.tagCode.hashCode());
		result = prime * result + ((this.tagName == null) ? 0 : this.tagName.hashCode());
		result = prime * result + ((this.value == null) ? 0 : this.value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DICOMElement other = (DICOMElement)obj;
		if (this.tagCode == null) {
			if (other.tagCode != null)
				return false;
		} else if (!this.tagCode.equals(other.tagCode))
			return false;
		if (this.tagName == null) {
			if (other.tagName != null)
				return false;
		} else if (!this.tagName.equals(other.tagName))
			return false;
		if (this.value == null) {
			if (other.value != null)
				return false;
		} else if (!this.value.equals(other.value))
			return false;
		return true;
	}

}
