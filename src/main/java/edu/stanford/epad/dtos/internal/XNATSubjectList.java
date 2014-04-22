package edu.stanford.epad.dtos.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

/**
 * A result from XNAT listing a set of subjects. This is the default structure returned from an XNAT subject query.
 * <p>
 * Example: <code>
 * {
 * "ResultSet":
 *  { "Result":
 *    [ 
 *      {"project":"PRJ1","insert_user":"bob","ID":"XNAT_S00002","insert_date":"...","label":"SID1","URI":"/data/subjects/XNAT_S00002", "src": ""},
 *    ], 
 *    "totalRecords": "1"
 *  }
 * }
 * </code>
 * 
 * @author martin
 */
public class XNATSubjectList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final XNATSubjectResultSet ResultSet;

	public XNATSubjectList(List<XNATSubject> Result)
	{
		this.ResultSet = new XNATSubjectResultSet(Result);
	}

	public XNATSubjectList()
	{
		this.ResultSet = new XNATSubjectResultSet();
	}

	public void addXNATSubject(XNATSubject xnatSubject)
	{
		this.ResultSet.addXNATSubject(xnatSubject);
	}

	public static XNATSubjectList emptySubjects()
	{
		return new XNATSubjectList();
	}

	public class XNATSubjectResultSet
	{
		public final List<XNATSubject> Result;
		public int totalRecords;

		public XNATSubjectResultSet(List<XNATSubject> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public XNATSubjectResultSet()
		{
			this.Result = new ArrayList<XNATSubject>();
			this.totalRecords = 0;
		}

		public void addXNATSubject(XNATSubject xnatSubject)
		{
			this.Result.add(xnatSubject);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
