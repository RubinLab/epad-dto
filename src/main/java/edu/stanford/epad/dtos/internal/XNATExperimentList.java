package edu.stanford.epad.dtos.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

/**
 * A result from XNAT listing a set of experiments. This is the default structure returned from an XNAT experiments
 * query. Designed to be JSON serializable.
 * <p>
 * Example: <code>
 * {
 * "ResultSet":
 *  { "Result":
 *    [ 
 *      {"project":"PRJ1","xsiType":"...","ID":"...","insert_date":"...","label":"SID1", "date":"...", "URI":"/data/Experiments/EPAD_S00002"}  
 *    ], 
 *    "totalRecords": "1"
 *  }
 * }
 * </code>
 * 
 * @author martin
 */
public class XNATExperimentList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final XNATExperimentResultSet ResultSet;

	public XNATExperimentList(List<XNATExperiment> Result)
	{
		this.ResultSet = new XNATExperimentResultSet(Result);
	}

	public XNATExperimentList()
	{
		this.ResultSet = new XNATExperimentResultSet();
	}

	public void addXNATExperiment(XNATExperiment xnatExperiment)
	{
		this.ResultSet.addXNATExperiment(xnatExperiment);
	}

	public static XNATExperimentList emptyExperiments()
	{
		return new XNATExperimentList();
	}

	public class XNATExperimentResultSet
	{
		public final List<XNATExperiment> Result;
		public int totalRecords;

		public XNATExperimentResultSet(List<XNATExperiment> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public XNATExperimentResultSet()
		{
			this.Result = new ArrayList<XNATExperiment>();
			this.totalRecords = 0;
		}

		public void addXNATExperiment(XNATExperiment xnatExperiment)
		{
			this.Result.add(xnatExperiment);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
