package Lr_10.Example01;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class example_05 {
    public static void main(String[] args) {
        String url = "https://itlearn.ru/first-steps";
        try{
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");
            for(Element link : links){
                System.out.println(link.attr("abs:href"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}