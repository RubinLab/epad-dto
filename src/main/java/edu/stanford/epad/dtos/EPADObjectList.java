package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

/**
 * A description of a silly data list returned from ePAD. Designed to be JSON serializable.
 * 
 * 
 * @author dev
 */
public class EPADObjectList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final EPADObjectResultSet ResultSet;

	public EPADObjectList(List<Object> Result)
	{
		this.ResultSet = new EPADObjectResultSet(Result);
	}

	public EPADObjectList()
	{
		this.ResultSet = new EPADObjectResultSet();
	}

	public void addObject(Object EPADObject)
	{
		this.ResultSet.addEPADObject(EPADObject);
	}

	public static EPADObjectList emptyImages()
	{
		return new EPADObjectList();
	}

	public class EPADObjectResultSet
	{
		public final List<Object> Result;
		public int totalRecords;

		public EPADObjectResultSet(List<Object> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public EPADObjectResultSet()
		{
			this.Result = new ArrayList<Object>();
			this.totalRecords = 0;
		}

		public void addEPADObject(Object EPADObject)
		{
			this.Result.add(EPADObject);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
