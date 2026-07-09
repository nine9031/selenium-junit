import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_101_search_by_keyword {

    @Test
    void tc_101_search_by_keyword_test() {
        WebDriver driver = null;

        System.setProperty("webdriver.chrome.driver", "./src/chromedriver");

        driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
        driver.get("https://www.calculator.net/bmi-calculator.html");
         
        WebElement age_box = driver.findElement(By.id("cage"));
        age_box.clear();
        age_box.sendKeys("18");

        WebElement gender_female = driver.findElement(By.id("csex2"));
        org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", gender_female);

        WebElement height_box = driver.findElement(By.id("cheightmeter"));
        height_box.clear();
        height_box.sendKeys("167");

        WebElement weight_box = driver.findElement(By.id("ckg"));
        weight_box.sendKeys(org.openqa.selenium.Keys.chord(org.openqa.selenium.Keys.CONTROL, "a"), "80");
         
        WebElement calculate_btn = driver.findElement(By.xpath("//input[@type='submit' and @value='Calculate']"));
        calculate_btn.click();
         
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (driver != null) {
            driver.quit();
        }
    }
}