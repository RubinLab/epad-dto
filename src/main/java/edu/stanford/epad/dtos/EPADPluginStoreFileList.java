package edu.stanford.epad.dtos;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class EPADPluginStoreFileList  implements Serializable{
	/**
	 * 
	 */
	String pluginId, pluginName, pluginDescription, pluginJavaclass, pluginEnabled, pluginStatus,pluginCategory;
	
	private static final long serialVersionUID = 1L;
	
	public EPADPluginStoreFileList (){
		
	}
	public void readPluginFilePropFromXml(String filePathVar) throws ParserConfigurationException, SAXException, IOException{
		 JsonArray arrx = new JsonArray();
	     HashMap<String, JsonObject> map = new HashMap<String, JsonObject>();
		File fXmlFile = new File(filePathVar);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);

		//optional, but recommended
		//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
		doc.getDocumentElement().normalize();

		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

		NodeList nList = doc.getElementsByTagName("file");

		System.out.println("----------------------------");
		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);

			System.out.println("\nCurrent Element :" + nNode.getNodeName());

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				Element eElement = (Element) nNode;

				this.pluginJavaclass = eElement.getElementsByTagName("name").item(0).getTextContent();
				System.out.println("file type : " + eElement.getElementsByTagName("type").item(0).getTextContent());
				
			}
		}
		
		nList = doc.getElementsByTagName("executable");
		Node nNode = nList.item(0);
		Element eElement = (Element) nNode;
		this.pluginId = eElement.getElementsByTagName("pluginid").item(0).getTextContent();
		this.pluginName = eElement.getElementsByTagName("title").item(0).getTextContent();
		this.pluginCategory = eElement.getElementsByTagName("category").item(0).getTextContent();
		this.pluginDescription = eElement.getElementsByTagName("description").item(0).getTextContent();
		
	}
	
	public String getPluginId(){
		return this.pluginId;
	}
	public String getPluginName(){
		return this.pluginName;
	}
	public String getPluginDescription(){
		return this.pluginDescription;
	}

}
