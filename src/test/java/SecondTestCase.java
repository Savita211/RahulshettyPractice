import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {
    @Test
    void setup(){
        System.out.println("opening browser");
    }

    @Test
    void searchcustomer(){
        System.out.println("this is search customer test");
    }
    @Test
    void addcustomer(){
        System.out.println("this is add customer test");
    }

    @Test
    void closeBrowser(){
        System.out.println("closing browser");
    }
}
