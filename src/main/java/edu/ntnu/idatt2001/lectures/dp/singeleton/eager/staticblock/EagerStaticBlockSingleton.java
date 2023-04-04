package edu.ntnu.idatt2001.lectures.dp.singeleton.eager.staticblock;

public class EagerStaticBlockSingleton {
    private static final String MESSAGE = "Doing something...";

    private static EagerStaticBlockSingleton instance;

    // static block initialization for exception handling
    static {
        try {
            instance = new EagerStaticBlockSingleton();
        } catch (Exception e) {            
            throw new EagerStaticBlockSingletonException("Exception occurred in creating singleton instance:" +e.toString());
        }
    }
    
    private EagerStaticBlockSingleton() {
    }

    /** 
     * @return EagerStaticBlockSingleton
     */
    public static EagerStaticBlockSingleton getInstance() {
        return instance;
    }
    
    /** 
     * @return String
     */
    public String doSomething() {
        return MESSAGE;
    }
}
