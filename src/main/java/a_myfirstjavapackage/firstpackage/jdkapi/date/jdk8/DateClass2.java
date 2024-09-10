package a_myfirstjavapackage.firstpackage.jdkapi.date.jdk8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateClass2 {
    /*ZoneId:时区
Instant:时间戳
ZoneDateTime:带时区的时间
DateTimeFormatter用于时间的格式化和解析
LocalDate:年、月、日
LocalTime:时、分、秒
LocalDateTime:年、月、日、时、分、秒
Duration:时间间隔（秒，纳秒)
Period:时间间隔（年，月，日)
ChronoUnit:时间间隔（所有单位）

//当前时间now() 指定时间of()
//修改with() plus() minus() get() between()
*/

    public static void main(String[] args) {
//        for (String id : ZoneId.getAvailableZoneIds()) {
//            System.out.println(id);
//        }

        //ZoneId:时区
        System.out.println(ZoneId.systemDefault());
        System.out.println(ZoneId.of(ZoneId.systemDefault().toString()));

        //Instant:时间戳
        System.out.println(Instant.now());
        Instant instant = Instant.now();
        Instant instant1 = Instant.ofEpochSecond(1);
//        instant.atZone(ZoneId)
//        instant1.

//        ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2008, 8, 8, 8, 8, 8,0,ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTime1 = zonedDateTime.withYear(2024);
        zonedDateTime.withHour(11);
        zonedDateTime.minusDays(1);
        zonedDateTime.plusSeconds(10);
        System.out.println(zonedDateTime1);

//        DateTimeFormatter
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH点mm分");
        System.out.println(dtf.format(zonedDateTime1));

//        LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate localDate1= LocalDate.of(2020, 1, 1);
        localDate1.getMonth();
//Period
        Period period = Period.between(localDate, localDate1);
        System.out.println(period);
//        System.out.println(period.getUnits());
        System.out.println(period.getYears());

//        LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        localTime.getHour();

//        LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2020,1,1,1,1,1,0);
        System.out.println(localDateTime);

//Duration
        Duration duration = Duration.between(localDateTime, localDateTime1);
        System.out.println(duration);
        System.out.println(duration.toDays());

//        ChronoUnit
        System.out.println(ChronoUnit.DAYS.between(localDateTime,localDateTime1));
        System.out.println(ChronoUnit.DAYS.between(localDateTime1,localDateTime));


    }
}
