import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
    void setup(){
        System.out.println("opening browser");
    }

    @Test(priority=2)
    void login(){
        System.out.println("this is login test");
    }

    @Test(priority=3)
    void closeBrowser(){
        System.out.println("closing browser");
    }
}
