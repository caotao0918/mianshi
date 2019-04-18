package timer;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Title: TimerTest类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
//定时任务
public class TimerTest {
    public static void main(String[] args) throws ParseException {
        //1.创建定时器
        Timer timer = new Timer();
        //2.指定定时任务
        //旧的API
        //timer.schedule(new LogTimerTask(), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-04-11 11:15:00"),10*1000);

        //新的API
        //将localdatetime转换为date对象
        Date from = Date.from(LocalDateTime.of(LocalDate.now(), LocalTime.now()).plusSeconds(20).atZone(ZoneId.systemDefault()).toInstant());
        timer.schedule(new LogTimerTask(), from,10*1000);

    }
}
class LogTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
