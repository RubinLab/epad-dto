/*******************************************************************************
 * Copyright (c) 2015 The Board of Trustees of the Leland Stanford Junior University
 * BY CLICKING ON "ACCEPT," DOWNLOADING, OR OTHERWISE USING EPAD, YOU AGREE TO THE FOLLOWING TERMS AND CONDITIONS:
 * STANFORD ACADEMIC SOFTWARE SOURCE CODE LICENSE FOR
 * "ePAD Annotation Platform for Radiology Images"
 *
 * This Agreement covers contributions to and downloads from the ePAD project ("ePAD") maintained by The Board of Trustees 
 * of the Leland Stanford Junior University ("Stanford"). 
 *
 * *	Part A applies to downloads of ePAD source code and/or data from ePAD. 
 *
 * *	Part B applies to contributions of software and/or data to ePAD (including making revisions of or additions to code 
 * and/or data already in ePAD), which may include source or object code. 
 *
 * Your download, copying, modifying, displaying, distributing or use of any ePAD software and/or data from ePAD 
 * (collectively, the "Software") is subject to Part A. Your contribution of software and/or data to ePAD (including any 
 * that occurred prior to the first publication of this Agreement) is a "Contribution" subject to Part B. Both Parts A and 
 * B shall be governed by and construed in accordance with the laws of the State of California without regard to principles 
 * of conflicts of law. Any legal action involving this Agreement or the Research Program will be adjudicated in the State 
 * of California. This Agreement shall supersede and replace any license terms that you may have agreed to previously with 
 * respect to ePAD.
 *
 * PART A. DOWNLOADING AGREEMENT - LICENSE FROM STANFORD WITH RIGHT TO SUBLICENSE ("SOFTWARE LICENSE").
 * 1. As used in this Software License, "you" means the individual downloading and/or using, reproducing, modifying, 
 * displaying and/or distributing Software and the institution or entity which employs or is otherwise affiliated with you. 
 * Stanford  hereby grants you, with right to sublicense, with respect to Stanford's rights in the Software, a 
 * royalty-free, non-exclusive license to use, reproduce, make derivative works of, display and distribute the Software, 
 * provided that: (a) you adhere to all of the terms and conditions of this Software License; (b) in connection with any 
 * copy, distribution of, or sublicense of all or any portion of the Software, the terms and conditions in this Software 
 * License shall appear in and shall apply to such copy and such sublicense, including without limitation all source and 
 * executable forms and on any user documentation, prefaced with the following words: "All or portions of this licensed 
 * product  have been obtained under license from The Board of Trustees of the Leland Stanford Junior University. and are 
 * subject to the following terms and conditions" AND any user interface to the Software or the "About" information display 
 * in the Software will display the following: "Powered by ePAD http://epad.stanford.edu;" (c) you preserve and maintain 
 * all applicable attributions, copyright notices and licenses included in or applicable to the Software; (d) modified 
 * versions of the Software must be clearly identified and marked as such, and must not be misrepresented as being the 
 * original Software; and (e) you consider making, but are under no obligation to make, the source code of any of your 
 * modifications to the Software freely available to others on an open source basis.
 *
 * 2. The license granted in this Software License includes without limitation the right to (i) incorporate the Software 
 * into your proprietary programs (subject to any restrictions applicable to such programs), (ii) add your own copyright 
 * statement to your modifications of the Software, and (iii) provide additional or different license terms and conditions 
 * in your sublicenses of modifications of the Software; provided that in each case your use, reproduction or distribution 
 * of such modifications otherwise complies with the conditions stated in this Software License.
 * 3. This Software License does not grant any rights with respect to third party software, except those rights that 
 * Stanford has been authorized by a third party to grant to you, and accordingly you are solely responsible for (i) 
 * obtaining any permissions from third parties that you need to use, reproduce, make derivative works of, display and 
 * distribute the Software, and (ii) informing your sublicensees, including without limitation your end-users, of their 
 * obligations to secure any such required permissions.
 * 4. You agree that you will use the Software in compliance with all applicable laws, policies and regulations including, 
 * but not limited to, those applicable to Personal Health Information ("PHI") and subject to the Institutional Review 
 * Board requirements of the your institution, if applicable. Licensee acknowledges and agrees that the Software is not 
 * FDA-approved, is intended only for research, and may not be used for clinical treatment purposes. Any commercialization 
 * of the Software is at the sole risk of you and the party or parties engaged in such commercialization. You further agree 
 * to use, reproduce, make derivative works of, display and distribute the Software in compliance with all applicable 
 * governmental laws, regulations and orders, including without limitation those relating to export and import control.
 * 5. You or your institution, as applicable, will indemnify, hold harmless, and defend Stanford against any third party 
 * claim of any kind made against Stanford arising out of or related to the exercise of any rights granted under this 
 * Agreement, the provision of Software, or the breach of this Agreement. Stanford provides the Software AS IS and WITH ALL 
 * FAULTS.  Stanford makes no representations and extends no warranties of any kind, either express or implied.  Among 
 * other things, Stanford disclaims any express or implied warranty in the Software:
 * (a)  of merchantability, of fitness for a particular purpose,
 * (b)  of non-infringement or 
 * (c)  arising out of any course of dealing.
 *
 * Title and copyright to the Program and any associated documentation shall at all times remain with Stanford, and 
 * Licensee agrees to preserve same. Stanford reserves the right to license the Program at any time for a fee.
 * 6. None of the names, logos or trademarks of Stanford or any of Stanford's affiliates or any of the Contributors, or any 
 * funding agency, may be used to endorse or promote products produced in whole or in part by operation of the Software or 
 * derived from or based on the Software without specific prior written permission from the applicable party.
 * 7. Any use, reproduction or distribution of the Software which is not in accordance with this Software License shall 
 * automatically revoke all rights granted to you under this Software License and render Paragraphs 1 and 2 of this 
 * Software License null and void.
 * 8. This Software License does not grant any rights in or to any intellectual property owned by Stanford or any 
 * Contributor except those rights expressly granted hereunder.
 *
 * PART B. CONTRIBUTION AGREEMENT - LICENSE TO STANFORD WITH RIGHT TO SUBLICENSE ("CONTRIBUTION AGREEMENT").
 * 1. As used in this Contribution Agreement, "you" means an individual providing a Contribution to ePAD and the 
 * institution or entity which employs or is otherwise affiliated with you.
 * 2. This Contribution Agreement applies to all Contributions made to ePAD at any time. By making a Contribution you 
 * represent that: (i) you are legally authorized and entitled by ownership or license to make such Contribution and to 
 * grant all licenses granted in this Contribution Agreement with respect to such Contribution; (ii) if your Contribution 
 * includes any patient data, all such data is de-identified in accordance with U.S. confidentiality and security laws and 
 * requirements, including but not limited to the Health Insurance Portability and Accountability Act (HIPAA) and its 
 * regulations, and your disclosure of such data for the purposes contemplated by this Agreement is properly authorized and 
 * in compliance with all applicable laws and regulations; and (iii) you have preserved in the Contribution all applicable 
 * attributions, copyright notices and licenses for any third party software or data included in the Contribution.
 * 3. Except for the licenses you grant in this Agreement, you reserve all right, title and interest in your Contribution.
 * 4. You hereby grant to Stanford, with the right to sublicense, a perpetual, worldwide, non-exclusive, no charge, 
 * royalty-free, irrevocable license to use, reproduce, make derivative works of, display and distribute the Contribution. 
 * If your Contribution is protected by patent, you hereby grant to Stanford, with the right to sublicense, a perpetual, 
 * worldwide, non-exclusive, no-charge, royalty-free, irrevocable license under your interest in patent rights embodied in 
 * the Contribution, to make, have made, use, sell and otherwise transfer your Contribution, alone or in combination with 
 * ePAD or otherwise.
 * 5. You acknowledge and agree that Stanford ham may incorporate your Contribution into ePAD and may make your 
 * Contribution as incorporated available to members of the public on an open source basis under terms substantially in 
 * accordance with the Software License set forth in Part A of this Agreement. You further acknowledge and agree that 
 * Stanford shall have no liability arising in connection with claims resulting from your breach of any of the terms of 
 * this Agreement.
 * 6. YOU WARRANT THAT TO THE BEST OF YOUR KNOWLEDGE YOUR CONTRIBUTION DOES NOT CONTAIN ANY CODE OBTAINED BY YOU UNDER AN 
 * OPEN SOURCE LICENSE THAT REQUIRES OR PRESCRIBES DISTRBUTION OF DERIVATIVE WORKS UNDER SUCH OPEN SOURCE LICENSE. (By way 
 * of non-limiting example, you will not contribute any code obtained by you under the GNU General Public License or other 
 * so-called "reciprocal" license.)
 *******************************************************************************/
