package secondTestPk;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest {
    @Test
	public void secondTest() throws IOException  {
		
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Wasim\\Maven(cucumber)-Vcentry-workspace\\GitHubTest\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		//WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/?toWww=1&redig=055B9BAE64684F9B86E6402B181C420D");
		WebElement googlepage = wd.findElement(By.name("q"));
		googlepage.sendKeys("zing");
		googlepage.sendKeys(Keys.ENTER);
		
		// Screenshot code
		
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Wasim\\Maven(cucumber)-Vcentry-workspace\\GitHubTest\\Screenshot\\Zing.jpg"));
		
		
	}

}
