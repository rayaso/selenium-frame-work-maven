package dataproviderexelWithColumnsAndRows;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExelReader {



    public String[][] readXl(String xlPath, String sheetName) throws IOException,IOException {

        String path = xlPath;

        FileInputStream fis = new FileInputStream(path);

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet ws = wb.getSheet(sheetName);

        int rows = ws.getLastRowNum() + 1;
        int cols = ws.getRow(0).getLastCellNum();

        String[][] data = new String[rows][cols];

        for (int r = 1/*usually we start with 0,in our example i do not want the first row
        witch contains username and password word i need just the values*/; r < rows; r++) {

            XSSFRow myRow = ws.getRow(r);

            for (int c = 0; c < cols; c++) {

                XSSFCell cell = myRow.getCell(c);
                String value = getCellData(cell);/*we modified this ligne to getCellData name of our
                methode,in case it is not the first methode that we want than we have to change it
                to next methode name witch is getCellValue*/
                data[r][c] = value;

            }

        }

        return data;
    }


/*in case i do not want .0 while running my test ,i have to use this methode than comment out
* next methode*/
    public static String getCellData(Cell cellValue) {/*this methode is in case we do not wan to .0 after
    number that i have in my exel file cause usually java add .0 when it is printing*/
        String value;
        DataFormatter formatter = new DataFormatter();
        try {
            value = formatter.formatCellValue(cellValue);

        } catch (Exception e) {
            value = "";
        }
        return  value;
    }



    //this methode is if it is ok to print with .0 after number than we comment out previous methode:

  /*  public static String getCellValue(Cell cellValue) {
        Object value = null;

        switch (cellValue.getCellType()) {
            case STRING:
                value = cellValue.getStringCellValue();
                break;
            case NUMERIC:
                value = cellValue.getNumericCellValue();
                break;
            case BOOLEAN:
                value = cellValue.getBooleanCellValue();
                break;
        }
        return value.toString();

    }*/




}
