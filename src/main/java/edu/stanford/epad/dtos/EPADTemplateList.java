package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

/**
 * A description of an image list returned from ePAD. Designed to be JSON serializable.
 * 
 * 
 * @author martin
 */
public class EPADTemplateList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final EPADTemplateResultSet ResultSet;

	public EPADTemplateList(List<EPADTemplate> Result)
	{
		this.ResultSet = new EPADTemplateResultSet(Result);
	}

	public EPADTemplateList()
	{
		this.ResultSet = new EPADTemplateResultSet();
	}

	public void addTemplate(EPADTemplate epadFile)
	{
		this.ResultSet.addEPADTemplate(epadFile);
	}

	public static EPADTemplateList emptyImages()
	{
		return new EPADTemplateList();
	}

	public class EPADTemplateResultSet
	{
		public final List<EPADTemplate> Result;
		public int totalRecords;

		public EPADTemplateResultSet(List<EPADTemplate> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public EPADTemplateResultSet()
		{
			this.Result = new ArrayList<EPADTemplate>();
			this.totalRecords = 0;
		}

		public void addEPADTemplate(EPADTemplate epadFile)
		{
			this.Result.add(epadFile);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
