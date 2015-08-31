package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;

/**
 * A description of a plugin parameter returned from ePAD. Designed to be JSON serializable.
 * 
 * @author Emel Alkim
 */
public class EPADPluginParameter implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String id, projectId, templateCode, name, defaultValue;
	

	public EPADPluginParameter(String id, String projectId, String templateCode, String name, String defaultValue)
	{
		this.id = id;
		this.projectId = projectId;
		this.templateCode = templateCode;
		this.name = name;
		this.defaultValue = defaultValue;
		
	}

	
	public String getId() {
		return id;
	}


	public String getProjectId() {
		return projectId;
	}


	public String getTemplateCode() {
		return templateCode;
	}


	public String getName() {
		return name;
	}


	public String getDefaultValue() {
		return defaultValue;
	}


	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
