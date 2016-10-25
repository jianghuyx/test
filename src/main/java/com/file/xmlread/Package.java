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
//public class Package {
//		
//	@XmlAttribute(name="name")
//	private String packageName;
//	
//	@XmlAttribute(name="line-rate")
//	private String pLineRate;
//	
//	@XmlAttribute(name="branch-rate")
//	private String pBranchRate;
//	
//	@XmlAttribute(name="complexity")
//	private String pComplexity;
//
//	@XmlElementWrapper(name="classes")
//	@XmlElement(name="class")
//    private List<Classer> classes;
//
//	public String getPackageName() {
//		return packageName;
//	}
//
//	public void setPackageName(String packageName) {
//		this.packageName = packageName;
//	}
//
//	public String getpLineRate() {
//		return pLineRate;
//	}
//
//	public void setpLineRate(String pLineRate) {
//		this.pLineRate = pLineRate;
//	}
//
//	public String getpBranchRate() {
//		return pBranchRate;
//	}
//
//	public List<Classer> getClasses() {
//		return classes;
//	}
//
//	public void setClasses(List<Classer> classes) {
//		this.classes = classes;
//	}
//
//	public void setpBranchRate(String pBranchRate) {
//		this.pBranchRate = pBranchRate;
//	}
//
//	public String getpComplexity() {
//		return pComplexity;
//	}
//
//	public void setpComplexity(String pComplexity) {
//		this.pComplexity = pComplexity;
//	}
//}
