package edu.ntnu.idatt2001.lectures.dp.singeleton.lazy.threadsafe;

public class LazyInitializedSingleton {

  private static LazyInitializedSingleton instance;

  private LazyInitializedSingleton() {
  }

  public static synchronized LazyInitializedSingleton getInstance() {
    if (instance == null) {
      instance = new LazyInitializedSingleton();
    }
    return instance;
  }

  public String doSomething() {
    return "Doing something...";
  }
}