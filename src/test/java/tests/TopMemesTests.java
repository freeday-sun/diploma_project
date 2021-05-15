package tests;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TopMemesTests extends BaseTest {

  @Feature("TopMemes")
  @Story("TopMemes page have memes")
  @DisplayName("TopMemes page have quite a few memes")
  @Tag("web")
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
