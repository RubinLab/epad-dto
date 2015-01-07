package edu.stanford.epad.dtos;

import java.io.Serializable;

public class RemotePAC  implements Serializable {
	public final String pacID;
	public final String aeTitle;
	public final String hostname;
	public final int port;
	public final String queryModel; 	// "STUDYROOT","PATIENTROOT","PATIENTSTUDYONLY"
	public final String primaryDeviceType; // "WSD","ARCHIVE"
	
	
	public RemotePAC(String pacID, String aeTitle, String hostname,
			int port, String queryModel, String primaryDeviceType) {
		super();
		this.pacID = pacID;
		this.aeTitle = aeTitle;
		this.hostname = hostname;
		this.port = port;
		this.queryModel = queryModel;
		this.primaryDeviceType = primaryDeviceType;
	}
	
}
