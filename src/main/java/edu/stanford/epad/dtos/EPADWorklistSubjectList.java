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
public class EPADWorklistSubjectList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final EPADWorklistSubjectResultSet ResultSet;

	public EPADWorklistSubjectList(List<EPADWorklistSubject> Result)
	{
		this.ResultSet = new EPADWorklistSubjectResultSet(Result);
	}

	public EPADWorklistSubjectList()
	{
		this.ResultSet = new EPADWorklistSubjectResultSet();
	}

	public void addEPADWorklistSubject(EPADWorklistSubject epadWorklistSubject)
	{
		this.ResultSet.addEPADWorklistSubject(epadWorklistSubject);
	}

	public static EPADWorklistSubjectList emptyWorklistSubjects()
	{
		return new EPADWorklistSubjectList();
	}

	public class EPADWorklistSubjectResultSet
	{
		public final List<EPADWorklistSubject> Result;
		public int totalRecords;

		public EPADWorklistSubjectResultSet(List<EPADWorklistSubject> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public EPADWorklistSubjectResultSet()
		{
			this.Result = new ArrayList<EPADWorklistSubject>();
			this.totalRecords = 0;
		}

		public void addEPADWorklistSubject(EPADWorklistSubject epadWorklistSubject)
		{
			this.Result.add(epadWorklistSubject);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
