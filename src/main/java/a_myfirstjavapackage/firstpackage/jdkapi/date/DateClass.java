package a_myfirstjavapackage.firstpackage.jdkapi.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {
/*Date
  SimpleDateFormat
  Calendar*/
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(0);
        System.out.println(date1);

        Date date2 = new Date(1000L*60*60*24*365*38);
        System.out.println(date2);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分");
        System.out.println(sdf1.format(date2));

//2008-1970=38
       String s= "2008年08月08日 08点08分";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月0dd日 HH点mm分");
        Date date3 = sdf2.parse(s);
        System.out.println(date3);

//        yyyy-MM-dd HH:mm:ss
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分");
        System.out.println(sdf.format(date));

//        Calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        c.set(Calendar.YEAR,2008);
        c.set(Calendar.MONTH,07);
//        c.add(Calendar.MONTH,1);
        c.set(Calendar.DATE,8);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + "\t" + month + "\t" + day+ "\t" + week);

    }
}
