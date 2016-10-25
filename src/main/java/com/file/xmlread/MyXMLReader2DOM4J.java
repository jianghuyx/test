//package com.file.xmlread;
//
//import java.io.File;
//
//import org.dom4j.Document;
//import org.dom4j.DocumentException;
//import org.dom4j.Element;
//import org.dom4j.io.SAXReader;
//import org.json.JSONML;
//import org.json.JSONObject;
//
//public class MyXMLReader2DOM4J {
//
//	public static void main(String arge[]) {
//		File f = new File("target/site/cobertura/coverage.xml");
//		//创建一个读取XML文件的对象     
//    	SAXReader reader=new SAXReader();    
//    	//创建一个文档对象     
//    	Document document;
//    	Element element;
//    	String xml = null;
//    	try {
//    		document = reader.read(f);
//    		//获取文件的根节点     
//    	    element=document.getRootElement(); 
//    	    xml = element.asXML();
//    	} catch (DocumentException e) {
//    		// TODO Auto-generated catch block
//    		e.printStackTrace();
//    	}    
//		xml2JSON(xml);
//	}
//	
//    public static String xml2JSON(String xml) {  
//        try {  
//        	JSONObject json = JSONML.toJSONObject(xml);
//        	String rs = json.toString();
//        	System.out.println(rs);
//        	return rs;
//        } catch (Exception e) {  
//            e.printStackTrace();  
//            return null;  
//        }  
//    }  
//
//}
