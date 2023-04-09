package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {


    static String browser = "Edge";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();

        }else if(browser.equalsIgnoreCase("FireFox")){
            driver = new FirefoxDriver();

        }else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();

        }else {
            System.out.println("Wrong Browser name");
        }
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/login");

        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        System.out.println("Title of the page : \t\t\t" +driver.getTitle());

        //Print the current Url
        System.out.println("Current Url driver : \t\t\t " +driver.getCurrentUrl());

        //Get page source
        System.out.println("Page source : \t\t\t" + driver.getPageSource());

        //Find the Username field name
        WebElement userName = driver.findElement(By.name("username"));

        //Type username field name in username
        userName.sendKeys("kruti@gamil.com");

        //Find the password field and Type the password
        driver.findElement(By.name("password")).sendKeys("kanan12");

        //Close the Browser close
        driver.close();
    }

}
