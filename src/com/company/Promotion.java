package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Promotion {
    public static void main(String[] args) throws InterruptedException {


        /* Creating new promotion */

        //Open browser
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://sit-merchant.getzpass.com/Account/Login");
        Thread.sleep(1000);

        // Login merchant panel
        driver.findElement(By.id("UserName")).click();
        driver.findElement(By.id("UserName")).sendKeys("tuyensdc@gmail.com");
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).sendKeys("Qwe123!@#");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);
        driver.get("http://sit-merchant.getzpass.com/Product#/promotions");
        Thread.sleep(3000);

        // Open promotion list
        driver.findElement(By.xpath("//html/body/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/button")).click();
        Thread.sleep(3000);

        //Select promotion type
        driver.get("http://sit-merchant.getzpass.com/Product#/promotion/0/1");
        Thread.sleep(2000);

        // Information
        driver.findElement(By.xpath("//input[@name='title']")).click();
        driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Type "+Math.floor(Math.random()*15000));
        Thread.sleep(1000);

        // Select the items
        driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > .col-xs-11 .col-xs-5 .glyphicon")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("f77eccfd-2307-4ec9-9327-2d34e905d210")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.col-sm-4 > button.btn.btn-primary")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".ng-scope:nth-child(2) > .col-xs-11 .col-xs-5 .glyphicon")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("aafd35c8-01ad-42a6-bd85-5632063c8f9b")).click();
        driver.findElement(By.cssSelector("div.col-sm-4 > button.btn.btn-primary")).click();
        Thread.sleep(2000);
        Object o = ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");

        // Group discount
        driver.findElement(By.cssSelector("div.col-xs-12 > div.form-inline > div.input-group > input[name=\"to\"]")).click();
        driver.findElement(By.cssSelector("div.col-xs-12 > div.form-inline > div.input-group > input[name=\"to\"]")).sendKeys("5");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@name='to'])[4]")).click();
        driver.findElement(By.xpath("(//input[@name='to'])[4]")).sendKeys("7");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@name='minimumSubtotal'])[2]")).click();
        driver.findElement(By.xpath("(//input[@name='minimumSubtotal'])[2]")).sendKeys("100");
        Thread.sleep(2000);

        //Validity and redemption
        driver.findElement(By.id("pickup")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("day_0")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("span.pull-left.ng-binding")).click();
        driver.findElement(By.id("CheckAllStores")).click();
        Thread.sleep(1000);

        // Save promotion
        driver.findElement(By.cssSelector(".pull-right:nth-child(1) > .btn-primary:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
