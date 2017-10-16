package demo.hewe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        log.error("nihaoya");
        log.info("nihaoya");
        log.warn("nihaoya");
        log.trace("nihaoya");
        log.debug("nihaoya");
    }
}