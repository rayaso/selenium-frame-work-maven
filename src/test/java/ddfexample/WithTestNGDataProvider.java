package ddfexample;

import org.testng.annotations.Test;


public class WithTestNGDataProvider {
    /*we have to use data provider to call data from exel and we have to follow those step:
    1.create multidomontional array methode
    2.return type should be an object[][]
         3.you have to mention the name of data provider in your test
         4.the number of columns that we will have inside the data provider methode,we need to create
         a test methode with that many argumants.
     */



    @Test(dataProvider = "dataP",dataProviderClass = DataProviderSoraya.class)/*BY THIS LINE WE ARE CALING
    DATA PROVIDER METHODE WITCH IS CREATED IN DATA PROVIDER CLASS*/

    public void test(String user, int pass) {
        System.out.println(user + " " + pass);

    }


}