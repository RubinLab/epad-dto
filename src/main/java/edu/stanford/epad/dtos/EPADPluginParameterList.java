package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

/**
 * A description of a plugin parameters list returned from ePAD. Designed to be JSON serializable.
 * 
 * @author Emel Alkim
 */
public class EPADPluginParameterList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final EPADPluginParameterResultSet ResultSet;

	public EPADPluginParameterList(List<EPADPluginParameter> Result)
	{
		this.ResultSet = new EPADPluginParameterResultSet(Result);
	}

	public EPADPluginParameterList()
	{
		this.ResultSet = new EPADPluginParameterResultSet();
	}

	public void addEPADPluginParameter(EPADPluginParameter epadPluginParam)
	{
		this.ResultSet.addEPADPluginParameter(epadPluginParam);
	}

	public static EPADPluginParameterList emptyPluginParameters()
	{
		return new EPADPluginParameterList();
	}
	
	public List<EPADPluginParameter> getResult() {
		return this.ResultSet.Result;
	}

	public class EPADPluginParameterResultSet
	{
		public final List<EPADPluginParameter> Result;
		public int totalRecords;

		public EPADPluginParameterResultSet(List<EPADPluginParameter> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public EPADPluginParameterResultSet()
		{
			this.Result = new ArrayList<EPADPluginParameter>();
			this.totalRecords = 0;
		}

		public void addEPADPluginParameter(EPADPluginParameter epadPluginParam)
		{
			this.Result.add(epadPluginParam);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
