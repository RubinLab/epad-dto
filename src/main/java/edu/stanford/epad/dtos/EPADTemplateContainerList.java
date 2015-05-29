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
public class EPADTemplateContainerList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final EPADTemplateResultSet ResultSet;

	public EPADTemplateContainerList(List<EPADTemplateContainer> Result)
	{
		this.ResultSet = new EPADTemplateResultSet(Result);
	}

	public EPADTemplateContainerList()
	{
		this.ResultSet = new EPADTemplateResultSet();
	}

	public void addTemplate(EPADTemplateContainer epadFile)
	{
		this.ResultSet.addEPADTemplate(epadFile);
	}

	public static EPADTemplateContainerList emptyImages()
	{
		return new EPADTemplateContainerList();
	}

	public class EPADTemplateResultSet
	{
		public final List<EPADTemplateContainer> Result;
		public int totalRecords;

		public EPADTemplateResultSet(List<EPADTemplateContainer> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public EPADTemplateResultSet()
		{
			this.Result = new ArrayList<EPADTemplateContainer>();
			this.totalRecords = 0;
		}

		public void addEPADTemplate(EPADTemplateContainer epadFile)
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
