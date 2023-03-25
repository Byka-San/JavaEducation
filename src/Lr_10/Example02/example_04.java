package Lr_10.Example02;

import org.apache.poi.EmptyFileException;
import org.apache.poi.openxml4j.exceptions.NotOfficeXmlFileException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Scanner;

public class example_04 {
    public static void one(){
        String filePath = "src/Lr_10/example_03_excel.xlsx";
        try(FileInputStream inputStream = new FileInputStream(filePath)) {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet a = workbook.getSheet("Товар");
            if (a == null){
                throw new LinkageError();
            }
            for (Row row : a) {
                for (Cell cell : row) {
                    System.out.println(cell.toString() + "\t");
                }
                System.out.println();
            }
        }

        catch (FileNotFoundException b){
            System.out.println("Данный файл не был обнаружен");
            System.out.println("Для повторного запроса нажмите \"1\"");
            Scanner scanner = new Scanner(System.in);
            int c = scanner.nextInt();
            if (c == 1) {
                one();
            }
        }

        catch (NotOfficeXmlFileException b){
            System.out.println("Указан не верный формат файла");
            System.out.println("Для повторного запроса нажмите \"1\"");
            Scanner scanner = new Scanner(System.in);
            int c = scanner.nextInt();
            if (c == 1){
                one();
            }
        }
        catch (NoSuchFileException b){
            System.out.println("Указан не верный формат файла");
            System.out.println("Для повторного запроса нажмите \"1\"");
            Scanner scanner = new Scanner(System.in);
            int c = scanner.nextInt();
            if (c == 1){
                one();
            }
        }
        catch (EmptyFileException b){
            System.out.println("Данный файл пуст");
            System.out.println("Для повторного запроса нажмите \"1\"");
            Scanner scanner = new Scanner(System.in);
            int c = scanner.nextInt();
            if (c == 1){
                one();
            }
        }

        catch (LinkageError b){
            System.out.println("Запрашиваемый лист не был найден");
            System.out.println("Для повторной попытки введите \"1\"");
            Scanner scanner = new Scanner(System.in);
            int c = scanner.nextInt();
            if (c == 1){
                one();
            }
        }

        catch (Exception b){
            b.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        one();
    }
}
