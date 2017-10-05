import org.junit.Assert;
import org.junit.Test;

public class TestNoConflicts extends TestBase {


  @Test
  public void testNoConflictMarkers() {
    this.lines.stream()
              .filter((String line) -> line.matches(".*(<<<<|>>>>>|=====).*"))
              .findFirst()
              .ifPresent(line -> Assert.fail("Expected no conflict markers in file"));
  }
}
