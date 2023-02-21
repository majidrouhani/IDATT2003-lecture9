package edu.ntnu.idatt2001.lectures.dp.singeleton.eager.staticblock;

public class EagerStaticBlockSingleton {
    private static final String MESSAGE = "Doing something...";

    private static EagerStaticBlockSingleton instance;

    private EagerStaticBlockSingleton() {
    }

    // static block initialization for exception handling
    static {
        try {
            instance = new EagerStaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static EagerStaticBlockSingleton getInstance() {
        return instance;
    }

    public String doSomething() {
        return MESSAGE;
    }
}