package edu.stanford.epad.dtos;

import java.io.Serializable;

import com.google.gson.Gson;

import edu.stanford.epad.dtos.internal.DICOMElementList;

/**
 * A description of an image returned from ePAD. Designed to be JSON serializable.
 * 
 * 
 * @author martin
 */
public class EPADImage implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String projectID, patientID, studyUID, seriesUID, imageUID, classUID;
	public final String insertDate, imageDate, sliceLocation;
	public final int instanceNumber;
	public final String losslessImage, lossyImage;
	public final DICOMElementList dicomElements;
	public final DICOMElementList defaultDICOMElements;
	public final int numberOfFrames;
	public final boolean isDSO;
	public boolean multiFrameImage = false;
    //ml suv calc
	public double rescaleIntercept, rescaleSlope;
	//ml for slice ordering when instance number is always 1
	public Double sliceOrder;
	
	
	
	public EPADImage(String projectID, String patientID, String studyUID, String seriesUID, String imageUID,
			String classUID, String insertDate, String imageDate, String sliceLocation, int instanceNumber,
			String losslessImage, String lossyImage, DICOMElementList dicomElements, DICOMElementList defaultDICOMElements,
			int numberOfFrames, boolean isDSO)
	{
		this.projectID = projectID;
		this.patientID = patientID;
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.imageUID = imageUID;
		this.classUID = classUID;
		this.insertDate = insertDate;
		this.imageDate = imageDate;
		this.sliceLocation = sliceLocation;
		this.instanceNumber = instanceNumber;
		this.losslessImage = losslessImage;
		this.lossyImage = lossyImage;
		this.dicomElements = dicomElements;
		this.defaultDICOMElements = defaultDICOMElements;
		this.numberOfFrames = numberOfFrames;
		this.isDSO = isDSO;
		this.rescaleIntercept = 0;
		this.rescaleSlope = 0;
		try {
			//use slice location as order for now
			this.sliceOrder = Double.parseDouble(sliceLocation);
		} catch (Exception e) {
			this.sliceOrder=0.0;
		}
	}
	
	
	public EPADImage(String projectID, String patientID, String studyUID, String seriesUID, String imageUID,
			String classUID, String insertDate, String imageDate, String sliceLocation, int instanceNumber,
			String losslessImage, String lossyImage, DICOMElementList dicomElements, DICOMElementList defaultDICOMElements,
			int numberOfFrames, boolean isDSO, String rescaleIntercept, String rescaleSlope)
	{
		this.projectID = projectID;
		this.patientID = patientID;
		this.studyUID = studyUID;
		this.seriesUID = seriesUID;
		this.imageUID = imageUID;
		this.classUID = classUID;
		this.insertDate = insertDate;
		this.imageDate = imageDate;
		this.sliceLocation = sliceLocation;
		this.instanceNumber = instanceNumber;
		this.losslessImage = losslessImage;
		this.lossyImage = lossyImage;
		this.dicomElements = dicomElements;
		this.defaultDICOMElements = defaultDICOMElements;
		this.numberOfFrames = numberOfFrames;
		this.isDSO = isDSO;
		try {
			this.rescaleIntercept = Double.parseDouble(rescaleIntercept);
			this.rescaleSlope = Double.parseDouble(rescaleSlope);
			//use slice location as order for now
			this.sliceOrder = Double.parseDouble(sliceLocation);
		} catch (Exception e) {
			this.rescaleIntercept = 0;
			this.rescaleSlope = 0;
			this.sliceOrder=0.0;
		}
	}
	
