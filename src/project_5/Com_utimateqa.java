package project_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Com_utimateqa
{
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        // Set Up the Browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Print the title
        System.out.println("Print the title = "+driver.getTitle());
        // Print the Current Url
        System.out.println("Print the current URL = "+driver.getCurrentUrl());
        // Print the page source
        System.out.println("Print the page source = "+driver.getPageSource());

        //Enter the email in email field
        driver.findElement(By.name("user[email]")).sendKeys("Ganesha@gamil.com");
        // Enter the password in password field
        driver.findElement(By.name("user[password]")).sendKeys("98765432");

        Thread.sleep(5000);
        driver.close();


    }
}
