package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;

/**
 * A description of an EPAD user
 * 
 * @author dev
 */
public class EPADUser implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String displayname, username, firstname, lastname, email;
	public final String role; // Project specific role only
	public final boolean enabled, admin;
	public final EPADMessageList messages;
	public final Set<String> projects;
	public final Map<String,String> projectToRole;

	public EPADUser(String displayname, String username, String firstname, String lastname, String email, boolean enabled, boolean admin, String role)
	{
		this.displayname = displayname;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.enabled = enabled;
		this.admin = admin;
		this.role = role;
		this.messages = null;
		this.projects = null;
		this.projectToRole = null;
	}

	public EPADUser(String displayname, String username, String firstname, String lastname, String email, boolean enabled, boolean admin, String role, Set<String> projects, Map<String, String> projectToRole, EPADMessageList messages)
	{
		this.displayname = displayname;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.enabled = enabled;
		this.admin = admin;
		this.role = role;
		this.projects = projects;
		this.projectToRole = projectToRole;
		this.messages = messages;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
