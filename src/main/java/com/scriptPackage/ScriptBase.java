package com.scriptPackage;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ScriptBase {
    public WebDriver driver;


   @BeforeMethod
    public void before(){
        ChromeDriverManager.getInstance().arch32().setup();
        driver=new ChromeDriver();

        driver.manage().window().maximize();
        String s = "http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html";
        driver.navigate().to(s);



    }







    @AfterMethod
    public void after(){
        //driver.close();
        //driver.quit();

    }
}
