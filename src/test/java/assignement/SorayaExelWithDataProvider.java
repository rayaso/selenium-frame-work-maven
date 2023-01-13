package assignement;

import config.Configuration;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class SorayaExelWithDataProvider {


    @DataProvider(name="Excel Soraya Data Provider")

    public  Object[][] dataS() throws IOException {

        Configuration config=new Configuration();
        SorayaExelReader SORAYA=new SorayaExelReader();

        String sorayaXlPath= config.prop.getProperty("xlPathSoraya");
        String sorayaSheet=config.prop.getProperty("sheet");


        Object[][] data=SORAYA.readXl(sorayaXlPath,sorayaSheet);
        return data;




    }}














