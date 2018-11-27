package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class DeletePromotion {


    public static void main(String[] args) throws InterruptedException {
        //Open browser
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://sit-merchant.getzpass.com/Account/Login");
        Thread.sleep(1000);

        // Select dine-in service
        driver.findElement(By.id("UserName")).click();
        driver.findElement(By.id("UserName")).sendKeys("tuyensdc@gmail.com");
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).sendKeys("Qwe123!@#");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);
        driver.get("http://sit-merchant.getzpass.com/Product#/promotions");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Type 1")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[2]/following::button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[2]/following::button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Active'])[1]/following::td[1]")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
