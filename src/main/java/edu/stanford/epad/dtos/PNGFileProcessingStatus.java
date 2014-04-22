package edu.stanford.epad.dtos;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum PNGFileProcessingStatus {
	NO_DICOM(1), IN_PIPELINE(2), DONE(3), ERROR(4);

	private final int statusCode;

	private static final Map<Integer, PNGFileProcessingStatus> lookup = new HashMap<Integer, PNGFileProcessingStatus>();

	static {
		for (PNGFileProcessingStatus s : EnumSet.allOf(PNGFileProcessingStatus.class))
			lookup.put(s.getCode(), s);
	}

	private PNGFileProcessingStatus(int statusCode)
	{
		this.statusCode = statusCode;
	}

	public int getCode()
	{
		return statusCode;
	}

	public static PNGFileProcessingStatus getValue(int statusCode)
	{
		PNGFileProcessingStatus pngFileProcessingStatus = lookup.get(statusCode);

		if (pngFileProcessingStatus == null)
			throw new IllegalArgumentException("Invalid status code " + statusCode + " for "
					+ PNGFileProcessingStatus.class.getName() + " enum");

		return pngFileProcessingStatus;
	}
}
