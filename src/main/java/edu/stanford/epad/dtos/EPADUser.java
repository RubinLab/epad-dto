package edu.stanford.epad.dtos;

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * A description of an EPAD user
 * 
 * @author dev
 */
public class EPADUser implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String displayname, username, firstname, lastname, email, role;
	public final EPADMessageList messages;

	public EPADUser(String displayname, String username, String firstname, String lastname, String email, String role)
	{
		this.displayname = displayname;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.role = role;
		this.messages = null;
	}

	public EPADUser(String displayname, String username, String firstname, String lastname, String email, String role, EPADMessageList messages)
	{
		this.displayname = displayname;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.role = role;
		this.messages = messages;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
