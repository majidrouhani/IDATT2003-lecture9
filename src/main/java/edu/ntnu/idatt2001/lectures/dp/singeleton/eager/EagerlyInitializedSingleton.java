package edu.ntnu.idatt2001.lectures.dp.singeleton.eager;

class EagerlyInitializedSingleton {
  private static final String MESSAGE = "Doing something...";

  // Early, instance will be created at load time
  private static EagerlyInitializedSingleton instance = new EagerlyInitializedSingleton();

  private EagerlyInitializedSingleton() {
  }

  
  /** 
   * @return EagerlyInitializedSingleton
   */
  public static EagerlyInitializedSingleton getInstance() {
    return instance;
  }

  
  /** 
   * @return String
   */
  public String doSomething() {
    return MESSAGE;
  }
}