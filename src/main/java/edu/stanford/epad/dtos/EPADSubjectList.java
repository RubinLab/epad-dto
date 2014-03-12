package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

public class EPADSubjectList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final EPADSubjectResultSet ResultSet;

	public EPADSubjectList(List<EPADSubject> Result)
	{
		this.ResultSet = new EPADSubjectResultSet(Result);
	}

	public EPADSubjectList()
	{
		this.ResultSet = new EPADSubjectResultSet();
	}

	public void addEPADSubject(EPADSubject epadSubject)
	{
		this.ResultSet.addEPADSubject(epadSubject);
	}

	public static EPADSubjectList emptySubjects()
	{
		return new EPADSubjectList();
	}

	public class EPADSubjectResultSet
	{
		public final List<EPADSubject> Result;
		public int totalRecords;

		public EPADSubjectResultSet(List<EPADSubject> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public EPADSubjectResultSet()
		{
			this.Result = new ArrayList<EPADSubject>();
			this.totalRecords = 0;
		}

		public void addEPADSubject(EPADSubject epadSubject)
		{
			this.Result.add(epadSubject);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
