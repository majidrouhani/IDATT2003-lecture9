package edu.ntnu.idatt2001.lectures.dp.singeleton.enums.ex2;

/**
 * An example of using a more complex enum (Planet).
 */
public class App {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        double earthWeight = 70;
        double mass = earthWeight / Planet.EARTH.surfaceGravity();

        for (Planet planet : Planet.values())
            System.out.printf("Your weight on %s is %f%n",
                    planet, planet.surfaceWeight(mass));
    }

}
