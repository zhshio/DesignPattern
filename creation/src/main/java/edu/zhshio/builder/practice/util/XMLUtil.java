package edu.zhshio.builder.sample.util;/**
 * @Auther: 张帅
 * @Date: 2024/3/7 - 03 - 07 - 11:15
 * @Description: edu.zhshio.builder.util
 * @version: 1.0
 */

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @description:
 * @author: zs
 * @time: 2024/3/7 11:15
 */

public class XMLUtil {

    public static Object getBean() {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newDefaultInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(new File("src/main/java/edu/zhshio/builder/resource/MealBuilderconfig.xml"));

            NodeList mealBuilderNames = document.getElementsByTagName("mealBuilderName");
            Node mealBuilderName = mealBuilderNames.item(0).getFirstChild();
            String mealBuilerNameVal = mealBuilderName.getNodeValue().trim();

            Class<?> aClass = Class.forName(mealBuilerNameVal);
            return aClass.newInstance();

        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
