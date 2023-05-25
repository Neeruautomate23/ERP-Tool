
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","D:\\Chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testLogin() throws InterruptedException {
        // Navigate to the login page
        driver.get("https://d20omqbtwm8stm.cloudfront.net/auth/login");

        WebElement usernameInput = driver.findElement(By.xpath("//input[@placeholder='Employee Id']"));
        usernameInput.sendKeys("CHM/2023/637");

        // Wait for 2 seconds (adjust as per your needs)
        Thread.sleep(2000);

    
    }

    @AfterTest
    public void teardown() {
        // Close the browser
        driver.quit();
    }
}
