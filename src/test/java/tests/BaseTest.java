package tests;


import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static helpers.AttachmentsHelper.attachAsText;
import static helpers.AttachmentsHelper.attachPageSource;
import static helpers.AttachmentsHelper.attachScreenshot;
import static helpers.AttachmentsHelper.attachVideo;
import static helpers.AttachmentsHelper.getConsoleLogs;

import helpers.DriverHelper;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

  @BeforeAll
  static void setup() {
    DriverHelper.configureDriver();
    addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
  }


  @AfterEach
  public void afterEach() {
    attachScreenshot("Last screenshot");
    attachPageSource();
    attachAsText("Browser console logs", getConsoleLogs());
    if (System.getProperty("video_storage") != null) {
      attachVideo();
    }
    closeWebDriver();
  }
}
