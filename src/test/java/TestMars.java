import org.junit.Assert;
import org.junit.Test;

public class TestMars extends TestBase {

  @Test
  public void testMars() {
    Assert.assertTrue(this.lines.stream().anyMatch(line -> line.matches("Mars")));
  }
}
