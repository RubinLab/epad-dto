package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

/**
 * Description of a list of studies returned from the DCM4CHEE database. Designed for JSON serialization.
 * 
 * @author martin
 */
public class DCM4CHEEStudyList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final DCM4CHEEStudyResultSet ResultSet; // TODO Move to lower case but sync with front end call first

	public DCM4CHEEStudyList()
	{
		this.ResultSet = new DCM4CHEEStudyResultSet();
	}

	public DCM4CHEEStudyList(List<DCM4CHEEStudy> Result)
	{
		this.ResultSet = new DCM4CHEEStudyResultSet(Result);
	}

	public void addDCM4CHEEStudy(DCM4CHEEStudy dcm4CheeStudy)
	{
		ResultSet.addDCM4CHEEStudy(dcm4CheeStudy);
	}

	public int getNumberOfStudies()
	{
		return this.ResultSet.totalRecords;
	}

	public class DCM4CHEEStudyResultSet
	{
		public final List<DCM4CHEEStudy> Result;
		public int totalRecords;

		public DCM4CHEEStudyResultSet(List<DCM4CHEEStudy> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public DCM4CHEEStudyResultSet()
		{
			this.Result = new ArrayList<DCM4CHEEStudy>();
			this.totalRecords = 0;
		}

		public void addDCM4CHEEStudy(DCM4CHEEStudy dcm4CheeStudy)
		{
			this.Result.add(dcm4CheeStudy);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
