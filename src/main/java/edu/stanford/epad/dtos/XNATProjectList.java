package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

/**
 * A result from XNAT listing a set of projects.
 * <p>
 * Example: <code>
 * {
 * "ResultSet":
 *  { "Result":
 *    [ 
 *     {"secondary_ID":"epad-xnat","pi_lastname":"MrPI","description":"", "name":"XNAT Project","ID":"EPAD_PROJECT","pi_firstname":"An","URI":"/data/projects/EPAD_PROJECT"},
 *    ], 
 *    "totalRecords": "1"
 *  }
 * }
 * </code>
 * 
 * @author martin
 */
public class XNATProjectList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final XNATProjectResultSet ResultSet;

	public XNATProjectList(List<XNATProject> Result)
	{
		this.ResultSet = new XNATProjectResultSet(Result);
	}

	public XNATProjectList()
	{
		this.ResultSet = new XNATProjectResultSet();
	}

	public void addXNATProject(XNATProject xnatProject)
	{
		this.ResultSet.addXNATProject(xnatProject);
	}

	public static XNATProjectList emptyProjects()
	{
		return new XNATProjectList();
	}

	public class XNATProjectResultSet
	{
		public final List<XNATProject> Result;
		public int totalRecords;

		public XNATProjectResultSet(List<XNATProject> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public XNATProjectResultSet()
		{
			this.Result = new ArrayList<XNATProject>();
			this.totalRecords = 0;
		}

		public void addXNATProject(XNATProject xnatProject)
		{
			this.Result.add(xnatProject);
			this.totalRecords++;
		}

	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
