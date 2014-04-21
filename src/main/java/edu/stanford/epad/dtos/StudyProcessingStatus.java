package edu.stanford.epad.dtos;

/**
 * 
 * 
 * 
 * @author martin
 */
public enum StudyProcessingStatus {
	STUDY_STATUS_PROCESSING(1), STUDY_STATUS_COMPLETED(2), STUDY_STATUS_ERROR_MISSING_DICOM(3), STUDY_STATUS_ERROR_MISSING_PNG(
			4);

	private final int statusCode;

	private StudyProcessingStatus(int status)
	{
		this.statusCode = status;
	}

	public int getCode()
	{
		return statusCode;
	}
}