//	public EPADImage(String projectID, String patientID, String studyUID, String seriesUID, String imageUID,
//			String classUID, String insertDate, String imageDate, String sliceLocation, int instanceNumber,
//			String losslessImage, String lossyImage, DICOMElementList dicomElements, DICOMElementList defaultDICOMElements,
//			int numberOfFrames, boolean isDSO, String rescaleIntercept, String rescaleSlope, String imageOrientation, String imagePosition)
//	{
//		this.projectID = projectID;
//		this.patientID = patientID;
//		this.studyUID = studyUID;
//		this.seriesUID = seriesUID;
//		this.imageUID = imageUID;
//		this.classUID = classUID;
//		this.insertDate = insertDate;
//		this.imageDate = imageDate;
//		this.sliceLocation = sliceLocation;
//		this.instanceNumber = instanceNumber;
//		this.losslessImage = losslessImage;
//		this.lossyImage = lossyImage;
//		this.dicomElements = dicomElements;
//		this.defaultDICOMElements = defaultDICOMElements;
//		this.numberOfFrames = numberOfFrames;
//		this.isDSO = isDSO;
//		try {
//			this.rescaleIntercept = Double.parseDouble(rescaleIntercept);
//			this.rescaleSlope = Double.parseDouble(rescaleSlope);
//		} catch (Exception e) {
//			this.rescaleIntercept = 0;
//			this.rescaleSlope = 0;
//		}
//		
//
//		this.sliceOrder=calcSliceOrder(imageOrientation, imagePosition);
//	}
	
