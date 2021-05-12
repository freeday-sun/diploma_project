package tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

import org.junit.jupiter.api.Test;

public class CategoriesTests extends BaseTest {

  @Test
  void CategoriesForwardToCertainCategoryTest() {
    open("");
    step("Check that categories from main page redirect to certain category", () -> {
      $$("a[data-test=categories-item-desktop]").get(0).click();
      $("h1").shouldHave(text("Animals & Nature memes"));
    });

  }
}
