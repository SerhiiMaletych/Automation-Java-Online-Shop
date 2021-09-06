package com.demo.pages;


import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.element;

public class CommonButtons {

   public void clickOnMainLogo() {
       element(By.id("nav-logo-sprites")).click();
   }
}
