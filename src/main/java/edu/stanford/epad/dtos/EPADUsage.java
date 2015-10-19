package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.google.gson.Gson;

/**
 * Epad Usage data.
 * 
 * @author devg
 */
public class EPADUsage implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String host;
	public final int numOfUsers;
	public final int numOfProjects;
	public final int numOfPatients;
	public final int numOfStudies;
	public final int numOfSeries;
	public final int numOfAims;
	public final int numOfDSOs;
	public final int numOfPacs;
	public final int numOfAutoQueries;
	public final int numOfWorkLists;
	public int numOfFiles;
	public int numOfTemplates;
	public int numOfPlugins;
	public final String usageTime;

	public EPADUsage(String host, int numOfUsers, int numOfProjects,
			int numOfPatients, int numOfStudies, int numOfSeries,
			int numOfAims, int numOfDSOs, int numOfPacs, int numOfAutoQueries,
			int numOfWorkLists, String usageTime) {
		super();
		this.host = host;
		this.numOfUsers = numOfUsers;
		this.numOfProjects = numOfProjects;
		this.numOfPatients = numOfPatients;
		this.numOfStudies = numOfStudies;
		this.numOfSeries = numOfSeries;
		this.numOfAims = numOfAims;
		this.numOfDSOs = numOfDSOs;
		this.numOfPacs = numOfPacs;
		this.numOfAutoQueries = numOfAutoQueries;
		this.numOfWorkLists = numOfWorkLists;
		this.usageTime = usageTime;
	}

	public EPADUsage(String host, int numOfUsers, int numOfProjects,
			int numOfPatients, int numOfStudies, int numOfSeries,
			int numOfAims, int numOfDSOs, int numOfPacs, int numOfAutoQueries,
			int numOfWorkLists, int numOfFiles, int numOfTemplates, int numOfPlugins, String usageTime) {
		super();
		this.host = host;
		this.numOfUsers = numOfUsers;
		this.numOfProjects = numOfProjects;
		this.numOfPatients = numOfPatients;
		this.numOfStudies = numOfStudies;
		this.numOfSeries = numOfSeries;
		this.numOfAims = numOfAims;
		this.numOfDSOs = numOfDSOs;
		this.numOfPacs = numOfPacs;
		this.numOfAutoQueries = numOfAutoQueries;
		this.numOfWorkLists = numOfWorkLists;
		this.numOfFiles = numOfFiles;
		this.numOfTemplates = numOfTemplates;
		this.numOfPlugins = numOfPlugins;
		this.usageTime = usageTime;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
