package edu.stanford.epad.dtos;

import java.io.Serializable;

import com.google.gson.Gson;

public class EPADError implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String message;
	public final String code;

	public EPADError(String code, String message)
	{
		this.code = code;
		this.message = message;
	}

	public EPADError(String message)
	{
		this.message = message;
		this.code = "";
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
