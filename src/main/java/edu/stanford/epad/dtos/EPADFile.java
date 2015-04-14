package edu.stanford.epad.dtos;

//Copyright (c) 2014 The Board of Trustees of the Leland Stanford Junior University
//All rights reserved.
//
//Redistribution and use in source and binary forms, with or without modification, are permitted provided that
//the following conditions are met:
//
//Redistributions of source code must retain the above copyright notice, this list of conditions and the following
//disclaimer.
//
//Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the
//following disclaimer in the documentation and/or other materials provided with the distribution.
//
//Neither the name of The Board of Trustees of the Leland Stanford Junior University nor the names of its
//contributors (Daniel Rubin, et al) may be used to endorse or promote products derived from this software without
//specific prior written permission.
//
//THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
//INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
//DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
//SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
//SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
//WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE
//USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * A description of a non-dicom file returned from an ePAD query. Designed to be JSON serializable.
 * 
 * @author dev
 */
public class EPADFile implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String projectID, patientID, patientName, studyUID, seriesUID, fileName, fileType, createdTime;
	public final long fileLength;
	public final String path;
	public final boolean enabled;
	public final String description;
	
	public EPADFile(String projectID, String patientID, String patientName, String studyUID, String seriesUID,
			String fileName, long fileLength, String fileType, String createdTime, String path)
	{
		this.projectID = projectID;
		this.patientID = patientID;
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.patientName = patientName;
		this.fileName = fileName;
		this.fileLength = fileLength;
		this.fileType = fileType;
		this.createdTime = createdTime;
		this.path = path;
		this.enabled = true;
		this.description = "";
	}
	
	public EPADFile(String projectID, String patientID, String patientName, String studyUID, String seriesUID,
			String fileName, long fileLength, String fileType, String createdTime, String path, boolean enabled, String description)
	{
		this.projectID = projectID;
		this.patientID = patientID;
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.patientName = patientName;
		this.fileName = fileName;
		this.fileLength = fileLength;
		this.fileType = fileType;
		this.createdTime = createdTime;
		this.path = path;
		this.enabled = enabled;
		this.description = description;
	}

	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}