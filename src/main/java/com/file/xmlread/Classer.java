//package com.file.xmlread;
//
//import java.util.List;
//
//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlAttribute;
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlElementWrapper;
//
//@XmlAccessorType(XmlAccessType.FIELD)
//public class Classer {
//
//	@XmlAttribute(name="name")
//	private String className;
//	
//	@XmlAttribute(name="filename")
//	private String filename;
//	
//	@XmlAttribute(name="line-rate")
//	private String cLineRate;
//	
//	@XmlAttribute(name="branch-rate")
//	private String cBranchRate;
//	
//	@XmlAttribute(name="complexity")
//	private String cComplexity;
//	
//	@XmlElementWrapper(name="methods")
//	@XmlElement(name="method")
//	private List<Method> methods;
//
//	public String getClassName() {
//		return className;
//	}
//
//	public void setClassName(String className) {
//		this.className = className;
//	}
//
//	public String getFilename() {
//		return filename;
//	}
//
//	public void setFilename(String filename) {
//		this.filename = filename;
//	}
//
//	public String getcLineRate() {
//		return cLineRate;
//	}
//
//	public void setcLineRate(String cLineRate) {
//		this.cLineRate = cLineRate;
//	}
//
//	public String getcBranchRate() {
//		return cBranchRate;
//	}
//
//	public void setcBranchRate(String cBranchRate) {
//		this.cBranchRate = cBranchRate;
//	}
//
//	public String getcComplexity() {
//		return cComplexity;
//	}
//
//	public void setcComplexity(String cComplexity) {
//		this.cComplexity = cComplexity;
//	}
//
//	public List<Method> getMethods() {
//		return methods;
//	}
//
//	public void setMethods(List<Method> methods) {
//		this.methods = methods;
//	}
//	
//}
