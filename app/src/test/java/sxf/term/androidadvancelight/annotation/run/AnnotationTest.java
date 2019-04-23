package sxf.term.androidadvancelight.annotation.run;

/**
 * @author by sunzhongda
 * @date 2019/4/10
 */
public class AnnotationTest {

    @Get(value = "http://www.baidu.com")
    public String getIpMsg(){
        return "";
    }

    @Get(value = "127.0.0.1")
    public String getIp(){
        return "";
    }
}
