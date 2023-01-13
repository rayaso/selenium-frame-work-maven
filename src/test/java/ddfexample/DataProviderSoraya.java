package ddfexample;

import org.testng.annotations.DataProvider;

public class DataProviderSoraya {

    @DataProvider

    public Object[][] dataP() {
        Object[][] data = {{"abcd", 1234}, {"xyz", 456}, {"ter", 856}};
        return data;

    }






}
