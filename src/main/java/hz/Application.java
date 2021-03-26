package hz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
  public static void main(String[] args) {
      Logger log = LoggerFactory.getLogger(Application.class);
      log.error("Hello World");
  }
}
