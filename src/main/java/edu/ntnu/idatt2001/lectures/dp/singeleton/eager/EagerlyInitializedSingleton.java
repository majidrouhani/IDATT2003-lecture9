package edu.ntnu.idatt2001.lectures.dp.singeleton.eager;

class EagerlyInitializedSingleton {
  private static final String MESSAGE = "Doing something...";

  // Early, instance will be created at load time
  private static EagerlyInitializedSingleton obj = new EagerlyInitializedSingleton();

  private EagerlyInitializedSingleton() {
  }

  public static EagerlyInitializedSingleton getA() {
    return obj;
  }

  public String doSomething() {
    return MESSAGE;
  }
}