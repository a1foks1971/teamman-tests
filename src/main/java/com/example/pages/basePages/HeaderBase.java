package com.example.pages.basePages;

import com.microsoft.playwright.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HeaderBase extends BasePage{
    private final String titleTestId = "title-in-header";
    private final String btnBackTestId = "btn-back-browser";
    private final String btnHomeTestId = "btn-go-to-home-page";
    private final String HOMETITLE = "home_title";

    public HeaderBase(Page page) {
        super(page);
    }

    public Page clickOnBack(Page page) {
        Locator locator = page.getByTestId(btnBackTestId);
        locator.click();
        return page;
    }

    public Page clickOnHome(Page page) {
        Locator locator = page.getByTestId(btnHomeTestId);
        locator.click();
        return page;
    }

    public Page verifyTitle(Page page) {
        return verifyTitle(page, "uk");
    }

    public Page verifyTitle(Page page, String language) {
        String expectedValue = getResourceTitle(HOMETITLE, language);
        assertThat(page.getByTestId(titleTestId)).hasText(expectedValue);
        return page;
    }
}
