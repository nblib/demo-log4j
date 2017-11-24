package demo.iewe;

import org.apache.log4j.Logger;

/**
 * @year 2017
 * @project demo-log4j
 * @description:<p></p>
 **/
public class Demo {
    Logger log = Logger.getLogger(Demo.class);

    public void out() {
        log.warn("字符串为空");
        log.error("数字转化错误");
        log.info("计算完成");
        log.debug("开始计算");
    }
}
