package com.demo.pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

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

   public void clickOnDeliverToButton() {
    element(By.xpath("//a[@id='nav-global-location-popover-link']")).click();
   }

   public void clickOnCountryButton() {
       chooseCountryButton.click();
   }
   public void clickOnSpain(){
       element((By.id("GLUXCountryList_209"))).click();
   }

   public void clickOnAcceptDeliveryChangeButton() {
        element(By.xpath(("//button[@id='a-autoid-2-announce']"))).click();
   }

   public String getDeliveryCountry() {
        String country = element(By.xpath("//*[@id='glow-ingress-line2']")).getText();
        return country;
   }
}
