package Lr_08.Example;

import java.io.File;

public class example10_01 {
    public static void main(String[] args) {
        try{
            File f1 = new File("MyFile1.txt");
            f1.createNewFile();
            if (f1.exists()){
                System.out.println("Операция прошла успешно");
                System.out.println("Полный путь к файлу №1: "+f1.getAbsolutePath());
            }

            File f2 = new File("C:\\MyFile2.txt");
            f2.createNewFile();
            System.out.println("Полный путь к файлу №2: "+f2.getAbsolutePath());
            File f3 = new File("C:\\User\\Админестратор\\IdeaProjects\\JavaEducation\\Lr_08\\example1");
            f3.mkdirs();
            System.out.println("Полный путь к файлу №3: "+f3.getAbsolutePath());
        } catch (Exception e){
            System.out.println("Произошла ошибка. Причина: " + e);
        }
    }
}