import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class GreenCart {

    WebDriver driver;
    @BeforeMethod
    void beforemethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shara\\OneDrive\\Desktop\\Software\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }
@Test
        void search() throws InterruptedException {
            driver.findElement(By.className("search-keyword")).sendKeys("beans");
/*WebElement ele=driver.findElement(By.xpath("//a[normalize-space()='+']"));
Actions act = new Actions(driver);
act.moveToElement(ele).perform();*/
    driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//img[@alt='Cart']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
    driver.findElement(By.xpath("(//a[@class='product-remove'])[1]")).click();
    driver.findElement(By.xpath("//a[normalize-space()='Top Deals']")).click();
    WebElement dropdownElement=driver.findElement(By.id("page-menu"));
    Select dropdown= new Select(dropdownElement);
  dropdown.selectByValue("10");
        }
    }

