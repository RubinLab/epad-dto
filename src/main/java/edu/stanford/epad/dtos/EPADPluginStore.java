package edu.stanford.epad.dtos;

import java.util.List;

public class EPADPluginStore extends EPADPlugin {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String imagePath,configXmlFile,pluginMathlabClass;
	boolean installed = false;
	
	public EPADPluginStore (String pluginId, String name, String description, String javaclass,String pluginMathlabClass, boolean installed , String imagePath, String configXmlFile){

		super(pluginId, name, description, javaclass, null, "", "","","",null);
		this.imagePath = imagePath;
		this.installed = installed;
		this.configXmlFile = configXmlFile;
		this.pluginMathlabClass = pluginMathlabClass;
		
	}
	
	public String getImagePath () {
		return this.imagePath;
	}
	
	public boolean getInstalled(){
		return this.installed;
	}
	public String getConfigXmlFile(){
		return this.configXmlFile;
	}
	
}
