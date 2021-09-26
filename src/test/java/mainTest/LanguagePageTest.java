package mainTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.demo.pages.Pages.*;

public class LanguagePageTest {

    @Test
    public void testLanguageChangeToEspanol() {
        String espanolTopText = "Idioma de preferencia";
        int count = 1;
        open(basicURL);
        languagePage().clickChangeLanguageButton();
        languagePage().selectLanguageRadioButton(count);
        Assert.assertEquals(languagePage().getTopTextOfLanguagePage(), espanolTopText);
    }
    @Test
    public void testLanguageChangeToDeutch() {
        String deutchTopText = "Sprache";
        int count = 3;
        open(basicURL);
        languagePage().clickChangeLanguageButton();
        languagePage().selectLanguageRadioButton(count);
        Assert.assertTrue(languagePage().getTopTextOfLanguagePage().contains(deutchTopText));
    }

}
