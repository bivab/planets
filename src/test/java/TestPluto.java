import org.junit.Assert;
import org.junit.Test;

public class TestPluto extends TestBase {
  @Test
  public void testPluto() {
    Assert.assertTrue(this.lines.stream().anyMatch(line -> line.matches("Pluto")));
  }

  @Test
  public void testTitle() {
    final String title = this.lines.get(0);
    Assert.assertTrue(title.matches(".*and Dwarf Planets.*"));
  }
}
