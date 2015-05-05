package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

/**
 * A description of an data list returned from ePAD. Designed to be JSON serializable.
 * 
 * 
 * @author dev
 */
public class EPADDataList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final EPADDataResultSet ResultSet;

	public EPADDataList(List<EPADData> Result)
	{
		this.ResultSet = new EPADDataResultSet(Result);
	}

	public EPADDataList()
	{
		this.ResultSet = new EPADDataResultSet();
	}

	public void addData(EPADData EPADData)
	{
		this.ResultSet.addEPADData(EPADData);
	}

	public static EPADDataList emptyImages()
	{
		return new EPADDataList();
	}

	public class EPADDataResultSet
	{
		public final List<EPADData> Result;
		public int totalRecords;

		public EPADDataResultSet(List<EPADData> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public EPADDataResultSet()
		{
			this.Result = new ArrayList<EPADData>();
			this.totalRecords = 0;
		}

		public void addEPADData(EPADData EPADData)
		{
			this.Result.add(EPADData);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
