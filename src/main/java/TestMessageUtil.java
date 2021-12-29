import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestMessageUtil {

  String message = "Niraj";
  MessageUtil messageUtil = new MessageUtil(message);

  @Test
  public void testPrintMessage() {
    System.out.println("Inside testPrintMessage()");
    assertEquals(message,messageUtil.printMessage());
  }

  @Test
  public void testsalutationMessage() {
    System.out.println("Inside testsalutationMessage()");
    message = "Welcome to car-rentals app" + "Niraj";
    assertEquals(message,messageUtil.salutationMessage());
  }
}
