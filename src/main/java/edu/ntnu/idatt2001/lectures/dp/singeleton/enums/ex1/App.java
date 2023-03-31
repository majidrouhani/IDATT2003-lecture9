// Source: https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
package edu.ntnu.idatt2001.lectures.dp.singeleton.enums.ex1;

import javafx.print.PrintColor;

/**
 * Simple example on how to use enums
 */
public class App {
    Day day;
    
    public App(Day day) {
        this.day = day;
    }
    
    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    
    public static void main(String[] args) {

        //Print all values in Day
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        App mon = new App(Day.MONDAY);
        mon.tellItLikeItIs();
        App wed = new App(Day.WEDNESDAY);
        wed.tellItLikeItIs();
        App fri = new App(Day.FRIDAY);
        fri.tellItLikeItIs();
        App sat = new App(Day.SATURDAY);
        sat.tellItLikeItIs();
    }
}
