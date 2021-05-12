package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

  @BeforeAll
  static void setup() {
    RestAssured.filters(new AllureRestAssured());
    RestAssured.baseURI = "https://m2.ru";
    Configuration.baseUrl = "https://m2.ru";
  }
}
