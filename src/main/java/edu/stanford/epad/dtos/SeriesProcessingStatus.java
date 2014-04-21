package edu.stanford.epad.dtos;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum SeriesProcessingStatus {
	NO_DICOM(1), IN_PIPELINE(2), DONE(3), ERROR(4);

	private final int statusCode;

	private static final Map<Integer, SeriesProcessingStatus> lookup = new HashMap<Integer, SeriesProcessingStatus>();

	static {
		for (SeriesProcessingStatus s : EnumSet.allOf(SeriesProcessingStatus.class))
			lookup.put(s.getCode(), s);
	}

	private SeriesProcessingStatus(int status)
	{
		this.statusCode = status;
	}

	public int getCode()
	{
		return statusCode;
	}

	public static SeriesProcessingStatus getValue(int statusCode)
	{
		SeriesProcessingStatus seriesProcessingStatus = lookup.get(statusCode);

		if (seriesProcessingStatus == null)
			throw new IllegalArgumentException("Invalid status code " + statusCode + " for "
					+ SeriesProcessingStatus.class.getName() + " enum");

		return seriesProcessingStatus;
	}
}
