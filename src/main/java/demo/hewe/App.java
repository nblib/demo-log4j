package demo.hewe;

import org.apache.log4j.Logger;

/**
 * Hello world!
 */
public class App {
    static Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) {
       test();

    }
    public static void test(){
        log.warn("字符串为空");
        log.error("数字转化错误");
        log.info("计算完成");
        log.debug("开始计算");
    }
}