package edu.stanford.epad.dtos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EPADTemplate {

	private static final long serialVersionUID = 1L;
		
	public String templateUID;
	public String templateName;
	public String templateType;
	public String templateCode;
	public String templateDescription;
	public String modality;
	public boolean defaultTemplate;
	
	public EPADTemplate(String templateUID, String templateName,
			String templateType, String templateCode,
			String templateDescription, String modality) {
		super();
		this.templateUID = templateUID;
		this.templateName = templateName;
		this.templateType = templateType;
		this.templateCode = templateCode;
		this.templateDescription = templateDescription;
		this.modality = modality;
	}
	public String getTemplateUID() {
		return templateUID;
	}
	public void setTemplateUID(String templateUID) {
		this.templateUID = templateUID;
	}
	public String getTemplateName() {
		return templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getTemplateType() {
		return templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}
	public String getTemplateCode() {
		return templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}
	public String getTemplateDescription() {
		return templateDescription;
	}
	public void setTemplateDescription(String templateDescription) {
		this.templateDescription = templateDescription;
	}
	public String getModality() {
		return modality;
	}
	public void setModality(String modality) {
		this.modality = modality;
	}

}
