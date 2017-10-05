import org.junit.Assert;
import org.junit.Test;

public class TestFirstPlanet extends TestBase {
  @Test
  public void testFirstPlanet() {
    Assert.assertTrue(this.lines.stream()
                                .anyMatch(line -> line.matches("Mercury")));

  }
}
