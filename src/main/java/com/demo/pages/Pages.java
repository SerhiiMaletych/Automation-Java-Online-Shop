package com.demo.pages;

import com.demo.core.allure.AllureLogger;

public class Pages extends AllureLogger {
    public static String basicURL = "https://www.amazon.com/";

    private static MainPage mainPage;
    private static CommonButtons commonButtons;
    private static BookPage bookPage;
    public static MainPage mainPage() {
        if (mainPage == null) {
            mainPage = new MainPage();
        }
        return mainPage;
    }

    public static CommonButtons commonButtons() {
        if (commonButtons == null) {
            commonButtons = new CommonButtons();
        }
        return commonButtons;
    }

    public static BookPage bookPage() {
        if(bookPage == null) {
            bookPage = new BookPage();
        }
        return bookPage;
    }


}