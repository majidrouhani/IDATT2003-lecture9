package edu.ntnu.idatt2001.lectures.dp.singeleton.eager;

class EagerlyInitializedSingleton {
  // Early, instance will be created at load time
  private static EagerlyInitializedSingleton obj = new EagerlyInitializedSingleton();

  static final String MESSAGE = "Doing something...";
  
  private EagerlyInitializedSingleton() {
  }

  public static EagerlyInitializedSingleton getA() {
    return obj;
  }

  public String doSomething() {
    return MESSAGE;
  }
}