//	//calculates the slice order using the image position and orientation to find the correct order
//	public Double calcSliceOrder(String imageOrientation, String imagePosition) {
//		//ted's idl code  dctag orientation, iptag position
////		dc = DOUBLE(REFORM(*dctag.value, 3, 2))
////		; dc is a 3x2 array containing the x and y direction cosines obtained from the value of dctag
////        dc = CROSS(dc[*,0], dc[*,1])
////        ; dc is the z direction cosine obtained by the cross product
////        dummy = MAX(ABS(dc), sldir)
////        ; sldir will be the index of the largest element of dc
////        slorder = DOUBLE((*iptag.value)[sldir])/dc[sldir]
////        ; slorder is the slice index obtained by extracting the appropriate element of the image position (iptag)
//		
//	 	//do not try if one of them is empty
//		if (imageOrientation.equals("") || imagePosition.equals("")) return 0.0;
//		//extact dc
//		String[] dcStr = imageOrientation.split("\\\\");
//		Double[][] dc = new Double[2][3];
//		for (int row=0; row<2; row++) {
//			for (int col=0; col<3; col++) {
//				dc[row][col] = Double.parseDouble(dcStr[row*3+col]);					
//			}
//		}
//		
//		
//		//calc cross product
//		Double z[]=new Double[3];
//		
////		Vector A be in the y direction (Ax=0 , Ay=1 , Az = 0)
////										dc[0][0] dc[0][1] dc[0][2] 
////		Vector B be in the x direction (Bx=1 , By=0 , Bz = 0)
////										dc[1][0] dc[1][1] dc[1][2] 
////
////		so, Vector A×B components:
////
////		x = Ay * Bz - By * Az = 0
////		y = Az * Bx - Bz * Ax = 0
////		z = Ax * By - Bx * Ay = -1
//		
//		z[0] = dc[0][1] * dc[1][2] - dc[1][1] * dc[0][2];
//        z[1] = dc[0][2] * dc[1][0] - dc[1][2] * dc[0][0];
//        z[2] = dc[0][0] * dc[1][1] - dc[1][0] * dc[0][1];
//        
//        System.out.println(" dc0 "+ dc[0][0] + " " + dc[0][1] + " " +dc[0][2]);
//        System.out.println(" dc1 "+ dc[1][0] + " " + dc[1][1] + " " +dc[1][2]);
//        
//        System.out.println(" z "+ z[0] + " " + z[1] + " " +z[2]);
//        //find max index
//        int maxZ = (z[0]>z[1]? (z[0]>z[2]? 0:2):(z[1]>z[2]? 1:2));
//        //extract ip
//        String[] ipStr = imagePosition.split("\\\\");
//        Double[] ip = new Double[3];
//        for (int col=0; col<3; col++) {
//			ip[col] = Double.parseDouble(ipStr[col]);
//		}
//        System.out.println("ip "+ ip[maxZ] + " z "+ z[maxZ]);
//        //calc slOrder
//        return ip[maxZ]/z[maxZ];
//	}

	public Double getSliceOrder() {
		return sliceOrder;
	}


	public void setSliceOrder(Double sliceOrder) {
		this.sliceOrder = sliceOrder;
	}


	public String toJSON()
	{
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
