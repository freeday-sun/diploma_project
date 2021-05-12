package tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

import org.junit.jupiter.api.Test;

public class AddMemeTests extends BaseTest {

  @Test
  void unauthorizedUserCannotAddMemesTest() {
    open("");
    step("Check unauthorized user can't add meme from main page", () -> {
      $("button[data-test=add-meme-link]").click();
      $("h2").shouldHave(text("enter to iFunny"));
    });

  }
}
