package Lr_10.Example01;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class example_08 {
    public static void main(String[] args) throws IOException {
        String filePath = "src/Lr_10/example_03_excel.xlsx";
        try(FileInputStream inputStream = new FileInputStream(filePath)) {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("Товары");
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.println(cell.toString() + "\t");
                }
                System.out.println();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
