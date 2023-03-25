package Lr_10.Example01;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class example_02 {
    public static void main(String[] args) {
        try{
            File inputFile = new File("src/Lr_10/example_01_xml.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBilder = dbFactory.newDocumentBuilder();
            Document doc = dBilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root Element: " + doc.getDocumentElement().getNodeName());

            NodeList nodeList = doc.getElementsByTagName("Book");
            for (int a = 0; a<nodeList.getLength(); a++){
                Node node = nodeList.item(a);
                System.out.println("\nCourent Element: " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("Book name: "+ element
                            .getElementsByTagName("Title").item(0).getTextContent());
                    System.out.println("Autor: " + element
                            .getElementsByTagName("Autor").item(0).getTextContent());
                    System.out.println("Year: " + element
                            .getElementsByTagName("Year").item(0).getTextContent());
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}