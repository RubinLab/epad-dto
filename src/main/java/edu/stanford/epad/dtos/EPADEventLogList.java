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
 * @author martin
 */
public class EPADEventLogList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final EPADEventLogResultSet ResultSet;

	public EPADEventLogList(List<EPADEventLog> Result)
	{
		this.ResultSet = new EPADEventLogResultSet(Result);
	}

	public EPADEventLogList()
	{
		this.ResultSet = new EPADEventLogResultSet();
	}

	public void addEPADEventLog(EPADEventLog EPADEventLog)
	{
		this.ResultSet.addEPADEventLog(EPADEventLog);
	}

	public static EPADEventLogList emptyMessages()
	{
		return new EPADEventLogList();
	}

	public class EPADEventLogResultSet
	{
		public final List<EPADEventLog> Result;
		public int totalRecords;

		public EPADEventLogResultSet(List<EPADEventLog> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public EPADEventLogResultSet()
		{
			this.Result = new ArrayList<EPADEventLog>();
			this.totalRecords = 0;
		}

		public void addEPADEventLog(EPADEventLog EPADEventLog)
		{
			this.Result.add(EPADEventLog);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
