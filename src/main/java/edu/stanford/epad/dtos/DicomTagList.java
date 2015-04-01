package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;

public class DicomTagList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final DicomTagResultSet ResultSet;

	public DicomTagList(List<DicomTag> Result)
	{
		this.ResultSet = new DicomTagResultSet(Result);
	}

	public DicomTagList()
	{
		this.ResultSet = new DicomTagResultSet();
	}

	public void addDicomTag(DicomTag DicomTag)
	{
		this.ResultSet.addDicomTag(DicomTag);
	}

	public static DicomTagList emptyAIMs()
	{
		return new DicomTagList();
	}

	public class DicomTagResultSet
	{
		public final List<DicomTag> Result;
		public int totalRecords;

		public DicomTagResultSet(List<DicomTag> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public DicomTagResultSet()
		{
			this.Result = new ArrayList<DicomTag>();
			this.totalRecords = 0;
		}

		public void addDicomTag(DicomTag DicomTag)
		{
			this.Result.add(DicomTag);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
