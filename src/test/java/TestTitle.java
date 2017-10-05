import org.junit.Assert;
import org.junit.Test;

public class TestTitle extends TestBase {
  @Test
  public void testPlanets() {
    Assert.assertTrue(this.lines.get(0).contains("Planets"));
  }

  @Test
  public void testUnderline() {
    Assert.assertTrue(this.lines.get(1).contains("^^^^^^^^"));
  }
}
