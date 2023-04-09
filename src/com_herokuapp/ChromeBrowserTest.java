package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {



        //launch the Chrome Browser
        WebDriver driver= new ChromeDriver();

        //Open the Url into the Browser
        driver.get("http://the-internet.herokuapp.com/login");

        //Maximise the Browser
        driver.manage().window().maximize();

        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Get the title of the page
        String title  = driver.getTitle();
        System.out.println("Title of the page \t\t :" + title);

        //Print the current URl
        System.out.println( "Current Url \t\t\t\t :" +driver.getCurrentUrl());

        //Get page Source
        System.out.println("Page source \t\t\t :" + driver.getPageSource());

        //Find the Username element
        WebElement userName = driver.findElement(By.id("username"));
        //Type the Username to username field element
        userName.sendKeys("kruti123@gamil.com");

        //Find the password field element and Type the password
        driver.findElement(By.id("password")).sendKeys("kruti123");

        //Close the Browser
        driver.close();
    }

}
