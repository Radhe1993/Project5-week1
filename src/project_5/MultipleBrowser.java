package project_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class MultipleBrowser
{
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        String browser;
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the Browser name  = ");
        browser = ob.nextLine();
        // Browser setup
        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("FireFox"))
        {
            driver  =new FirefoxDriver();
        }
        else  if (browser.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();
        }
        else
        {
            System.out.println("Wrong Browser name");
        }

        // Open URL
        driver.get(baseUrl);
        // Maximize web page
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Print the title
        System.out.println("Print the title = "+driver.getTitle());
        // Print the Current URL
        System.out.println("Print the URL = "+driver.getCurrentUrl());
        // Print the page source
        System.out.println("Print the page source = "+driver.getPageSource());

        // Enter the email in email field
        driver.findElement(By.name("user[email]")).sendKeys("Ganesha@gamil.com");
        // Enter the password in password field
        driver.findElement(By.name("user[password]")).sendKeys("98765432");

        // Close the Browser
        Thread.sleep(5000);
        driver.close();


    }
}
