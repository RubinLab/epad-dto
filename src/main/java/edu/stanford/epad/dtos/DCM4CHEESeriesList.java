package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

/**
 * Represents a list if DCM4CHEE series
 * 
 * 
 * @author martin
 */
public class DCM4CHEESeriesList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final DCM4CHEESeriesResultSet ResultSet; // TODO Move to lower case but sync with front end call first

	public DCM4CHEESeriesList()
	{
		this.ResultSet = new DCM4CHEESeriesResultSet();
	}

	public DCM4CHEESeriesList(List<DCM4CHEESeries> Result)
	{
		this.ResultSet = new DCM4CHEESeriesResultSet(Result);
	}

	public void addDCM4CHEESeries(DCM4CHEESeries dcm4CheeSeries)
	{
		ResultSet.addDCM4CHEESeries(dcm4CheeSeries);
	}

	public int getNumberOfSeries()
	{
		return this.ResultSet.totalRecords;
	}

	public class DCM4CHEESeriesResultSet
	{
		public final List<DCM4CHEESeries> Result;
		public int totalRecords;

		public DCM4CHEESeriesResultSet(List<DCM4CHEESeries> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public DCM4CHEESeriesResultSet()
		{
			this.Result = new ArrayList<DCM4CHEESeries>();
			this.totalRecords = 0;
		}

		public void addDCM4CHEESeries(DCM4CHEESeries dcm4CheeSeries)
		{
			this.Result.add(dcm4CheeSeries);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
