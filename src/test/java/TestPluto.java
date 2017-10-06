import org.junit.Assert;
import org.junit.Test;

public class TestPluto extends TestBase {
  @Test
  public void testPluto() {
    Assert.assertTrue(this.lines.stream().anyMatch(line -> line.matches("Pluto")));
  }
}
