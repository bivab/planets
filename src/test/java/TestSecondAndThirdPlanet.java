import org.junit.Assert;
import org.junit.Test;

public class TestSecondAndThirdPlanet extends TestBase {
  @Test
  public void testSecondPlanet() {
    Assert.assertTrue(this.lines.stream().anyMatch(line -> line.matches("Venus")));
  }

  @Test
  public void testThirdPlanet() {
    Assert.assertTrue(this.lines.stream().anyMatch(line -> line.matches("Earth")));
  }
}
