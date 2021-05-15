package tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTest {

  @Feature("Login")
  @Story("Login button show login form")
  @DisplayName("Login button show login form")
  @Tag("web")
  @Test
  void mainPageCanShowLoginModalWindowTest() {
    open("");
    step("Check that main page can show login modal window", () -> {
      $("a[data-test=login-link]").click();
      $("h2").shouldHave(text("enter to iFunny"));
    });

  }
}
