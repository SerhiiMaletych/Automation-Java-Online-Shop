package com.demo.pages;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.elements;

public class CommonButtons {

    SelenideElement filterButton = element(By.id("searchDropdownBox"));
    SelenideElement searchField = element(By.id("twotabsearchtextbox"));
    SelenideElement chooseCountryButton = element((By.xpath("//*[@id='GLUXCountryValue']")));

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
