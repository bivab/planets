import org.junit.Assert;
import org.junit.Test;

public class TestPluto extends TestBase {
  @Test
  public void testPlutoIsNotPresent() {
    Assert.assertFalse(this.lines.stream().anyMatch(line -> line.matches("Pluto")));
  }

  @Test
  public void testTitleIsPlanets() {
    final String title = this.lines.get(0);
    Assert.assertTrue(title.matches("Planets"));
  }
}
