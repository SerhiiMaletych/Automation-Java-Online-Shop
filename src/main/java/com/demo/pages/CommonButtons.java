package com.demo.pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.element;

public class CommonButtons {

    SelenideElement filterButton = element(By.id("searchDropdownBox"));
    SelenideElement searchField = element(By.id("twotabsearchtextbox"));

    public void clickOnMainLogo() {
       element(By.id("nav-logo-sprites")).click();
   }

    public void searchFor(String text) {
        searchField.sendKeys(text);
        searchField.submit();
    }

   public void filter(String text) {
        filterButton.sendKeys(text);
   }
}
