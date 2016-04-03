package com.rdas.dateutils;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateFormatter {
    public String getFormattedCurrentDate() {
        DateTime dateTime = new DateTime();
        DateTimeFormatter fmt = DateTimeFormat.forPattern("MM/dd/YYYY");
        return fmt.print(dateTime);
    }
}
