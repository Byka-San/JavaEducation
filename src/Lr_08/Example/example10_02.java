package Lr_08.Example;

import java.io.*;
import java.util.Scanner;
public class example10_02 {
    public static void main(String[] args) throws Exception{
        WritingFile writingFile = new WritingFile();
        ReaderFile readerFile = new ReaderFile();
    }
}

class WritingFile{
    WritingFile () throws Exception {
        try {
            File file1 = new File("C:\\Users\\Администратор\\IdeaProjects\\JavaEducation\\Fail.txt");
            file1.createNewFile();
            if (file1.exists()) {
                System.out.println("Успешно созданый файл Fail");
                System.out.println("Полный путь: " + file1.getAbsolutePath());
            }
            FileWriter fw = new FileWriter(file1);
            fw.write("7.12,2.363,54.211,8.12,5.644\n89.3,764.1,-7.8979,243.34,4.245");
            fw.close();
            new ReaderFile(file1.getAbsolutePath());
        }
        catch (Exception e) {
            System.out.println("ошибка" + e);
        }
    }
}


class ReaderFile {

    ReaderFile (){}
    ReaderFile (String file1) throws Exception{

        try {
            File file2 = new File("C:\\Users\\Администратор\\IdeaProjects\\JavaEducation\\rezyltat.txt");
            file2.createNewFile();
            if (file2.exists()) {
                System.out.println("Успешно созданый файл rezyltat");
                System.out.println("Полный путь к файлу: " + file2.getAbsolutePath());
            }
            String[] str1 = new String[5];
            String[] str2 = new String[5];
            String strNum2 ="";
            String strNum1 ="";

            String strDouble = "";

            FileReader fr = new FileReader(file1);
            Scanner scan = new Scanner(fr);

            FileWriter fw = new FileWriter(file2);
            String [] strNumDoub ;
            double[] doub = new double[10];

            int a = 1;
            while (scan.hasNextLine()){
                str1 = scan.nextLine().split(",");
                a++;
                if (a==2){
                    str2 = scan.nextLine().split(",");
                }
            }

            for (int p = 0; p < str2.length; p++){
                strNum2 += str2[p] + ",";
            }
            for (int q = 0; q < str1.length; q++){
                strNum1 += str1[q] + ",";
            }
            String strNum = strNum1  + strNum2;

            strNumDoub = strNum.split(",");

            for (int q = 0 ; q<strNumDoub.length;q++){
                doub[q] = Double.parseDouble(strNumDoub[q]);
            }

            for (int q = 0; q < doub.length;q++) {
                if (doub[q] > 0){
                    strDouble += doub [q] + " ";
                }
            }

            fw.write("Строка 2 содержит: " + strNum2 + "\n" + "Положительными часлами типа Double является: " + strDouble );
            fw.close();
            fr.close();

        }catch (Exception e){
            System.out.println("Ошибка: " + e);
        }

    }
}