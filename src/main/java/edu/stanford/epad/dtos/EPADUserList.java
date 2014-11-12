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
public class EPADUserList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final EPADUserResultSet ResultSet;

	public EPADUserList(List<EPADUser> Result)
	{
		this.ResultSet = new EPADUserResultSet(Result);
	}

	public EPADUserList()
	{
		this.ResultSet = new EPADUserResultSet();
	}

	public void addEPADUser(EPADUser epadUser)
	{
		this.ResultSet.addEPADUser(epadUser);
	}

	public static EPADUserList emptyUsers()
	{
		return new EPADUserList();
	}

	public class EPADUserResultSet
	{
		public final List<EPADUser> Result;
		public int totalRecords;

		public EPADUserResultSet(List<EPADUser> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public EPADUserResultSet()
		{
			this.Result = new ArrayList<EPADUser>();
			this.totalRecords = 0;
		}

		public void addEPADUser(EPADUser epadUser)
		{
			this.Result.add(epadUser);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
