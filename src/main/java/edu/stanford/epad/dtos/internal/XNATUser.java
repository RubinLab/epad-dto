package edu.stanford.epad.dtos.internal;

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * A description of an XNAT user
 * 
 * @author martin
 */
public class XNATUser implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String groupID, displayname, login, firstname, lastname, email;

	public XNATUser(String groupID, String displayname, String login, String firstname, String lastname, String email)
	{
		this.groupID = groupID;
		this.displayname = displayname;
		this.login = login;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
