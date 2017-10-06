import org.junit.Assert;
import org.junit.Test;

public class TestOuterPlanets extends TestBase {
  @Test
  public void testNumberOfPlanets() {
    Assert.assertTrue(8 <= this.lines.size());
  }

  @Test
  public void testJupiter() {
    Assert.assertTrue(this.lines.stream().anyMatch(lines -> lines.matches("Jupiter")));
  }

  @Test
  public void testSaturn() {
    Assert.assertTrue(this.lines.stream().anyMatch(lines -> lines.matches("Saturn")));
  }

  @Test
  public void testUranus() {
    Assert.assertTrue(this.lines.stream().anyMatch(lines -> lines.matches("Uranus")));
  }

  @Test
  public void testNeptune() {
    Assert.assertTrue(this.lines.stream().anyMatch(lines -> lines.matches("Neptune")));
  }
}
