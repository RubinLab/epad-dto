package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

public class EPADFrameList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final EPADFrameResultSet ResultSet;

	public EPADFrameList(List<EPADFrame> Result)
	{
		this.ResultSet = new EPADFrameResultSet(Result);
	}

	public EPADFrameList()
	{
		this.ResultSet = new EPADFrameResultSet();
	}

	public void addFrame(EPADFrame epadFrame)
	{
		this.ResultSet.addEPADFrame(epadFrame);
	}

	public static EPADFrameList emptyFrames()
	{
		return new EPADFrameList();
	}

	public class EPADFrameResultSet
	{
		public final List<EPADFrame> Result;
		public int totalRecords;

		public EPADFrameResultSet(List<EPADFrame> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public EPADFrameResultSet()
		{
			this.Result = new ArrayList<EPADFrame>();
			this.totalRecords = 0;
		}

		public void addEPADFrame(EPADFrame epadFrame)
		{
			this.Result.add(epadFrame);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
