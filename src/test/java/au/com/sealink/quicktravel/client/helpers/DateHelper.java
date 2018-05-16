package au.com.sealink.quicktravel.client.helpers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateHelper {
    public static Date parseIso(String isoDate) {
        DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        try {
            return df1.parse(isoDate);
        } catch (ParseException e) {
            System.out.println(e.getLocalizedMessage());
        }
        return null;
    }

    public static Date getDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(0);
        cal.set(year, month, day, 0, 0, 0);
        return cal.getTime();
    }
}
