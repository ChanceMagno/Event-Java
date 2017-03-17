import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void runEvent_instantiatesCorrectly() {
    Event testEvent = new Event(1, 1, 1, 1);
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void runEvent_partySizeSelected() {
    Event testEvent = new Event(1, 1, 1, 1);
    assertEquals(1, testEvent.getPartySize());
  }

  @Test
  public void runEvent_Foodselected() {
    Event testEvent = new Event(1, 1, 1, 1);
    assertEquals(1, testEvent.getFoodSelected());
  }

  @Test
  public void runEvent_DrinkSelected() {
    Event testEvent = new Event(1, 1, 1, 1);
    assertEquals(1, testEvent.getDrinkSelected());
  }

}
