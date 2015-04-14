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

	public final EPADFileResultSet ResultSet;

	public EPADTemplateList(List<EPADFile> Result)
	{
		this.ResultSet = new EPADFileResultSet(Result);
	}

	public EPADTemplateList()
	{
		this.ResultSet = new EPADFileResultSet();
	}

	public void addFile(EPADFile epadFile)
	{
		this.ResultSet.addEPADFile(epadFile);
	}

	public static EPADTemplateList emptyImages()
	{
		return new EPADTemplateList();
	}

	public class EPADFileResultSet
	{
		public final List<EPADFile> Result;
		public int totalRecords;

		public EPADFileResultSet(List<EPADFile> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public EPADFileResultSet()
		{
			this.Result = new ArrayList<EPADFile>();
			this.totalRecords = 0;
		}

		public void addEPADFile(EPADFile epadFile)
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
