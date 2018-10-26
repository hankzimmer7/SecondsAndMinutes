package com.hankzimmer;

public class Main {

    //String for storing the Invalid Value message
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        //Example inputs
        System.out.println(getDurationString(65, 46));
        System.out.println(getDurationString(20100L));
    }

    //Takes an input of minutes and seconds and returns a string of hours, minutes, and seconds
    private static String getDurationString(long minutes, long seconds) {
        //Minutes and seconds must be valid inputs
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        //Calculate hours and minutes
        long hours = minutes / 60;
        minutes = minutes % 60;

        //Create the string for hours
        String hoursString = hours + "h ";
        if(hours < 10) {
            hoursString = "0" + hoursString;
        }
        //Create the string for minutes
        String minutesString = minutes + "m ";
        if(minutes < 10) {
            minutesString = "0" + minutesString;
        }
        //Create the string for seconds
        String secondsString = seconds + "s";
        if(seconds < 10) {
            secondsString = "0" + secondsString;
        }
        return hoursString + minutesString + secondsString;
    }

    //Takes an input of seconds and returns a string of hours, minutes, and seconds
    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        //calculate the minutes and seconds
        long minutes = seconds / 60;
        seconds = seconds % 60;

        //call the other overloaded method
        return getDurationString(minutes, seconds);
    }
}
