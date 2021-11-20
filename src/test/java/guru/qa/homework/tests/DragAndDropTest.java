package guru.qa.homework.tests;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.Test;

public class DragAndDropTest extends BaseTest {

  @Test
  public void checkDragAndDrop() {
    open("https://the-internet.herokuapp.com/drag_and_drop");
    $("#column-a").dragAndDropTo($("#column-b"));
    $("#column-a").shouldHave(exactText("B"));
    $("#column-b").shouldHave(exactText("A"));
    $("");
  }

}
