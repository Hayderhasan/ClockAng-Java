package com.company;
import static com.company.CalcAngle.calcAngle;

public class Main {

    public static void main(String[] args) {
        if (args.length == 2) try {
            calcAngle(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Please only enter two numerical values, first is the hour and second is the minutes");
        }
        else System.out.println("Please only enter two numerical values, first is the hour and second is the minutes");

    }
}



