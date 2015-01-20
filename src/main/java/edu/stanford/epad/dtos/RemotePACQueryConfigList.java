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
public class RemotePACQueryConfigList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final RemotePACQueryConfigResultSet ResultSet;

	public RemotePACQueryConfigList(List<RemotePACQueryConfig> Result)
	{
		this.ResultSet = new RemotePACQueryConfigResultSet(Result);
	}

	public RemotePACQueryConfigList()
	{
		this.ResultSet = new RemotePACQueryConfigResultSet();
	}

	public void addRemotePACQueryConfig(RemotePACQueryConfig RemotePACQueryConfig)
	{
		this.ResultSet.addRemotePACQueryConfig(RemotePACQueryConfig);
	}

	public static RemotePACQueryConfigList emptyRemotePACQueryConfigs()
	{
		return new RemotePACQueryConfigList();
	}

	public class RemotePACQueryConfigResultSet
	{
		public final List<RemotePACQueryConfig> Result;
		public int totalRecords;

		public RemotePACQueryConfigResultSet(List<RemotePACQueryConfig> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public RemotePACQueryConfigResultSet()
		{
			this.Result = new ArrayList<RemotePACQueryConfig>();
			this.totalRecords = 0;
		}

		public void addRemotePACQueryConfig(RemotePACQueryConfig RemotePACQueryConfig)
		{
			this.Result.add(RemotePACQueryConfig);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
