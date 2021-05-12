package tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTest {

  @Test
  void mainPageCanShowLoginModalWindowTest() {
    open("");
    step("Check that main page can show login modal window", () -> {
      $("a[data-test=login-link]").click();
      $("h2").shouldHave(text("enter to iFunny"));
    });

  }
}
