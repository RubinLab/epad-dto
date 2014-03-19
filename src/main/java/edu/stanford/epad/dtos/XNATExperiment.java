package edu.stanford.epad.dtos;

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * A description of an XNAT experiment.
 * <p>
 * Example query:
 * <p>
 * <code>curl -b JSESSIONID=[session_key] -X GET "http:[host:port]/epad/projects/[project_id]/subjects/[subject_id]/experiments"</code>
 * <p>
 * Redirects to the XNAT call <code>/xnat/data/projects/..</code>, which returns a JSON-specified list of subjects for
 * the specified project, e.g.,
 * <p>
 * <code>
 * {
 * "ResultSet":
 *  { "Result":
 *    [ 
 *      {"project":"PRJ1","xsiType":"...","ID":"...","insert_date":"...","label":"SID1", "date":"...", "URI":"/data/subjects/EPAD_S00002"}  
 *    ], 
 *    "totalRecords" : "1"
 *  }
 * }
 * </code>
 * 
 * @author martin
 */
public class XNATExperiment implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String project, xsiType, ID, insert_date, label, date, URI;

	public XNATExperiment(String project, String xsiType, String id, String insert_date, String label, String date,
			String uri)
	{
		this.project = project;
		this.xsiType = xsiType;
		this.ID = id;
		this.insert_date = insert_date;
		this.label = label;
		this.date = date;
		this.URI = uri;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
