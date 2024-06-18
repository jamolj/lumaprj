package testa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSample {

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeliniumTest\\Driver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Users\\ADMIN\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");		
		WebDriver driver=new ChromeDriver(options);
		//EdgeDriver d=new EdgeDriver();
		driver.get("http://www.gurukulislampur.com");
		
	}

}
