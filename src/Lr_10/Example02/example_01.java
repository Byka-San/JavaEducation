package Lr_10.Example02;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.Scanner;

public class example_01 {
    private static void main(){
        try {
            File inputFile = new File("src/LR_10/example_01_xml.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBilder = dbFactory.newDocumentBuilder();
            Document doc = dBilder.parse(inputFile);

            NodeList nodeList = doc.getElementsByTagName("Book");
            System.out.println();
            for (int a = 0; a<nodeList.getLength(); a++){
                Node node = nodeList.item(a);
                if (node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("Название книги: \t"+ element
                            .getElementsByTagName("Title").item(0).getTextContent());
                    System.out.println("Автор произведения: \t" + element
                            .getElementsByTagName("Autor").item(0).getTextContent());
                    System.out.println("Год издания книги: \t" + element
                            .getElementsByTagName("Year").item(0).getTextContent());
                    System.out.println();
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void File(){
        try{
            File inputFile = new File("src/LR_10/example_01_xml.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBilder = dbFactory.newDocumentBuilder();
            Document doc = dBilder.parse(inputFile);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите номер необходимой стори для поиска: >>");
            String year = scanner.nextLine();
            Node root = doc.getDocumentElement();
            NodeList books = root.getChildNodes();
            for (int a=0;a<books.getLength();a++){
                Node book = books.item(a);
                if (book.getNodeType()!=Node.TEXT_NODE){
                    NodeList bookPropd = book.getChildNodes(); //вхождения
                    for (int b =0; b<bookPropd.getLength();b++){
                        Node props = bookPropd.item(b);
                        if (props.getTextContent().equals(year)){
                            four(books, a);
                        }
                    }
                }
            }
        }
        catch (Exception c){
            c.printStackTrace();
        }
    }


    private static void two(){
        try{
            File inputFile = new File("src/LR_10/example_01_xml.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBilder = dbFactory.newDocumentBuilder();
            Document doc = dBilder.parse(inputFile);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите название книги для последующего его удаления: >>");
            String findDel = scanner.nextLine();
            Node root = doc.getDocumentElement();
            NodeList books = root.getChildNodes();
            for (int a=0; a<books.getLength(); a++){
                Node book = books.item(a);
                if (book.getNodeType()!=Node.TEXT_NODE){
                    NodeList bookPropd = book.getChildNodes();
                    for (int b =0; b<bookPropd.getLength();b++){
                        Node props = bookPropd.item(b);
                        if (props.getTextContent().equals(findDel)){
                            Element delElement = (Element)book;
                            Node parentNode = delElement.getParentNode();
                            parentNode.removeChild(delElement);
                        }
                    }
                }
            }

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT,"no");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/LR_10/example_01_xml.xml"));
            transformer.transform(source,result);
        }
        catch (Exception c){
            c.printStackTrace();
        }
    }


    private static void three()throws IOException{
        try {
            Scanner scanner = new Scanner(System.in);
            InputStream inputFile = new FileInputStream("src/LR_10/example_01_xml.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBilder = dbFactory.newDocumentBuilder();
            Document doc = dBilder.parse(inputFile);
            Element newFlat = doc.createElement("Book");
            Element root = doc.getDocumentElement();
            root.appendChild(newFlat);

            System.out.println("Имя Автора");
            String AutorIn = scanner.nextLine();
            Element Autor = doc.createElement("Autor");
            Autor.appendChild(doc.createTextNode(AutorIn));
            newFlat.appendChild(Autor);

            System.out.println("Название книги");
            String TitleIn = scanner.nextLine();
            Element Title = doc.createElement("Title");
            Title.appendChild(doc.createTextNode(TitleIn));
            newFlat.appendChild(Title);

            System.out.println("Год издания");
            String YearIn = scanner.nextLine();
            Element Year = doc.createElement("Year");
            Year.appendChild(doc.createTextNode(YearIn));
            newFlat.appendChild(Year);

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT,"no");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/LR_10/example_01_xml.xml"));
            transformer.transform(source,result);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    private static void four (NodeList bookPropd, int b) {
        Node nodeDown = bookPropd.item(b);
        Element element = (Element)nodeDown;
        System.out.println("Автор: \t" +element.getElementsByTagName("Autor").item(0).getTextContent());
        System.out.println("Название книги: \t" + element.getElementsByTagName("Title").item(0).getTextContent());
        System.out.println("Год издания: \t" +element.getElementsByTagName("Year").item(0).getTextContent());
    }


    public static void main(String[] args) {
        UI: {
            while (true) {
                System.out.println("1. Показать данные\n2. Ввести новые данные в файл\n3. Поиск по заданному адрессу\n4. Удалить\n0. Выход");
                Scanner sc = new Scanner(System.in);
                int scIn = sc.nextInt();
                if (scIn < 0 || scIn > 4) {
                    System.out.println("Введено недопустимое значение");
                    continue;
                }

                switch (scIn) {
                    case 1:
                        main();
                        break;
                    case 2:
                        try {
                            three();
                        }
                        catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 3:
                        File();
                        break;
                    case 4:
                        two();
                        break;
                    case 0:
                        break UI;
                }
            }
        }
    }
}