package guru.qa.homework.tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.Test;

public class SelenideTest extends BaseTest {

  @Test
  public void checkSoftAssertionOnWikiPage() {
    open("https://github.com/selenide/selenide");
    $("#wiki-tab").click();
    $("#wiki-pages-filter").setValue("SoftAssertions");
    $x("//a[normalize-space()='SoftAssertions']").click();
    $("#wiki-body").shouldHave(text("Using JUnit5 extend test class"));
  }

}
