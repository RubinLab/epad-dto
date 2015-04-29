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
public class EPADWorklistStudyList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final EPADWorklistStudyResultSet ResultSet;

	public EPADWorklistStudyList(List<EPADWorklistStudy> Result)
	{
		this.ResultSet = new EPADWorklistStudyResultSet(Result);
	}

	public EPADWorklistStudyList()
	{
		this.ResultSet = new EPADWorklistStudyResultSet();
	}

	public void addEPADWorklistStudy(EPADWorklistStudy epadWorklistStudy)
	{
		this.ResultSet.addEPADWorklistStudy(epadWorklistStudy);
	}

	public static EPADWorklistStudyList emptyWorklistStudys()
	{
		return new EPADWorklistStudyList();
	}

	public class EPADWorklistStudyResultSet
	{
		public final List<EPADWorklistStudy> Result;
		public int totalRecords;

		public EPADWorklistStudyResultSet(List<EPADWorklistStudy> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public EPADWorklistStudyResultSet()
		{
			this.Result = new ArrayList<EPADWorklistStudy>();
			this.totalRecords = 0;
		}

		public void addEPADWorklistStudy(EPADWorklistStudy epadWorklistStudy)
		{
			this.Result.add(epadWorklistStudy);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
