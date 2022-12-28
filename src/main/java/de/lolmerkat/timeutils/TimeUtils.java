package de.lolmerkat.timeutils;

import java.time.LocalDateTime;

public class TimeUtils {

    private static String currentTimeStr;
    private static TimeObject currentTime;

    public static String getCurrentTime() {
        format(new TimeObject());
        return currentTimeStr;
    }

    private static void format(TimeObject timeObject) {
        String dayStr, monthStr, yearStr, hourStr, minuteStr, secondStr;

        dayStr = String.valueOf(timeObject.day);
        monthStr = String.valueOf(timeObject.month);
        yearStr = String.valueOf(timeObject.year);
        hourStr = String.valueOf(timeObject.hour);
        minuteStr = String.valueOf(timeObject.minute);
        secondStr = String.valueOf(timeObject.second);

        if (timeObject.day < 10)
            dayStr = "0" + dayStr;
        if (timeObject.month < 10)
            monthStr = "0" + monthStr;
        if (timeObject.hour < 10)
            hourStr = "0" + hourStr;
        if (timeObject.minute < 10)
            minuteStr = "0" + minuteStr;
        if (timeObject.second < 10)
            secondStr = "0" + secondStr;
        currentTimeStr = hourStr + ":" + minuteStr + ":" + secondStr + " - " + dayStr + "/" + monthStr + "/" + yearStr;
    }

    public static class TimeObject {
        private final int day, month, year;
        private final int hour, minute, second;

        public TimeObject() {
            this.day = LocalDateTime.now().getDayOfMonth();
            this.month = LocalDateTime.now().getMonth().getValue();
            this.year = LocalDateTime.now().getYear();
            this.hour = LocalDateTime.now().getHour();
            this.minute = LocalDateTime.now().getMinute();
            this.second = LocalDateTime.now().getSecond();
        }

        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }

        public int getHour() {
            return hour;
        }

        public int getMinute() {
            return minute;
        }

        public int getSecond() {
            return second;
        }

        public String getFormattedDay() {
            if (day < 10)
                return "0" + day;
            else
                return String.valueOf(day);
        }

        public String getFormattedMonth() {
            if (month < 10)
                return "0" + month;
            else
                return String.valueOf(month);
        }

        public String getFormattedHour() {
            if (hour < 10)
                return "0" + hour;
            else
                return String.valueOf(hour);
        }

        public String getFormattedMinute() {
            if (minute < 10)
                return "0" + minute;
            else
                return String.valueOf(minute);
        }

        public String getFormattedSecond() {
            if (second < 10)
                return "0" + second;
            else
                return String.valueOf(second);
        }
    }

}
