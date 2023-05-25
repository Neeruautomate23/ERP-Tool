package Automation;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;     
public class loginpage {

    public WebDriver driver;
    public WebDriverWait wait;

public Actions actions;
    @BeforeTest
    public void setup() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","D:\\Chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
        actions = new Actions(driver);
    }

    @Test
    public void testLogin() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofMillis(30000));

    	// Navigate to the login page
        driver.get("https://d20omqbtwm8stm.cloudfront.net/auth/login");
        driver.manage().window().maximize();
        WebElement usernameInput = driver.findElement(By.xpath("//input[@placeholder='Employee Id']"));
        usernameInput.sendKeys("CHM/2023/637");
        WebElement passwordInput = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        		passwordInput.sendKeys("123456");
        		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
        		loginbutton.click();
                Thread.sleep(2000);
                
               driver.get("https://d20omqbtwm8stm.cloudfront.net/new-projects");
               Thread.sleep(2000);
                driver.findElement(By.xpath("//i[@class='fa fa-plus']")).click();
               Thread.sleep(2000);
               WebElement mode = driver.findElement(By.xpath("//select[@formcontrolname='modeId']"));
               mode.click();
               Thread.sleep(2000);
               WebElement direct = driver.findElement(By.cssSelector("body > app-root > app-navigate-erp > div > div > app-add-project > div > div > div > div > form > div > div > div:nth-child(1) > div:nth-child(1) > div > select > option:nth-child(2)"));
               direct.click();
             
               WebElement Addnew = driver.findElement(By.className("append-btn"));
               Addnew.click();
               WebElement Name = driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']"));
               Name.sendKeys("emp"+Math.random()*2);
               WebElement OrgName = driver.findElement(By.xpath("//input[@formcontrolname='companyName']"));
               OrgName.sendKeys("Neeraj23230");
               WebElement Contact = driver.findElement(By.xpath("//input[@formcontrolname='phoneNumber']"));
               Contact.sendKeys("9878040368");
               WebElement Email = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
               Email.sendKeys("Neerajd2394@gmail.com");
               WebElement Addbutton = driver.findElement(By.xpath("//button[@type='submit']"));
               Addbutton.click();
               Thread.sleep(4000);
               actions.sendKeys(Keys.TAB).perform();
               actions.sendKeys(Keys.TAB).perform();
               actions.sendKeys(Keys.TAB).perform();
               actions.sendKeys(Keys.TAB).perform();
               actions.sendKeys(Keys.TAB).perform();
               actions.sendKeys(Keys.ENTER).perform();
               actions.sendKeys(Keys.ARROW_DOWN).perform(); 
               actions.sendKeys(Keys.ENTER).perform();
               
           WebElement Projectname = driver.findElement(By.cssSelector("body > app-root > app-navigate-erp > div > div > app-add-project > div > div > div > div > form > div > div > div:nth-child(1) > div:nth-child(4) > div > input"));
           Projectname.sendKeys("NeerajAutomation");
   
           WebElement Desc = driver.findElement(By.cssSelector("body > app-root > app-navigate-erp > div > div > app-add-project > div > div > div > div > form > div > div > div:nth-child(1) > div:nth-child(5) > div > textarea"));
           Desc.sendKeys("this is my automation project kindly provide your honest feedback for the same");
           
           
             JavascriptExecutor js = (JavascriptExecutor) driver;        
         WebElement calinner= driver.findElement(By.xpath("/html/body/app-root/app-navigate-erp/div/div/app-add-project/div/div/div/div/form/div/div/div[1]/div[6]/div[1]/input"));
          js.executeScript("arguments[0].click();", calinner);
          Thread.sleep(2000);
          actions.sendKeys(Keys.ENTER).perform();
          actions.sendKeys(Keys.ENTER).perform();
          

          WebElement selectoperator= driver.findElement(By.xpath("//ng-multiselect-dropdown[@placeholder='Select Platform']//div[@class='multiselect-dropdown']//div//span[@class='dropdown-btn']"));
          js.executeScript("arguments[0].click();", selectoperator);
          Thread.sleep(2000);
          actions.sendKeys(Keys.TAB).perform();
          actions.sendKeys(Keys.TAB).perform();
          actions.sendKeys(Keys.TAB).perform();
          actions.sendKeys(Keys.TAB).perform();
          actions.sendKeys(Keys.TAB).perform();
          actions.sendKeys(Keys.TAB).perform();
          actions.sendKeys(Keys.TAB).perform();
          actions.sendKeys(Keys.TAB).perform();
          actions.sendKeys(Keys.TAB).perform();
          actions.sendKeys(Keys.TAB).perform();
          actions.sendKeys(Keys.TAB).perform();
          actions.sendKeys(Keys.TAB).perform();
          actions.sendKeys(Keys.TAB).perform();
          actions.sendKeys(Keys.TAB).perform();
          actions.sendKeys(Keys.TAB).perform();
          Thread.sleep(2000);
          actions.sendKeys(Keys.SPACE).perform();
          Thread.sleep(2000);
          
          WebElement Tracker = driver.findElement(By.xpath("/html/body/app-root/app-navigate-erp/div/div/app-add-project/div/div/div/div/form/div/div/div[3]/div[1]/a"));
          Tracker.click();
          Thread.sleep(2000);
          actions.sendKeys(Keys.TAB).perform();
         actions.sendKeys(Keys.ENTER).perform();
        
       actions.sendKeys(Keys.ARROW_DOWN).perform(); 
       actions.sendKeys(Keys.ENTER).perform();

         Thread.sleep(2000);
         actions.sendKeys(Keys.TAB).perform();
         actions.sendKeys(Keys.ENTER).perform();
         actions.sendKeys(Keys.ARROW_DOWN).perform(); 
         actions.sendKeys(Keys.ENTER).perform();

          WebElement Operator = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-tracker/div/div[2]/form/div[1]/div[3]/div/ng-multiselect-dropdown/div/div[1]/span/span[1]"));
          js.executeScript("arguments[0].click();", Operator);
          Thread.sleep(2000);
          actions.sendKeys(Keys.TAB).perform();
          actions.sendKeys(Keys.TAB).perform();
          actions.sendKeys(Keys.TAB).perform();
          actions.sendKeys(Keys.SPACE).perform();
          
         WebElement hour = driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']"));
        hour.sendKeys("12");
        
        WebElement Savebutton = driver.findElement(By.xpath("//button[@type='submit']"));
        Savebutton.click();
        Thread.sleep(2000);
        WebElement Milestone = driver.findElement(By.xpath("/html/body/app-root/app-navigate-erp/div/div/app-add-project/div/div/div/div/form/div/div/div[3]/div/a"));
        Milestone.click();
        Thread.sleep(2000);
      WebElement Milestonename = driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']"));
        Milestonename.sendKeys("Automation milestone 1");
      
        WebElement Calenderone = driver.findElement(By.xpath("//div[3]//div[1]//input[1]"));
        js.executeScript("arguments[0].click();", Calenderone);
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_RIGHT).perform(); 
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        
        
        WebElement Calendertwo = driver.findElement(By.xpath("//input[@formcontrolname='expectedEndDate']"));
        js.executeScript("arguments[0].click();", Calendertwo);
        actions.sendKeys(Keys.ARROW_RIGHT).perform(); 
        Thread.sleep(2000);
        actions.sendKeys(Keys.ENTER).perform();
        
        
        Thread.sleep(2000);

        WebElement description = driver.findElement(By.xpath("//textarea[@class='form-control ng-untouched ng-pristine ng-valid']"));
        description.sendKeys("we have 1 month time in which whole website needs to automated");
        
        
        WebElement Done = driver.findElement(By.xpath("//button[normalize-space()='Save and Add Task']"));
