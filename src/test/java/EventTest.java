import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void runEvent_instantiatesCorrectly() {
    Event testEvent = new Event(1, 1, 1, 1);
    assertEquals(true, testEvent instanceof Event);
  }

}
