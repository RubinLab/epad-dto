package edu.stanford.epad.dtos.internal;

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * A description of an XNAT subject. This is the default structure returned from an XNAT subjects query.
 * 
 * @author martin
 * @see XNATSubjectList
 */
public class XNATSubject implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String project, insert_user, ID, insert_date, label, URI, src;

	public XNATSubject(String project, String insert_user, String id, String insert_date, String label, String uri,
			String src)
	{
		this.project = project;
		this.insert_user = insert_user;
		this.ID = id;
		this.insert_date = insert_date;
		this.label = label; // We store the DICOM patient ID in this field
		this.src = src; // We store the DICOM patient name in this field
		this.URI = uri;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
