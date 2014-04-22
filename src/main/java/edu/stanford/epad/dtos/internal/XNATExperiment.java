package edu.stanford.epad.dtos.internal;

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * A description of an XNAT experiment. Designed to be JSON serializable.
 * 
 * @author martin
 */
public class XNATExperiment implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String project, xsiType, ID, insert_date, label, date, URI;

	public XNATExperiment(String project, String xsiType, String id, String insert_date, String label, String date,
			String uri)
	{
		this.project = project;
		this.xsiType = xsiType; // ePAD uses xnat:otherDicomSessionData
		this.ID = id; // This is the XNAT identifier
		this.insert_date = insert_date;
		this.label = label; // Label stores the DICOM study UID in ePAD
		this.date = date; // Experiment date
		this.URI = uri; // XNAT URI
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
