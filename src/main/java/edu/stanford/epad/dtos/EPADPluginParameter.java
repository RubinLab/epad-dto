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

	public final String name, defaultValue;

	public final String type,description;
	
	public EPADPluginParameter(String id, String projectId, String pluginId, String name, String defaultValue, String type, String description)
	{
		this.name = name;
		this.defaultValue = defaultValue;
		this.type = type;
		this.description=description;
		
	}
	
	public EPADPluginParameter(String id, String projectId, String pluginId, String name, String defaultValue)
	{
		this.name = name;
		this.defaultValue = defaultValue;
		this.type = "";
		this.description="";
		
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
