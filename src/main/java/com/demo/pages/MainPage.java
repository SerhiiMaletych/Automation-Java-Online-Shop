package com.demo.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.element;

public class MainPage {
    SelenideElement searchField = element(By.id("search_query_top"));

    public void searchFor(String text) {
        searchField.sendKeys(text);
        searchField.submit();
    }
}
