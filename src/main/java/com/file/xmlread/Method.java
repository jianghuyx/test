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
//public class Method {
//
//	@XmlAttribute(name="name")
//	private String methodName;
//	
//	@XmlAttribute(name="signature")
//	private String signature;
//	
//	@XmlAttribute(name="line-rate")
//	private String mLineRate;   
//	
//	@XmlAttribute(name="branch-rate")
//	private String mBranchRate;
//	
//	@XmlAttribute(name="complexity")
//	private String cComplexity;
//	
//	@XmlElementWrapper(name="lines")
//	@XmlElement(name="line")
//	private List<Line> lines; 
//
//	public String getMethodName() {
//		return methodName;
//	}
//
//	public void setMethodName(String methodName) {
//		this.methodName = methodName;
//	}
//
//	public String getSignature() {
//		return signature;
//	}
//
//	public void setSignature(String signature) {
//		this.signature = signature;
//	}
//
//	public String getmLineRate() {
//		return mLineRate;
//	}
//
//	public void setmLineRate(String mLineRate) {
//		this.mLineRate = mLineRate;
//	}
//
//	public String getmBranchRate() {
//		return mBranchRate;
//	}
//
//	public void setmBranchRate(String mBranchRate) {
//		this.mBranchRate = mBranchRate;
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
//	public List<Line> getLines() {
//		return lines;
//	}
//
//	public void setLines(List<Line> lines) {
//		this.lines = lines;
//	}
//	
//}
