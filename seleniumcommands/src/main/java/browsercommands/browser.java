package browsercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {

	public static void main(String[] args)  throws InterruptedException{
		// System.setProperty("webdriver.gecko.driver","C:\\Users\\123\\Desktop\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Desktop\\chromedriver\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver","C:\\Users\\123\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//webDriver driver = new FirefoxDriver();
		//webDriver driver =new InternetExploreDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println("title is"+title);
		if(driver.getTitle().equals("Selenium Easy - Best Demo website to practice Selenium webdriver online"))
		{
			System.out.println("title found");
			
		}
		else
		{ System.out.println("title not found");
		}
		String q= driver.getCurrentUrl();
		System.out.println("current url" +q);
String z= driver.getPageSource();
//System.out.println("pagesource"+z);
Thread.sleep(5000);
//driver.close();
//driver.quit();

	}

}
