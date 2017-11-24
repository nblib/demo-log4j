package demo.hewe;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @year 2017
 * @project demo-log4j
 * @description:<p>测试logstash各个过滤器和输出效果,输入采用log4j模块</p>
 **/
public class LogstashTest {
    static Logger log = Logger.getLogger(LogstashTest.class);

    @Test
    public void testKvFilter() {
        log.info("name=nihao age=24");
    }

    /*
        tiemzone 决定当前发送的时间字段的时区,到了logstash都被转化为标准时间ISO8601 2011-04-19T03:44:01.103Z,在用的时候比如在kibana中又会按照设置的时区转化过来.
     */
    @Test
    public void testDateFilter() {
        log.info("name=nihao savedate=20171120");
//        log.info("savedate=235");
    }
}
