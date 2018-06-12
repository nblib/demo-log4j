package demo.hewe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    private static final Logger log = LoggerFactory.getLogger(Test.class);
    public static void out() {
        log.info("this is test");
        log.debug("this is test");
        log.error("this is test");

    }
}
