package JunitReport.JunitReport;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


import org.junit.Test;

public class ReportTest {
	
	   @Test
	   public void succeedingTest() {
	    }

	    @Test
	    public void failingTest() {
	        fail("a failing test");
	    }


	    @Test
	    public void passingTest() {
	        assertEquals(2, 2);
	        assertEquals(4, 4);
	    }

	    @Test
	    public void failingTest2() {
	        assertEquals(2, 3);
	        assertEquals(4, 3);
	    }

	    @Test
	    public void errorTest(){
	        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	        //WebDriver webdriver = new ChromeDriver();
	        //webdriver.get("http://google.com");
	        //webdriver.findElement(By.id("element that doesn't exist")).click();
	        assertEquals(2, 2);
	        assertEquals(4, 4);
	    }
	    
	    @Test
	    public void errorAfterAssertTest(){
	    	assertEquals(2, 2);
	    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	        //WebDriver webdriver = new ChromeDriver();
	        //webdriver.get("http://google.com");
	        //webdriver.findElement(By.id("element that doesn't exist")).click();
	        
	        assertEquals(4, 4);
	    }


}
