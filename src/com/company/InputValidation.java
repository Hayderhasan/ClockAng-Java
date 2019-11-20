package com.company;
import java.util.Scanner;

public class InputValidation {

    public static int validateHour(int hour) {
        // conversion for users who input values in the 24 hour format
        if (hour > 12 && hour <= 23) hour = hour - 12;
        if (hour == 0) hour = 12;

        if (hour > 0 && hour < 24) return hour;
        Scanner userInput = new Scanner(System.in);
        boolean isValidNumber = false;
            while (!isValidNumber) {
                while (hour < 0 || hour > 23) {
                    System.out.println("Try again, please enter a valid positive number for the hour: ");
                    String line = userInput.nextLine();
                    try {
                        hour = Integer.valueOf(line);

                        isValidNumber = true;
                    } catch (NumberFormatException e) {
                        System.out.println("That wasn't a number!\n");
                    }
                }
            }
        
        // if the user changed the input
        if (hour > 12 && hour <= 23) hour = hour - 12;
        if (hour == 0) hour = 12;



        return hour;
    }


    public static int validateMinute(int minute) {
        if (minute > 0 && minute < 60) {
            return minute;
        }
        Scanner userInput = new Scanner(System.in);
        boolean isValidNumber = false;
        while (!isValidNumber) {
            while (minute < 0 || minute > 59) {
                System.out.println("Try again, please enter a valid positive number for the minutes: ");
                String line = userInput.nextLine();
                try {
                    minute = Integer.valueOf(line);
                    isValidNumber = true;
                } catch (NumberFormatException e) {
                    System.out.println("That wasn't a number!\n");
                }
            }
        }
        return minute;
    }
}
