package com.testBase;

import com.scriptPackage.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait extends ScriptBase{

    @Test
    public void explicitWaitTest(){
        WebElement element=driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        element.click();
        String text=element.getText();
        System.out.println(text);
      /*  WebElement element1=driver.findElement(By.xpath("//p[text()='WebDriver']"));
        element1.click();
        String text1=element1.getText();
        System.out.println(text1);
        */
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']"))).click();
    }
}
