package redBusBooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	static WebDriver driver;
	static String baseURL = "https://www.redbus.in/";

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijayabhaskar.k\\eclipse-workspace\\BeachBodyCO\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get(baseURL);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Thread.sleep(5000);
		driver.quit();
	}

}
