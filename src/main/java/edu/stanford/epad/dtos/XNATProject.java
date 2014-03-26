package edu.stanford.epad.dtos;

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * A description of an XNAT project. This is the default structure returned from an XNAT project query. Designed to be
 * JSON serializable.
 * 
 * @author martin
 */
public class XNATProject implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String secondary_ID, pi_lastname, description, name, ID, pi_firstname, URI;

	public XNATProject(String secondaryID, String piLastName, String description, String name, String id,
			String piFirstName, String uri)
	{
		this.secondary_ID = secondaryID;
		this.pi_lastname = piLastName;
		this.description = description;
		this.name = name;
		this.ID = id;
		this.pi_firstname = piFirstName;
		this.URI = uri;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
