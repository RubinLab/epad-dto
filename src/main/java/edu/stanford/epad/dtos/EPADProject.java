package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;

/**
 * A description of a project returned from ePAD. Designed to be JSON serializable.
 * 
 * @author martin
 */
public class EPADProject implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String id, name, description, secondaryID, piLastName, piFirstName, uri;
	public final int numberOfSubjects;
	public final int numberOfStudies;
	public final int numberOfAnnotations;
	public final Set<String> subjectIDs;
	public final Set<String> loginNames;
	public Map<String,String> loginToRole = null;
	public String defaultTemplate;

	public EPADProject(String secondaryID, String piLastName, String description, String name, String id,
			String piFirstName, String uri, int numberOfSubjects, int numberOfStudies, int numberOfAnnotations,
			Set<String> subjectIDs, Set<String> loginNames)
	{
		this.secondaryID = secondaryID;
		this.piLastName = piLastName;
		this.description = description;
		this.name = name;
		this.id = id;
		this.piFirstName = piFirstName;
		this.uri = uri;
		this.numberOfSubjects = numberOfSubjects;
		this.numberOfStudies = numberOfStudies;
		this.numberOfAnnotations = numberOfAnnotations;
		this.loginNames = new HashSet<String>(loginNames);
		this.subjectIDs = new HashSet<String>(subjectIDs);
	}

	public EPADProject(String secondaryID, String piLastName, String description, String name, String id,
			String piFirstName, String uri, int numberOfSubjects, int numberOfStudies, int numberOfAnnotations,
			Set<String> subjectIDs, Set<String> loginNames, Map<String,String>loginToRole)
	{
		this.secondaryID = secondaryID;
		this.piLastName = piLastName;
		this.description = description;
		this.name = name;
		this.id = id;
		this.piFirstName = piFirstName;
		this.uri = uri;
		this.numberOfSubjects = numberOfSubjects;
		this.numberOfStudies = numberOfStudies;
		this.numberOfAnnotations = numberOfAnnotations;
		this.loginNames = new HashSet<String>(loginNames);
		this.subjectIDs = new HashSet<String>(subjectIDs);
		this.loginToRole = loginToRole;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
