package com.demo.pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.elements;

public class LanguagePage {

    public void clickChangeLanguageButton() {
        element(By.id("icp-nav-flyout")).click();
    }

    public void selectLanguageRadioButton(int count){
        ElementsCollection elements = elements(By.xpath("//*[@class='a-icon a-icon-radio']"));
        elements.get(count).click();
    }

    public String getTopTextOfLanguagePage(){
        String text = element(By.id("lop-heading")).getText();
        return text;
    }
}
