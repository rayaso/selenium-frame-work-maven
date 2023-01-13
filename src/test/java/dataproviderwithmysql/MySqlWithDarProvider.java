package dataproviderwithmysql;

import config.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.sql.*;

public class MySqlWithDarProvider {

    public ResultSet resultSet ;/*i have to write this to access resultset in test methode*/

    public MySqlWithDarProvider() {
        Configuration configuration  = new Configuration();
        String conUrl = configuration.prop.getProperty("jdbcUrl");
        String conUser = configuration.prop.getProperty("jdbcUser");
        String conPass = configuration.prop.getProperty("jdbcPass");
        try {
            Connection con = DriverManager.getConnection(conUrl, conUser, conPass);

            /*to read a table that we created in sql we whrite this next methode*/

            Statement q = con.createStatement();
            ResultSet resultSet = q.executeQuery("select * from sakila.login");
            this .resultSet=resultSet;


        } catch (SQLException se) {
            se.printStackTrace();
        }

    }
@Test
    public void jdbcTest() throws SQLException, InterruptedException {
        while (resultSet.next()){
            WebDriver driver=new EdgeDriver();
            driver.get("https://scaledupit.com/test2.html");
            driver.manage().window().maximize();

            String username=resultSet.getString("username");
            String pass=resultSet.getString("password");

            driver.findElement(By.id("userm")).sendKeys(username);
            driver.findElement(By.id("passm")).sendKeys(pass);
            driver.findElement(By.id("sone")).click();
            Thread.sleep(3000);
            driver.quit();

        }
}

}