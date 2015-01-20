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
public class RemotePACList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final RemotePACResultSet ResultSet;

	public RemotePACList(List<RemotePAC> Result)
	{
		this.ResultSet = new RemotePACResultSet(Result);
	}

	public RemotePACList()
	{
		this.ResultSet = new RemotePACResultSet();
	}

	public void addRemotePAC(RemotePAC RemotePAC)
	{
		this.ResultSet.addRemotePAC(RemotePAC);
	}

	public static RemotePACList emptyRemotePACs()
	{
		return new RemotePACList();
	}

	public class RemotePACResultSet
	{
		public final List<RemotePAC> Result;
		public int totalRecords;

		public RemotePACResultSet(List<RemotePAC> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public RemotePACResultSet()
		{
			this.Result = new ArrayList<RemotePAC>();
			this.totalRecords = 0;
		}

		public void addRemotePAC(RemotePAC RemotePAC)
		{
			this.Result.add(RemotePAC);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
