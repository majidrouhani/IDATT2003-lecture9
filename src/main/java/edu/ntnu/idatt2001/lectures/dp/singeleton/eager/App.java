package edu.ntnu.idatt2001.lectures.dp.singeleton.eager;

public class App {

  public static void main(String... args) {
    EagerlyInitializedSingleton a = EagerlyInitializedSingleton.getInstance();
    System.out.println(a.doSomething());

    EagerlyInitializedSingleton b = EagerlyInitializedSingleton.getInstance();
    System.out.println(b.doSomething());

    if (a == b) {
      System.out.println("Doing the same thing");
    }    
  }
}
