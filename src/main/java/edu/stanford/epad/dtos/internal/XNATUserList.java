package edu.stanford.epad.dtos.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;

/**
 * Represents a list of XNAT users.
 * 
 * 
 * @author martin
 */
public class XNATUserList implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final XNATUserResultSet ResultSet;

	public XNATUserList(List<XNATUser> Result)
	{
		this.ResultSet = new XNATUserResultSet(Result);
	}

	public XNATUserList()
	{
		this.ResultSet = new XNATUserResultSet();
	}

	public void addXNATUser(XNATUser XNATUser)
	{
		this.ResultSet.addXNATUser(XNATUser);
	}

	public static XNATUserList emptyUsers()
	{
		return new XNATUserList();
	}

	public Set<String> getLoginNames()
	{
		Set<String> loginNames = new HashSet<String>();

		for (XNATUser xnatUser : ResultSet.Result)
			loginNames.add(xnatUser.login);

		return loginNames;
	}

	/*
	 * Get Roles for each user
	 * Role = Owners, Members, Collaborators
	 */
	public Map<String,String> getRoles()
	{
		Map<String,String> loginToRole = new HashMap<String, String>();

		for (XNATUser xnatUser : ResultSet.Result)
			loginToRole.put(xnatUser.login, xnatUser.displayname);

		return loginToRole;
	}

	public class XNATUserResultSet
	{
		public final List<XNATUser> Result;
		public int totalRecords;

		public XNATUserResultSet(List<XNATUser> Result)
		{
			this.Result = Collections.unmodifiableList(Result);
			this.totalRecords = Result.size();
		}

		public XNATUserResultSet()
		{
			this.Result = new ArrayList<XNATUser>();
			this.totalRecords = 0;
		}

		public void addXNATUser(XNATUser XNATUser)
		{
			this.Result.add(XNATUser);
			this.totalRecords++;
		}
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
