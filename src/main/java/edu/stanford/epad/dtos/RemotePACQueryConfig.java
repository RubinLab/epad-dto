package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class RemotePACQueryConfig  implements Serializable {
	public final String pacID;
	public final String requestor; // Username of requestor
	public final String subjectID; 
	public final String projectID; 
	public final String modality; 
	public final String period; 
	public final boolean enabled; 
	public final String studyDate; 
	public final String lastQueryTime; 
	public final String lastQueryStatus;
	
	public RemotePACQueryConfig(String pacID, String requestor,
			String subjectID, String projectID, String modality, String period,
			boolean enabled, String studyDate, String lastQueryTime,
			String lastQueryStatus) {
		super();
		this.pacID = pacID;
		this.requestor = requestor;
		this.subjectID = subjectID;
		this.projectID = projectID;
		this.modality = modality;
		this.period = period;
		this.enabled = enabled;
		this.studyDate = studyDate;
		this.lastQueryTime = lastQueryTime;
		this.lastQueryStatus = lastQueryStatus;
	} 
	

	
}
