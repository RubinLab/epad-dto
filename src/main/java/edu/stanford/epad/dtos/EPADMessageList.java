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
public class EPADMessageList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final EPADMessageResultSet ResultSet;

	public EPADMessageList(List<EPADMessage> Result)
	{
		this.ResultSet = new EPADMessageResultSet(Result);
	}

	public EPADMessageList()
	{
		this.ResultSet = new EPADMessageResultSet();
	}

	public void addEPADMessage(EPADMessage epadMessage)
	{
		this.ResultSet.addEPADMessage(epadMessage);
	}

	public static EPADMessageList emptyMessages()
	{
		return new EPADMessageList();
	}

	public class EPADMessageResultSet
	{
		public final List<EPADMessage> Result;
		public int totalRecords;

		public EPADMessageResultSet(List<EPADMessage> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public EPADMessageResultSet()
		{
			this.Result = new ArrayList<EPADMessage>();
			this.totalRecords = 0;
		}

		public void addEPADMessage(EPADMessage epadMessage)
		{
			this.Result.add(epadMessage);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
