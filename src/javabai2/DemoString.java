package javabai2;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

public class DemoString {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy" );

        simpleDateFormat.setLenient(false);
        Date parse = simpleDateFormat.parse("11/08/2003");
        System.out.println(parse);

        Date date = new Date();
        System.out.println(date);

        int age = date.getYear() - parse.getYear();
        System.out.println(age);


    }
}
