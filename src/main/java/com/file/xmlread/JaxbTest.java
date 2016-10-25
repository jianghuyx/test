//package com.file.xmlread;
//
//import java.io.File;
//import java.io.IOException;
//import java.io.StringReader;
//import java.util.List;
//
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Unmarshaller;
//
//import org.dom4j.Document;
//import org.dom4j.DocumentException;
//import org.dom4j.Element;
//import org.dom4j.io.SAXReader;
//import org.junit.Test;
//
//public class JaxbTest {
//
//	@Test
//	public void test() throws JAXBException,IOException{
//		File f = new File("target/site/cobertura/coverage.xml");
//		 //创建一个读取XML文件的对象     
//        SAXReader reader=new SAXReader();     
//        //创建一个文档对象     
//        Document document;
//        Element element;
//        String xml = null;
//		try {
//			document = reader.read(f);
//			//获取文件的根节点     
//	        element=document.getRootElement(); 
//	        xml = element.asXML();
//		} catch (DocumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}     
//        
//		JAXBContext context;
//		Unmarshaller unmar = null;
//		Coverage obj = null;
//		try{
//			context = JAXBContext.newInstance(Coverage.class);
//			unmar = context.createUnmarshaller();
//			obj = (Coverage) unmar.unmarshal(new StringReader(xml));
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		
//		List<Package> pg = obj.getPackages();
//		for(Package packg : pg){
//			
//			System.out.println(packg.getPackageName());
//		    System.out.println(packg.getpBranchRate());
//		    System.out.println(packg.getpLineRate());
//		    System.out.println(packg.getpComplexity());
//		    
//		    List<Classer> cls = packg.getClasses();
//		    for(Classer cl : cls){
//		    	System.out.println(cl.getClassName());
//			    System.out.println(cl.getcBranchRate());
//			    System.out.println(cl.getcLineRate());
//			    System.out.println(cl.getFilename());
//			    System.out.println(cl.getcComplexity());
//			    
//			    List<Method> mds = cl.getMethods();
//			    mds.remove(0);
//			    for(Method md : mds){
//			    	
//			    	System.out.println(md.getMethodName());
//				    System.out.println(md.getmBranchRate());
//				    System.out.println(md.getmLineRate());
//				    System.out.println(md.getSignature());
//				    System.out.println(md.getcComplexity());
//				    
//				    List<Line> lines = md.getLines();
//				    for(Line line : lines){
//				    	System.out.println(line.getHits());
//					    System.out.println(line.getNumber());
//					    System.out.println(line.isBranch());
//				    }
//				    
//			    }
//		    }
//		}
//	}
//}
