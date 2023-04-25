import java.time.ZonedDateTime;

/**
 * @author shenghui
 * @version 1.0
 * @since 2020/9/3 16:33
 */
public class ZonedDateTimeDemo {
    public static void main(String[] args){
        //默认时区
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
    }
}
