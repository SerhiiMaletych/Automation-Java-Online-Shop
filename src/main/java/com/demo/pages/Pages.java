package com.demo.pages;

import com.demo.core.allure.AllureLogger;

public class Pages extends AllureLogger {
    public static String basicURL = "https://www.amazon.com/";

    private static MainPage mainPage;
    private static CommonButtons commonButtons;
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


}