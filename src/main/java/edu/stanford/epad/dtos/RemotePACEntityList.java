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
public class RemotePACEntityList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final RemotePACEntityResultSet ResultSet;

	public RemotePACEntityList(List<RemotePACEntity> Result)
	{
		this.ResultSet = new RemotePACEntityResultSet(Result);
	}

	public RemotePACEntityList()
	{
		this.ResultSet = new RemotePACEntityResultSet();
	}

	public void addRemotePACEntity(RemotePACEntity RemotePACEntity)
	{
		this.ResultSet.addRemotePACEntity(RemotePACEntity);
	}

	public static RemotePACEntityList emptyRemotePACEntitys()
	{
		return new RemotePACEntityList();
	}

	public class RemotePACEntityResultSet
	{
		public final List<RemotePACEntity> Result;
		public int totalRecords;

		public RemotePACEntityResultSet(List<RemotePACEntity> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public RemotePACEntityResultSet()
		{
			this.Result = new ArrayList<RemotePACEntity>();
			this.totalRecords = 0;
		}

		public void addRemotePACEntity(RemotePACEntity RemotePACEntity)
		{
			this.Result.add(RemotePACEntity);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
