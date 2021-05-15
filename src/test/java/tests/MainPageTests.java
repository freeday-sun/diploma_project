package tests;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MainPageTests extends BaseTest {

  @Feature("MainPage")
  @Story("MainPage memes")
  @DisplayName("MainPage have first meme")
  @Tag("web")
  @Test
  void mainPageShouldHaveFirstContentTest() {
    open("");
    step("Check that main page have first content", () -> {
      $$("div[data-test=post]").first().shouldHave(visible);
    });
  }
}
