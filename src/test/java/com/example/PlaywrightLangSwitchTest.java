package com.example;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;
import com.example.pages.basePages.HeaderBase;

public class PlaywrightLangSwitchTest  extends BaseTest{

    @Test
    void testLanguageSwitch() {
        // Заменить на свой URL
        page.navigate("http://localhost:8080");
        HeaderBase headerPg = new HeaderBase(page);

        headerPg.verifyTitle(page);


//        page.selectOption("#lang-switcher", "us");
//        Assertions.assertEquals("Settings", page.textContent("#btn-settings"));
//
//        page.selectOption("#lang-switcher", "uk");
//        Assertions.assertEquals("Налаштування", page.textContent("#btn-settings"));

        context.close();
    }
}