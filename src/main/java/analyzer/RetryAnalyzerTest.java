package analyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerTest {//we have to run those tests in xml file
  @Test
    public void testOne(){

      Assert.assertEquals(true,false);
    }

    @Test
    public void testTwo(){

        Assert.assertEquals(false,false);
    }

  @Test
  public void testThree() {

    Assert.assertEquals(false, true);

  }}
