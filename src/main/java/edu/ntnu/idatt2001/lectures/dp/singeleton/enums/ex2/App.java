package edu.ntnu.idatt2001.lectures.dp.singeleton.enums.ex2;

public class App {
    public static void main(String[] args) {
        double earthWeight = 70;
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("Your weight on %s is %f%n",
                    p, p.surfaceWeight(mass));
    }

}
