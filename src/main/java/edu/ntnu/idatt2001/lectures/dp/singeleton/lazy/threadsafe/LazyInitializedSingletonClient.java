package edu.ntnu.idatt2001.lectures.dp.singeleton.lazy.threadsafe;

public class LazyInitializedSingletonClient {

  public static void main(String[] args) {
    LazyInitializedSingleton l = LazyInitializedSingleton.getInstance();

    System.out.println(l.doSomething());
  }
}
