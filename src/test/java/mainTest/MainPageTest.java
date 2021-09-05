package mainTest;

import com.codeborne.selenide.WebDriverRunner;
import com.demo.core.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.demo.pages.Pages.basicURL;
import static com.demo.pages.Pages.mainPage;

public class MainPageTest extends BaseTest {

         @Test
         public void checkMainPageForAvailability(){
            open(basicURL);
            String actualURL = WebDriverRunner.getWebDriver().getCurrentUrl();
            String expectedURL = basicURL;
            Assert.assertEquals(actualURL, expectedURL);
        }

        @Test
         public void checkMainPageSearchForAvailability(){
             open(basicURL);
             mainPage().searchFor("Dress");
             String expectedURL = WebDriverRunner.getWebDriver().getCurrentUrl();
             Assert.assertTrue(expectedURL.contains("search_query=Dress"));

        }
}