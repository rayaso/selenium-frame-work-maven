package dataproviderexelWithColumnsAndRows;

import config.Configuration;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class ExelWithDataProvider {

   @DataProvider(name="Excel Data Provider")/*THE ROLE OF THIS METHODE IS GETTING DATA FROM EXEL*/

    public  Object[][] dataP() throws IOException {

        Configuration config=new Configuration();
       ExelReader xlr=new ExelReader();

       String myXlPath= config.prop.getProperty("xlPath");
        String mySheet=config.prop.getProperty("sheetName");


        Object[][] data=xlr.readXl(myXlPath,mySheet);
        return data;




    }}





