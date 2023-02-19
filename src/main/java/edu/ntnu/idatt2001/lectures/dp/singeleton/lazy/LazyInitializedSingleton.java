package edu.ntnu.idatt2001.lectures.dp.singeleton.lazy;

public class LazyInitializedSingleton {

  private static LazyInitializedSingleton instance;

  private LazyInitializedSingleton() {
  }

  public static LazyInitializedSingleton getInstance() {
    if (instance == null) {
      instance = new LazyInitializedSingleton();
    }
    return instance;
  }

  public String doSomething() {
    return "Doing something...";
  }
}