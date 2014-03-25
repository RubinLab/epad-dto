package edu.stanford.epad.dtos;

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * A description of a project returned from ePAD. Designed to be JSON serializable.
 * 
 * @author martin
 */
public class EPADProject implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String secondaryID, piLastName, description, name, id, piFirstName, uri;
	public final int numberOfSubjects;
	public final int numberOfStudies;
	public final int numberOfAnnotations;
	public final XNATUserList users;

	public EPADProject(String secondaryID, String piLastName, String description, String name, String id,
			String piFirstName, String uri, int numberOfSubjects, int numberOfStudies, int numberOfAnnotations,
			XNATUserList users)
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
		this.users = users;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
