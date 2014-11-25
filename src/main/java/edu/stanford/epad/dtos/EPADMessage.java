package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.Date;

import org.apache.log4j.Level;

import com.google.gson.Gson;

public class EPADMessage implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final Date date;
	public final String message;
	public final String level; // changed to string, because gson can't handle it

	public EPADMessage(String message)
	{
		this.message = message;
		this.level = Level.ERROR.toString();
		date = new Date();
	}

	public EPADMessage(String message, Level level)
	{
		this.message = message;
		this.level = level.toString();
		date = new Date();
	}

	public EPADMessage(Date date, String message, Level level)
	{
		this.date = date;
		this.message = message;
		this.level = level.toString();
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
