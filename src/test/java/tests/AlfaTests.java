package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AlfaTests extends TestBase {

    @Test
    void archiveDepositsTest() {
        open("https://alfabank.ru/make-money/savings-account/");
        
        $$("button").find(text("Депозиты")).click();
        $(byText("Архивные счета и депозиты")).click();
        
        $$("[data-widget-name='CatalogCard']").shouldHave(sizeGreaterThan(3));
    }
}
