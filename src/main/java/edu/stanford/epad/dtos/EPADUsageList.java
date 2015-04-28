package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

/**
 * A ePad Usage list Designed to be JSON serializable.
 * 
 * @author martin
 */
public class EPADUsageList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final EPADUsageResultSet ResultSet;

	public EPADUsageList(List<EPADUsage> Result)
	{
		this.ResultSet = new EPADUsageResultSet(Result);
	}

	public EPADUsageList()
	{
		this.ResultSet = new EPADUsageResultSet();
	}

	public void addUsage(EPADUsage epadUsage)
	{
		this.ResultSet.addEPADUsage(epadUsage);
	}

	public static EPADUsageList emptyImages()
	{
		return new EPADUsageList();
	}

	public class EPADUsageResultSet
	{
		public final List<EPADUsage> Result;
		public int totalRecords;

		public EPADUsageResultSet(List<EPADUsage> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public EPADUsageResultSet()
		{
			this.Result = new ArrayList<EPADUsage>();
			this.totalRecords = 0;
		}

		public void addEPADUsage(EPADUsage epadUsage)
		{
			this.Result.add(epadUsage);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
