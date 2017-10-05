import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Before;

public class TestBase {

  List<String> lines;

  @Before
  public void setup() {
    this.lines = this.readData();

  }

  private List<String> readData() {
    try(
        final InputStream data = this.getClass().getResourceAsStream("/data.txt");
        final BufferedReader stream
            = new BufferedReader(new InputStreamReader(data, Charset.forName("utf8")));
    ) {
      return stream.lines().collect(Collectors.toList());
    } catch (final IOException exception) {
      exception.printStackTrace();
      Assert.fail();
    }
    return Collections.emptyList();
  }
}
