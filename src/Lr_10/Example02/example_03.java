package Lr_10.Example02;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import java.io.*;
import java.net.UnknownHostException;
import java.util.List;
import static org.json.simple.JSONObject.escape;

public class example_03 {
    public static boolean one(){
        try {
            File file = new File("src/LR_10/example_03_hml.json");
            if(file.exists()){
                return true;
            }
            return false;
        }
        catch (Exception a) {
            a.printStackTrace();
        }
        return false;
    }


    public static void two(List nodes, int i) {
        try {
            if (one() ) {
                JSONParser parser = new JSONParser();
                Object obj = parser.parse(new FileReader("src/LR_10/homework/LR_10_HTML.json"));
                JSONObject jsonObject = (JSONObject) obj;
                JSONArray jsonArray = (JSONArray) jsonObject.get("library");
                JSONObject news = new JSONObject();
                news.put("Тема", escape(((Element) nodes.get(i)).getElementsByClass("Заголовок").get(0).childNodes().get(0).toString()));
                news.put("Дата", escape(((Element) nodes.get(i)).getElementsByClass("Дата").get(0).childNodes().get(0).toString()));

                if (jsonArray.contains(news)) {
                    System.out.println("\nДанный элемент уже находится в массиве");
                }
                else {
                    jsonArray.add(news);
                    jsonObject.put("Библеотека", jsonArray);

                    FileWriter b = new FileWriter("src/LR_10/LR_10_HTML.json");
                    b.write((jsonObject).toJSONString());
                    b.flush();
                    b.close();
                }
            }
            else {
                JSONObject jsonObject = new JSONObject();
                JSONArray jsonArray = new JSONArray();
                JSONObject news = new JSONObject();
                news.put("Тема", escape(((Element) nodes.get(i)).getElementsByClass("Заголовок").get(0).childNodes().get(0).toString()));
                news.put("Дата", escape(((Element) nodes.get(i)).getElementsByClass("Дата").get(0).childNodes().get(0).toString()));
                jsonArray.add(news);
                jsonObject.put("Библеотека", jsonArray);
                FileWriter file = new FileWriter("src/LR_10/LR_10_HTML.json");
                file.write(jsonObject.toJSONString());
                file.flush();
                file.close();
            }
        }
        catch (FileNotFoundException c) {
            c.printStackTrace();
        }
        catch (IOException c) {
            c.printStackTrace();
        }
        catch (ParseException c) {
            c.printStackTrace();
        }
        catch (Exception d) {
            d.printStackTrace();
        }
    }


    public static Document three(){
        try {
            if (t < 5) {
                t ++;
                doc = Jsoup.connect("https://urfu.ru/ru/index.htm").get();
                return doc;
            }
        }
        catch (UnknownHostException j) {
            three();
            System.out.println("Нет соединения с сетью");
        }
        catch (HttpStatusException j){
            three();
            System.out.println("Такого HTML не существует");
        }
        catch (Exception j){
            j.printStackTrace();
        }
        return null;
    }

    static int t = 0;
    static Document doc;
    public static void main(String[] args) throws IOException {
        try {
            three();
            Elements newsParent = doc.select("body > table > tbody > tr > td > div > table > " +
                    "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > "+
                    "tr > td:nth-child(1)");
            for (int i = 3; i < 20; i++) {
                if(!(i%2==0)){
                    List<Node> nodes = newsParent.get(0).childNodes();
                    two(nodes,i);
                    System.out.println("Тема: " +((Element)nodes.get(i)).getElementsByClass("Заголовок").get(0).childNodes().get(0));
                    System.out.println("Дата: " + ((Element)nodes.get(i)).getElementsByClass("Дата").get(0).childNodes().get(0)+"\n");
                }
            }
        }
        catch (NullPointerException e){
            System.out.println("Завершение");
        }
    }
}