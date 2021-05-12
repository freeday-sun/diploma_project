package tests;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

import org.junit.jupiter.api.Test;

public class TopMemesTests extends BaseTest {

  @Test
  void topMemesShouldContainsSubcategoriesTest() {
    open("");
    step("Check that top memes contains top day/week/month memes", () -> {
      $("a[data-test=top-memes]").click();
      $("a[data-test=top-day]").shouldHave(visible);
      $("a[data-test=top-week]").shouldHave(visible);
      $("a[data-test=top-month]").shouldHave(visible);
    });

  }
}
