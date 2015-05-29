package edu.stanford.epad.dtos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EPADTemplateContainer extends EPADFile {

	private static final long serialVersionUID = 1L;

	public String templateUID;
	public String templateName;
	public String templateType;
	public String templateCode;
	public String templateDescription;
	public String modality;
	
	public List<EPADTemplate> templates;
	
	public EPADTemplateContainer(String projectID, String patientID, String patientName,
			String studyUID, String seriesUID, String fileName,
			long fileLength, String fileType, String createdTime, String path,
			boolean enabled, String description) {
		super(projectID, patientID, patientName, studyUID, seriesUID, fileName,
				fileLength, fileType, createdTime, path, enabled, description);
	}

}
