package day15Repeat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestAmazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Beyaz\\Documents\\libraries\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Amazon amazon=new Amazon(driver);
		
		amazon.goTo();
		System.out.println(driver.getTitle());
		//System.out.println("At home page "+etsy.atHomePage());
		if(amazon.atHomePage()){
			System.out.println("Landen at home page");
		}else{
			System.out.println("Amazon is down");
			System.exit(1);
		}
		Thread.sleep(2000);
		amazon.search("dress");
	}	
}


