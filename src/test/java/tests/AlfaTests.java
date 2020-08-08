package tests;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.*;

public class AlfaTests {

    @Test
    void archiveDepositsTest() {
        open("https://alfabank.ru/make-money/savings-account/");
        
        $(byTitle("Депозиты")).click();
        $(byText("Архивные депозиты")).click();
        
        $$(".product-cell__cell").shouldHave(size(3));
    }

    @Test
    void depositInsuranceTest() {
        open("https://alfabank.ru/make-money/savings-account/");

        $(".selected").sibling(4).click();
        
        $(".frame-head").shouldHave(text("Страхование вкладов"));
    }
}
