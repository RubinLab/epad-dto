package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;

/**
 * A description of a plugin returned from ePAD. Designed to be JSON serializable.
 * 
 * @author Emel Alkim
 */
public class EPADPlugin implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String pluginId, name, description, javaclass, status, modality;
	public final Boolean enabled; 
	public final String projectId,projectName;
	public final List<EPADPluginParameter> parameters;

	public EPADPlugin( String pluginId, String name, String description, String javaclass, Boolean enabled, String status, String modality,String projectId,String projectName,List<EPADPluginParameter> parameters)
	{
		this.pluginId = pluginId;
		this.name = name;
		this.description = description;
		this.javaclass=javaclass;
		this.enabled=enabled;
		this.status=status;
		this.modality=modality;
		this.projectId=projectId;
		this.projectName=projectName;
		this.parameters=parameters;
		
	}

	
	
	public String getPluginId() {
		return pluginId;
	}




	public String getName() {
		return name;
	}




	public String getDescription() {
		return description;
	}




	public String getJavaclass() {
		return javaclass;
	}




	public String getStatus() {
		return status;
	}

	public String getModality() {
		return modality;
	}



	public Boolean getEnabled() {
		return enabled;
	}

	



	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
