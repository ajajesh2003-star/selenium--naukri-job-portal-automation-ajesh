package onlineJobProtal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Naukri {

    public static void main(String[] args) throws InterruptedException {


        // Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Naukri
        driver.get("https://www.naukri.com/");
        Thread.sleep(3000);
        

        // Wait object
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        //register
        driver.findElement(By.id("register_Layer")).click();
        
        //start registering
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Preveen");
        
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("PraveenARYASSs200333@gmail.com");
        
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("praveenan@2003");
        
        driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7510487212");
        
        driver.findElement(By.xpath("(//div[@class='focusable optionWrap  '])[2]")).click();
        
       // driver.findElement(By.xpath("//input[@id='currentCity']")).sendKeys("Chennai");
        
        // Wait until submit button becomes click able
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Register now')]") )).click();
        Thread.sleep(60000);
        
       
        //verification the OTP(add OTP manually with correct phone number)
        driver.findElement(By.xpath("//button[text()='Verify']")).click();
        Thread.sleep(3000);
        
        //add Education details
        driver.findElement(By.xpath("//span[text()='Masters/Post-Graduation']")).click();
        Thread.sleep(3000);
        
       // driver.findElement(By.xpath("//input[@id='course-suggestor']")).click();
        driver.findElement(By.xpath("//span[text()='MCA']")).click();
        Thread.sleep(3000);
        
        
        driver.findElement(By.xpath("//span[text()='Full Time']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@id='course-suggestor']")).sendKeys("computers");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[text()='Computers']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='institute-suggestor']")).sendKeys("Mahatma Gandhi University");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("(//span[text()='Mahatma Gandhi University'])[1]")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("(//input[@class='year-input mandatory __input'])[1]")).sendKeys("2021");
        driver.findElement(By.xpath("(//input[@class='year-input mandatory __input'])[2]")).sendKeys("2024");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@class='ddInput']")).click();
        driver.findElement(By.xpath("//li[text()='Course Requires a Pass']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@class='suggestor-input ']")).sendKeys("Software Testing");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='opt  '])[1]")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[text()='Save and continue']")).click();
        Thread.sleep(3000);
        
        //Add headline & preferences
        driver.findElement(By.xpath("//textarea[@id='resumeHeadline']")).sendKeys("Jobseeker with MCA in Computers currently living in Kochi");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//p[text()='Jobseeker with MCA in Computers currently living in Kochi']")).click();
        //Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@id='newLocationPrefId']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Chennai']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Remote']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@id='salaryInp']")).sendKeys("270000");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//span[text()='Male']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        Thread.sleep(4000);
       
        
        //Naukri homepage(Searching for jobs)
        
       // driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
       // Thread.sleep(3000);
       // driver.findElement(By.xpath("//div[@class='nI-gNb-sb__main']")).click();
        // Thread.sleep(3000);
         driver.findElement(By.xpath("//div[@class='nI-gNb-sb__main']")).sendKeys("Software Testing");
         Thread.sleep(3000);
        // driver.findElement(By.xpath("//input[@id='experienceDD']")).click();
         //Thread.sleep(3000);
        // driver.findElement(By.xpath("//span[text()='Fresher']")).click();
         //Thread.sleep(3000);
         //driver.findElement(By.xpath("(//input[@class='suggestor-input '])[2]")).sendKeys("Chennai");
         //Thread.sleep(3000);
         driver.findElement(By.xpath("//span[@class='ni-gnb-icn ni-gnb-icn-search']")).click();
         Thread.sleep(4000);
         
         //logout :-
         // click profile button
         driver.findElement(By.xpath("//img[@class='nI-gNb-icon-img']")).click();
         Thread.sleep(3000);
         
         driver.findElement(By.xpath("(//a[@class='nI-gNb-list-cta'])[4]")).click();
         
         
         
         
         
         
         
         
        // Click Login button
      //  driver.findElement(By.id("login_Layer")).click();
       // Thread.sleep(2000);

        // Enter Email
       // driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("ajesh2506@gmail.com");

        // Enter Password
        //driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("ajesh@123");

        // Click Login
        //driver.findElement(By.xpath("//button[text()='Login']")).click();

       // Thread.sleep(5000);

        // Close browser
        driver.quit();
    }
}
