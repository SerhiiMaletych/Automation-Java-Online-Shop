package mainTest;

import com.codeborne.selenide.WebDriverRunner;
import com.demo.core.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.demo.pages.Pages.*;

public class MainPageTest extends BaseTest {

         @Test
         public void checkMainPageForAvailability(){
            open(basicURL);
            String actualURL = WebDriverRunner.getWebDriver().getCurrentUrl();
            String expectedURL = basicURL;
            Assert.assertEquals(actualURL, expectedURL);
        }
        @Test
         public void searchButtonReturnsCorrectPage(){
            open(basicURL);
            commonButtons().searchFor("Dress");
            String expectedURL = WebDriverRunner.getWebDriver().getCurrentUrl();
            Assert.assertTrue(expectedURL.contains("Dress"));
        }
        @Test
        public void clickOnLogoButtonReturnsMainPage(){
             open(basicURL);
             commonButtons().clickOnMainLogo();
             Assert.assertTrue(basicURL.contains("amazon.com"));
        }

        @Test
        public void searchButtonWithFilterReturnsCorrectPage() {
             open(basicURL);
            commonButtons().filter("Books");
            commonButtons().searchFor("Java");
            String expectedURL = WebDriverRunner.getWebDriver().getCurrentUrl();
            Assert.assertTrue(expectedURL.contains("books"));
            Assert.assertTrue(expectedURL.contains("Java"));
        }

        @Test
        public void searchButtonWithFilterHasSpecifiedItemOnPage() {
             open(basicURL);
             commonButtons().filter("Books");
             commonButtons().searchFor("Java");
             Assert.assertTrue(bookPage().isItemDisplayed());
        }

        @Test
        public void changeDeliveryCountry(){
             open(basicURL);
             commonButtons().clickOnDeliverToButton();
             commonButtons().clickOnCountryButton();
             commonButtons().clickOnSpain();
             commonButtons().clickOnAcceptDeliveryChangeButton();
            String country = "Spain";
             Assert.assertEquals(commonButtons().getDeliveryCountry(), country);
        }


}
