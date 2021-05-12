package tests;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

import org.junit.jupiter.api.Test;

public class MainPageTests extends BaseTest {

  @Test
  void mainPageShouldHaveFirstContentTest() {
    open("");
    step("Check that main page have first content", () -> {
      $$(".post__media").first().shouldHave(visible);
    });
  }
}
