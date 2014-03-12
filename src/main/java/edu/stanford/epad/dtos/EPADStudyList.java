package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

public class EPADStudyList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final EPADStudyResultSet ResultSet;

	public EPADStudyList(List<EPADStudy> Result)
	{
		this.ResultSet = new EPADStudyResultSet(Result);
	}

	public EPADStudyList()
	{
		this.ResultSet = new EPADStudyResultSet();
	}

	public void addEPADStudy(EPADStudy epadStudy)
	{
		this.ResultSet.addEPADStudy(epadStudy);
	}

	public static EPADStudyList emptyStudys()
	{
		return new EPADStudyList();
	}

	public class EPADStudyResultSet
	{
		public final List<EPADStudy> Result;
		public int totalRecords;

		public EPADStudyResultSet(List<EPADStudy> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public EPADStudyResultSet()
		{
			this.Result = new ArrayList<EPADStudy>();
			this.totalRecords = 0;
		}

		public void addEPADStudy(EPADStudy epadStudy)
		{
			this.Result.add(epadStudy);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
