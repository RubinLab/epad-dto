package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.Date;

import com.google.gson.Gson;

public class TaskStatus implements Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String TASK_UPLOAD = "File Upload";
	public static final String TASK_UNZIP = "File Unzip";
	public static final String TASK_ADD_TO_PROJECT = "Add Studies/Aims/Files to Project";
	public static final String TASK_DCM4CHE_SEND = "Send Dicoms to DCM4CHE";
	public static final String TASK_DICOM_PNG_GEN = "Generate Series PNGs";
	public static final String TASK_DSO_PNG_GEN = "Generate DSO PNGs";
	public static final String TASK_DELETE_PATIENT = "Delete Patient";
	public static final String TASK_DELETE_STUDY = "Delete Study";
	public static final String TASK_RT_PROCESS = "Process RT Dicom";
	public static final String TASK_RT_MATLAB = "Process RT Dicom-MATLAB";
	public static final String TASK_PLUGIN = "Plugin Process";
	public static final String TASK_TCIA_DOWNLOAD = "TCIA DOWNLOAD";
	
	public String type;
	public String target;
	public String username;
	public String status;
	public String starttime;
	public String completetime;
	public String statustime;

	public TaskStatus() {
		super();
	}

	public TaskStatus(String type, String username,
			String target, String status, String starttime, String completetime, String statustime) {
		super();
		this.type = type;
		this.username = username;
		this.target = target;
		this.status = status;
		this.starttime = starttime;
		this.completetime = completetime;
		this.statustime = statustime;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
