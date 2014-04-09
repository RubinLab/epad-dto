package edu.stanford.epad.dtos;

public enum DCM4CHEEStudySearchType {
	PATIENT_NAME("patientName"), PATIENT_ID("patientId"), ASSESION_NUM("accessionNum"), EXAM_TYPE("examType"), STUDY_DATE(
			"studyDate"), WORK_LIST_NAME("workListName"), STUDY_UID("studyUID");

	private String name;

	private DCM4CHEEStudySearchType(String type)
	{
		this.name = type;
	}

	public String getName()
	{
		return name;
	}
}
