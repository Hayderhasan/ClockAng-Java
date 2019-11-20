package com.company;
import static com.company.InputValidation.validateHour;
import static com.company.InputValidation.validateMinute;

public class CalcAngle {

    public static int calcAngle(int hourHand, int minuteHand) {
        System.out.println("Welcome, this program will give you the shortest angle between the clock hands at the time you supplied \n");

          hourHand=validateHour(hourHand);
          minuteHand=validateMinute(minuteHand);

        final int minutesInHour = 60;
        final int degreesInCircle = 360;
        // hour hand completes a circle in 12 hours
        final double degreePerMinute_HourHand = 0.5; // 12 hr = 360 deg => 1 hr = 30 deg => 60 min = 30 deg => 1 min = 0.5 deg
        // minute hand completes a circle in 60 minutes
        final int degreePerMinute_MinuteHand = 6; // 60 min = 360 deg => 1 min => 6 deg

        double angleHourHand = ((hourHand * minutesInHour) + minuteHand) * degreePerMinute_HourHand;
        int angleMinuteHand = minuteHand * degreePerMinute_MinuteHand;


        double angleOne = Math.abs(angleHourHand - angleMinuteHand );
        double angleTwo = degreesInCircle - angleOne;
        int result = (int) Math.round(Math.min(angleOne, angleTwo));
        System.out.format("The time you have entered is: %d:%d in 12 hour format\n", hourHand,minuteHand);
        System.out.format("The calculated shortest angle between the clock hands is: %d \n", result);
        return result;
    }
}
