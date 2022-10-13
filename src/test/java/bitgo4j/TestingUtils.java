package bitgo4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public final class TestingUtils {

  private static final String PROPERTY_FILE_PATH = "src/test/resources/local.properties";

  public static Properties getProperties() throws IOException {
    Properties properties = new Properties();
    try (FileInputStream in = new FileInputStream(PROPERTY_FILE_PATH)) {
      properties.load(in);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    return properties;
  }
}
