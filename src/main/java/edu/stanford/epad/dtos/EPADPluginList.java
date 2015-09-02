package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

/**
 * A description of a plugin list returned from ePAD. Designed to be JSON serializable.
 * 
 * @author Emel Alkim
 */
public class EPADPluginList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final EPADPluginResultSet ResultSet;

	public EPADPluginList(List<EPADPlugin> Result)
	{
		this.ResultSet = new EPADPluginResultSet(Result);
	}

	public EPADPluginList()
	{
		this.ResultSet = new EPADPluginResultSet();
	}

	public void addEPADPlugin(EPADPlugin epadPlugin)
	{
		this.ResultSet.addEPADPlugin(epadPlugin);
	}

	public static EPADPluginList emptyPlugins()
	{
		return new EPADPluginList();
	}

	public class EPADPluginResultSet
	{
		public final List<EPADPlugin> Result;
		public int totalRecords;

		public EPADPluginResultSet(List<EPADPlugin> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public EPADPluginResultSet()
		{
			this.Result = new ArrayList<EPADPlugin>();
			this.totalRecords = 0;
		}

		public void addEPADPlugin(EPADPlugin epadPlugin)
		{
			this.Result.add(epadPlugin);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
