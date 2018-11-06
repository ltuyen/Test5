package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Delivery {
    public static void main(String[] args) throws InterruptedException {


        /* Delivery ordering */

        //Open browser
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://tuyen.online.sit.getzpass.com");
        Thread.sleep(2000);

        // Select delivery service
        driver.findElementByXPath("//div[@id='btnDelivery']/div[2]/img").click();
        Thread.sleep(2000);
        driver.findElement(By.id("postalCodeAutocomplete")).click();
        driver.findElement(By.id("postalCodeAutocomplete")).sendKeys("318990");
        driver.findElement(By.id("btnAddPostalCode")).click();

        // Add item to my cart
        driver.findElement(By.id("addToCart-9ea89546-ba04-4c56-97c2-f58da8025340")).click();
        Thread.sleep(2000);

        // This  will scroll down the page by 500 pixel vertical
        Object o = ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);

        // Checkout order
        driver.findElement(By.id("btnCheckOut")).click();
        driver.findElement(By.id("member_firstName")).click();
        driver.findElement(By.id("member_firstName")).sendKeys("tuyen");
        driver.findElement(By.id("member_lastName")).click();
        driver.findElement(By.id("member_lastName")).sendKeys("le");
        driver.findElement(By.id("member_email")).click();
        driver.findElement(By.id("member_email")).sendKeys("tuyensdc@gmail.com");
        driver.findElement(By.id("member_phone")).click();
        driver.findElement(By.id("member_phone")).sendKeys("92345678");
        driver.findElement(By.id("member_address")).click();
        driver.findElement(By.id("member_address")).sendKeys("1");
        driver.findElement(By.id("member_address2")).click();
        driver.findElement(By.id("member_address2")).sendKeys("1");
        driver.findElement(By.id("check_payment")).click();
        Thread.sleep(2000);

        //Login GetzPay account and payment
        driver.findElement(By.id("tab2href")).click();
        driver.findElementByXPath("(//input[@name='account_type'])[2]").click();
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("tuyen.le@smoovapp.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("GetzPay123");
        driver.findElement(By.id("btnLog")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("SecurityCode")).click();
        driver.findElement(By.id("SecurityCode")).sendKeys("123");
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)");
        Thread.sleep(2000);
        driver.findElement(By.id("TempAgreeTC")).click();
        driver.findElement(By.id("btnSubmit")).click();

        //Verify the tracker order status
        assertEquals(driver.findElement(By.cssSelector("h2.title-2")).getText(), "TRACK YOUR ORDER STATUS");
        driver.quit();
    }

    private static void assertEquals(String text, String track_your_order_status ) {

    }
}
