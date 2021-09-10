package com.demo.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

public class BookPage {
    SelenideElement headFirstJava = element(By.xpath("//*[contains(text(), 'Head First Java')]"));

    public boolean isItemDisplayed() {
       return headFirstJava.isDisplayed();
    }
}
