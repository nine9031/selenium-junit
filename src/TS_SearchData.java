import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

class TS_SearchData {

	@Test
	void tc_101_search_by_keyword() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "./src/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        WebElement search_box = driver.findElement(By.id("APjFqb"));
        search_box.sendKeys("NPRU");  
        search_box.sendKeys(Keys.ENTER);
        
        driver.close();
	}
	
	
	@Test
	void tc_102_search_by_keyword() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "./src/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        WebElement search_box = driver.findElement(By.id("APjFqb"));
        search_box.sendKeys("NPRU");  
        search_box.sendKeys(Keys.ENTER);
        
        driver.close();
	}
	
	@Test
	void tc_103_search_by_keyword() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "./src/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        WebElement search_box = driver.findElement(By.id("APjFqb"));
        search_box.sendKeys("NPRU");  
        search_box.sendKeys(Keys.ENTER);
        
        driver.close();
	}
	
	@Test
	void tc_104_search_by_keyword() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "./src/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        WebElement search_box = driver.findElement(By.id("APjFqb"));
        search_box.sendKeys("NPRU");  
        search_box.sendKeys(Keys.ENTER);
        
        driver.close();
	}

}
