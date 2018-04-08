package com.testBase;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Set;

public class WindowHandlesPractice {

    public WebDriver driver;


    @BeforeMethod
    public void before(){
        ChromeDriverManager.getInstance().arch32().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://toolsqa.com/automation-practice-switch-windows/");

    }

    public static void main(String[] args){
        new WindowHandlesPractice().test();
    }

    public void test() {
        WebElement element = driver.findElement(By.xpath("//button[text()='New Browser Tab']"));
        element.click();
        String currentWindow = driver.getWindowHandle();
        System.out.println(currentWindow);
        Set<String> windows = driver.getWindowHandles();

        for(String window: windows) {
            System.out.println(window);
            if(!window.equals(currentWindow)) {
                driver.switchTo().window(window);
            }
        }
        System.out.println(driver.getCurrentUrl());
        driver.close();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.switchTo().window(currentWindow);
        System.out.println(driver.getCurrentUrl());
    }

    @AfterMethod
    public void after(){
        //driver.close();
        //driver.quit();

    }
}
