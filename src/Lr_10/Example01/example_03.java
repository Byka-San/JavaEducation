package Lr_10.Example01;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class example_03 {
    public static void main(String[] args) throws IOException {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("title", "Война и мир");
        book1.put("autor", "Лев Толстой");
        book1.put("year", "1869");

        JSONObject book2 = new JSONObject();
        book2.put("title", "Мастер и Маргарита");
        book2.put("autor", "Михаил Булгаков");
        book2.put("year", "1967");

        books.add(book1);
        books.add(book2);

        library.put("books", books);

        try {
            FileWriter file = new FileWriter("src/Lr_10/example_02_json.json");
            file.write(library.toJSONString());
            System.out.println("Json was created!");
            file.flush();
            file.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}