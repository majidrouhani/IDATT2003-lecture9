package edu.ntnu.idatt2001.lectures.dp.singeleton.lazy;

public class LazyInitializedSingleton {
  private static final String MESSAGE = "Doing something...";

  // Lazy, instance will be created when needed (getInstance is invoked)
  private static LazyInitializedSingleton instance;

  private LazyInitializedSingleton() {
  }

  
  /** 
   * @return LazyInitializedSingleton
   */
  public static LazyInitializedSingleton getInstance() {
    if (instance == null) {
      instance = new LazyInitializedSingleton();
    }
    return instance;
  }

  
  /** 
   * @return String
   */
  public String doSomething() {
    return MESSAGE;
  }
}