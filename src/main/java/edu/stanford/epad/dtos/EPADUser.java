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
	public final boolean enabled, admin, passwordExpired;
	public final Set<String> permissions;
	public final EPADMessageList messages;
	public final Set<String> projects;
	public final Map<String,String> projectToRole;

	public EPADUser(String displayname, String username, String firstname, String lastname, String email, boolean enabled, boolean admin, boolean passwordExpired, String role, Set<String> permissions)
	{
		this.displayname = displayname;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.enabled = enabled;
		this.admin = admin;
		this.passwordExpired = passwordExpired;
		this.role = role;
		this.permissions = permissions;
		this.messages = null;
		this.projects = null;
		this.projectToRole = null;
	}

	public EPADUser(String displayname, String username, String firstname, String lastname, String email, boolean enabled, boolean admin, boolean passwordExpired, String role, Set<String> permissions, Set<String> projects, Map<String, String> projectToRole, EPADMessageList messages)
	{
		this.displayname = displayname;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.enabled = enabled;
		this.admin = admin;
		this.passwordExpired = passwordExpired;
		this.role = role;
		this.permissions = permissions;
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
