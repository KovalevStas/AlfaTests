package tests;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.*;

public class AlfaTests {

    @Test
    void archiveDepositsTest() {
        open("https://alfabank.ru/make-money/savings-account/");
        $(byTitle("Депозиты")).click();
        $(".col-sm-8 a").click();
        $$(".product-cell__cell-box > div").shouldHave(CollectionCondition.size(3));
    }

    @Test
    void depositInsuranceTest() {
        open("https://alfabank.ru/make-money/savings-account/");
        $(".selected").sibling(4).click();
        $(".col-xs-offset-2").shouldHave(text("Страхование вкладов"));
    }
}
