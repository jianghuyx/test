//package com.file.xmlread;
//
//import java.util.List;
//
//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlAttribute;
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlElementWrapper;
//import javax.xml.bind.annotation.XmlRootElement;
//
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement
//public class Coverage {
//
//	@XmlAttribute(name="line-rate")
//	private String lineRate;
//	
//	@XmlAttribute(name="branch-rate")
//	private String branchRate;
//	
//	@XmlAttribute(name="lines-covered")
//	private String linesCovered;
//	
//	@XmlAttribute(name="lines-valid")
//	private String linesValid;
//	
//	@XmlAttribute(name="branches-covered")
//	private String branchesCovered;    
//	
//	@XmlAttribute(name="complexity")
//	private String complexity;
//	
//	@XmlAttribute(name="timestamp")
//	private String timestamp;
//	
//	@XmlElementWrapper(name="packages")
//	@XmlElement(name="package")
//	private List<Package> packages;
//	
//	public String getLineRate() {
//		return lineRate;
//	}
//	
//	public void setLineRate(String lineRate) {
//		this.lineRate = lineRate;
//	}
//
//	public String getBranchRate() {
//		return branchRate;
//	}
//
//	public void setBranchRate(String branchRate) {
//		this.branchRate = branchRate;
//	}
//
//	public String getLinesCovered() {
//		return linesCovered;
//	}
//
//	public void setLinesCovered(String linesCovered) {
//		this.linesCovered = linesCovered;
//	}
//
//	public String getLinesValid() {
//		return linesValid;
//	}
//
//	public void setLinesValid(String linesValid) {
//		this.linesValid = linesValid;
//	}
//
//	public String getBranchesCovered() {
//		return branchesCovered;
//	}
//
//	public void setBranchesCovered(String branchesCovered) {
//		this.branchesCovered = branchesCovered;
//	}
//
//	public String getComplexity() {
//		return complexity;
//	}
//
//	public void setComplexity(String complexity) {
//		this.complexity = complexity;
//	}
//
//	public String getTimestamp() {
//		return timestamp;
//	}
//
//	public void setTimestamp(String timestamp) {
//		this.timestamp = timestamp;
//	}
//
//	public List<Package> getPackages() {
//		return packages;
//	}
//
//	public void setPackages(List<Package> packages) {
//		this.packages = packages;
//	}
//
//}
