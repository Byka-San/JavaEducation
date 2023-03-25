package Lr_10.Example02;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class example_02 {
    protected static void one(){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите запрос для начала поиска");
            String find = scanner.nextLine();
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/LR_10/example_02_json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            for (Object o: jsonArray){
                JSONObject book = (JSONObject) o;
                if(book.get("year").toString().equals(find)||book.get("title").equals(find)||book.get("autor").equals(find)) {
                    System.out.println("\n Courent Element: book");
                    System.out.println("Book name: " + book.get("title"));
                    System.out.println("Autor: " + book.get("autor"));
                    System.out.println("Year: " + book.get("year"));
                }
            }
        }
        catch (Exception a){
            a.printStackTrace();
        }
    }


    protected static void two(){
        try{
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/LR_10/example_02_json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            JSONObject book = new JSONObject();
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите имя Автора:");
            String autor = sc.nextLine();
            System.out.println("Введите название книги:");
            String title = sc.nextLine();
            System.out.println("Введите год издания:");
            String year = sc.nextLine();
            book.put("autor", autor);
            book.put("title", title);
            book.put("year", year);
            jsonArray.add(book);
            FileWriter file = new FileWriter("src/LR_10/example_02_json.json");
            file.write(jsonObject.toJSONString());
            file.flush();
            file.close();
        }
        catch (Exception a){
            a.printStackTrace();
        }
    }

    protected static void three() {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/LR_10/example_02_json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            System.out.println("Введите запрос последующего для удаления");
            Scanner scanner = new Scanner(System.in);
            String dFine = scanner.nextLine();
            Iterator iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject book = (JSONObject) iterator.next();
                if (dFine.equals(book.get("title"))||dFine.equals(book.get("year"))||dFine.equals(book.get("autor"))) {
                    iterator.remove();
                }
            }
            FileWriter file = new FileWriter("src/LR_10/example_02_json.json");
            file.write(jsonObject.toJSONString());
            file.flush();
            file.close();
        }
        catch(Exception a){
            a.printStackTrace();
        }
    }


    protected static void four(){
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/LR_10/example_02_json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            for (Object o: jsonArray){
                JSONObject book = (JSONObject) o;
                System.out.println("\nCourent Element: book");
                System.out.println("Book name: " + book.get("title"));
                System.out.println("Autor: " + book.get("autor"));
                System.out.println("Year: " + book.get("year"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        while (true){
            try {
                System.out.println("1. Показ данных \n2. Найти необходимые данные\n3. Удаление\n4. Добавить данные \n0. Выход");
                Scanner scanner = new Scanner(System.in);
                int push = scanner.nextInt();
                if (push == 1){
                    System.out.println("В базе следующие элементы:");
                    four();
                }
                else if (push == 2){
                    System.out.println();
                    one();
                }
                else if (push == 3) {
                    System.out.println();
                    three();
                }
                else if (push == 4) {
                    System.out.println();
                    two();
                }
                else if (push == 0){
                    break;
                }
                else {
                    System.out.println();
                    System.out.println("Ввод некорректен");
                    System.out.println();
                }
            }
            catch (InputMismatchException a) {
                System.out.println("Неподходящие значение");
            }
        }
    }
}