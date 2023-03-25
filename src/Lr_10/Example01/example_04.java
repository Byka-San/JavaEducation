package Lr_10.Example01;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class example_04 {
    public static void main(String[] args) {
        try{
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/Lr_10/example_02_json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Root Element" + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            for (Object o: jsonArray){
                JSONObject book = (JSONObject) o;
                System.out.println("\n Courent Element: book");
                System.out.println("Book name: " + book.get("title"));
                System.out.println("Autor: " + book.get("autor"));
                System.out.println("Year: " + book.get("year"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}