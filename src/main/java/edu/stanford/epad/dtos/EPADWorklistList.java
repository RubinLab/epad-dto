package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

/**
 * Designed to be JSON serializable.
 * 
 * 
 * @author dev
 */
public class EPADWorklistList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final EPADWorklistResultSet ResultSet;

	public EPADWorklistList(List<EPADWorklist> Result)
	{
		this.ResultSet = new EPADWorklistResultSet(Result);
	}

	public EPADWorklistList()
	{
		this.ResultSet = new EPADWorklistResultSet();
	}

	public void addEPADWorklist(EPADWorklist epadWorklist)
	{
		this.ResultSet.addEPADWorklist(epadWorklist);
	}

	public static EPADWorklistList emptyWorklists()
	{
		return new EPADWorklistList();
	}

	public class EPADWorklistResultSet
	{
		public final List<EPADWorklist> Result;
		public int totalRecords;

		public EPADWorklistResultSet(List<EPADWorklist> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public EPADWorklistResultSet()
		{
			this.Result = new ArrayList<EPADWorklist>();
			this.totalRecords = 0;
		}

		public void addEPADWorklist(EPADWorklist epadWorklist)
		{
			this.Result.add(epadWorklist);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
