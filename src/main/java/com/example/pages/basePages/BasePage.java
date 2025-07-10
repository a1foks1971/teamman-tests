package com.example.pages.basePages;

import com.microsoft.playwright.Page;
import java.util.Locale;
import java.util.ResourceBundle;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public abstract class BasePage {
    protected final Page page;

    public BasePage(Page page) {
        this.page = page;
    }

    protected static String getResourceTitle(String title, String language) {

        Locale locale = Locale.forLanguageTag(language);
        ResourceBundle bundle = ResourceBundle.getBundle("titles", locale);

        return bundle.getString(title);
    }
}