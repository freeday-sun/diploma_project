package tests;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static helpers.AttachmentsHelper.attachAsText;
import static helpers.AttachmentsHelper.attachPageSource;
import static helpers.AttachmentsHelper.attachScreenshot;
import static helpers.AttachmentsHelper.attachVideo;
import static helpers.DriverHelper.configureDriver;
import static helpers.DriverHelper.getConsoleLogs;
import static helpers.DriverHelper.getSessionId;
import static helpers.DriverHelper.isVideoOn;

import com.codeborne.selenide.Configuration;
import config.ConfigHelper;
import io.qameta.allure.selenide.AllureSelenide;
import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

  @BeforeAll
  static void setup() {
    configureDriver();
    RestAssured.baseURI = ConfigHelper.getBaseURL();
    Configuration.baseUrl = ConfigHelper.getWebUrl();
  }


  @AfterEach
  public void afterEach() {
    String sessionId = getSessionId();

    attachScreenshot("Last screenshot");
    attachPageSource();
    attachAsText("Browser console logs", getConsoleLogs());
    if (isVideoOn()) attachVideo(sessionId);

    closeWebDriver();
  }
}
