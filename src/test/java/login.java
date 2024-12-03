
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class login {
WebDriver driver;
@BeforeMethod
void beforemethod(){
    System.setProperty("webdriver.chrome.driver","C:\\Users\\shara\\OneDrive\\Desktop\\Software\\chromedriver-win64\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
}

    @Test
    void loginpage() throws InterruptedException {
    WebElement ele=driver.findElement(By.xpath("//span[normalize-space()='Login']"));
    //mouseovering
     Actions act = new Actions(driver);
     act.moveToElement(ele).perform();
     Thread.sleep(2000);
     //   driver.findElement(By.name("q")).click();
        driver.findElement(By.xpath("//span[@class='_1Mikcj']")).click();
        driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("8660124350");
driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
driver.navigate().back();
driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("mixer");
//keyboard action
        Actions act1= new Actions(driver);
        // act.sendKeys(Keys.TAB).perform();
        act.sendKeys("grinder").perform();
        act.sendKeys(Keys.ENTER).perform();
        driver.findElement(By.xpath("//div[normalize-space()='MAHARAJA WHITELINE Odacio Plus 550 W Juicer Mixer Grinder']")).click();
     //driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[3]")).click();
    }
    @AfterMethod
    void aftermethod(){
    System.out.println("this is execute after login page");
   driver.close();
    }

}
