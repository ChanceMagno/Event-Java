import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(1, 1, 1, 1, 0);
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void newEvent_partySizeSelected() {
    Event testEvent = new Event(1, 1, 1, 1, 0);
    assertEquals(1, testEvent.getPartySize());
  }

  @Test
  public void newEvent_Foodselected() {
    Event testEvent = new Event(1, 1, 1, 1, 0);
    assertEquals(1, testEvent.getFoodSelected());
  }

  @Test
  public void newEvent_DrinkSelected() {
    Event testEvent = new Event(1, 1, 1, 1, 0);
    assertEquals(1, testEvent.getDrinkSelected());
  }

  @Test
  public void newEvent_EntertainmentSelected() {
    Event testEvent = new Event(1, 1, 1, 1, 0);
    assertEquals(1, testEvent.getEntertainmentSelected());
  }

  @Test
  public void newEvent_couponAdded() {
    Event testEvent = new Event(1, 1, 1, 1, 0);
    assertEquals(0, testEvent.getCouponAdded());
  }

  @Test
  public void newEvent_EventEstimate() {
    Event testEvent = new Event(1, 1, 1, 1, 5);
    Integer expected = 520;
    assertEquals(expected, testEvent.addEstimateTotal(1, 1, 1, 1, 2));
  }
}
