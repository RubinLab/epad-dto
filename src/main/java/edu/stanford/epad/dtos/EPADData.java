package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;

/**
 * A description of an EPAD obejct
 * 
 * @author dev
 */
public class EPADData implements Serializable
{
	private static final long serialVersionUID = 1L;

	public String id, name, description, status;
	public boolean alert = false;

	public EPADData(String id, String name, String description, String status) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.status = status;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