Done.click();
Thread.sleep(2000);

WebElement Modulename = driver.findElement(By.cssSelector("body > ngb-modal-window:nth-child(12) > div > div > app-task > div > div.card-body.form-body.p-4 > form > div.row > div:nth-child(1) > div > input"));
Modulename.sendKeys("Testone");

WebElement Taskname = driver.findElement(By.xpath("/html/body/ngb-modal-window[2]/div/div/app-task/div/div[2]/form/div[1]/div[2]/div/input"));
Taskname.sendKeys("test task");

WebElement Descone = driver.findElement(By.xpath("/html/body/ngb-modal-window[2]/div/div/app-task/div/div[2]/form/div[1]/div[3]/div/textarea"));
Descone.sendKeys("this task needs to be completed asap");
actions.sendKeys(Keys.TAB).perform();
actions.sendKeys(Keys.ARROW_DOWN).perform(); 
Thread.sleep(2000);
actions.sendKeys(Keys.TAB).perform();
actions.sendKeys(Keys.TAB).perform();
actions.sendKeys(Keys.TAB).perform();
actions.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);

WebElement Savedone = driver.findElement(By.cssSelector("body > ngb-modal-window > div > div > app-add-milestone > div > div.card-body.form-body.p-4 > form > div.btn-submit.text-left > button.btn.btn-primary.mb-md-0.mb-2.ml-sm-2"));
Savedone.click();
Thread.sleep(2000);

WebElement Comm = driver.findElement(By.cssSelector("body > app-root > app-navigate-erp > div > div > app-add-project > div > div > div > div > form > div > div > div:nth-child(1) > div:nth-child(10) > div > div > ng-multiselect-dropdown > div > div:nth-child(1) > span > span.ng-star-inserted"));
js.executeScript("arguments[0].click();", Comm);

WebElement Commone = driver.findElement(By.cssSelector("body > app-root > app-navigate-erp > div > div > app-add-project > div > div > div > div > form > div > div > div:nth-child(1) > div:nth-child(10) > div > div > ng-multiselect-dropdown > div > div.dropdown-list > ul.item2 > li:nth-child(1) > div"));
Commone.click();
Thread.sleep(2000);

WebElement Savebtn = driver.findElement(By.cssSelector("body > app-root > app-navigate-erp > div > div > app-add-project > div > div > div > div > form > div > div > div:nth-child(7) > div.btn-submit.text-right.col-sm-6.ng-tns-c155-1 > a"));
Savebtn.click();


driver.close();

    }
}
                            

               
               


    

