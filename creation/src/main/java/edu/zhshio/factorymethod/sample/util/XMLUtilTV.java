package edu.zhshio.factorymethod.sample.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtilTV
{
    //该方法用于从XML配置文件中提取品牌名称，并返回该品牌名称
	public static String getBrandName()
	{
		try
		{
			//创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;							
			doc = builder.parse(new File("src/main/java/edu/zhshio/factorymethod/sample/resource/FactoryMethodconfigTV.xml"));
		
			//获取包含品牌名称的文本节点
			NodeList nl = doc.getElementsByTagName("brandFactoryName");
            Node classNode=nl.item(0).getFirstChild();
            String brandFactoryName=classNode.getNodeValue().trim();
            return brandFactoryName;
           }   
           	catch(Exception e)
           	{
           		e.printStackTrace();
           		return null;
           	}
		}
}
