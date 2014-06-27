package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

public class EPADAIMList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final EPADAIMResultSet ResultSet;

	public EPADAIMList(List<EPADAIM> Result)
	{
		this.ResultSet = new EPADAIMResultSet(Result);
	}

	public EPADAIMList()
	{
		this.ResultSet = new EPADAIMResultSet();
	}

	public void addAIM(EPADAIM epadAIM)
	{
		this.ResultSet.addEPADAIM(epadAIM);
	}

	public static EPADAIMList emptyAIMs()
	{
		return new EPADAIMList();
	}

	public class EPADAIMResultSet
	{
		public final List<EPADAIM> Result;
		public int totalRecords;

		public EPADAIMResultSet(List<EPADAIM> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public EPADAIMResultSet()
		{
			this.Result = new ArrayList<EPADAIM>();
			this.totalRecords = 0;
		}

		public void addEPADAIM(EPADAIM epadAIM)
		{
			this.Result.add(epadAIM);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}