package tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

import allure.JiraIssue;
import allure.JiraIssues;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CategoriesTests extends BaseTest {

  @Feature("Categories")
  @Story("It's possible to go to category from main site")
  @DisplayName("Category link forward you to certain category")
  @Tag("web")
  @JiraIssues({@JiraIssue("QC3-38")})
  @Test
  void CategoriesForwardToCertainCategoryTest() {
    open("");
    step("Check that categories from main page redirect to certain category", () -> {
      $$("a[data-test=categories-item-desktop]").get(0).click();
      $("h1").shouldHave(text("Animals & Nature memes"));
    });

  }
}
