package testa;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Log_Out {
	
WebDriver driver;
	
	//@BeforeTest
	public void startUp() {
		System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		System.out.println("open url");
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
		System.out.println("click on sign IN");
	}

	@DataProvider(name="data")
	public Object[][] getData()
	{
		return new Object[][] {{"kulkarnidivya@gmail.com","Chaitu@4111"}};
		
	}
	
	@Test(dataProvider = "data")
	public void tc(String email,String password) throws IOException, Exception {
		
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
	System.out.println("entered email & password");
	driver.findElement(By.id("send2")).click();
	System.out.println("click on sign in button");
	Thread.sleep(3000);
	driver.navigate().refresh();
}


@AfterTest
public void tc02() {
	driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")).click();
	//Select st = new Select(driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")));
	//st.selectByVisibleText("Sign Out");
	driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")).click();
	System.out.println("click on arrow & sign out");
	
	driver.close();
	System.out.println("close application");
}



	}


