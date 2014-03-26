package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

/**
 * Represents a list of DICOM headers. Designed to be JSON serializable.
 * 
 * 
 * @author martin
 */
public class DICOMElementList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final DICOMElementResultSet ResultSet; // TODO Move to lower case but sync with front end call first

	public DICOMElementList()
	{
		this.ResultSet = new DICOMElementResultSet();
	}

	public DICOMElementList(List<DICOMElement> Result)
	{
		this.ResultSet = new DICOMElementResultSet(Result);
	}

	public void addDICOMElement(DICOMElement dicomElement)
	{
		ResultSet.addDICOMElement(dicomElement);
	}

	public int getNumberOfElements()
	{
		return this.ResultSet.totalRecords;
	}

	public class DICOMElementResultSet
	{
		public final List<DICOMElement> Result;
		public int totalRecords;

		public DICOMElementResultSet(List<DICOMElement> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public DICOMElementResultSet()
		{
			this.Result = new ArrayList<DICOMElement>();
			this.totalRecords = 0;
		}

		public void addDICOMElement(DICOMElement dicomElement)
		{
			this.Result.add(dicomElement);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
