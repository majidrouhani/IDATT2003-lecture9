package edu.ntnu.idatt2001.lectures.dp.singeleton.eager.staticblock;

public class App {

  public static void main(String... args) {
    EagerStaticBlockSingleton a = EagerStaticBlockSingleton.getInstance();
    System.out.println(a.doSomething());

    EagerStaticBlockSingleton b = EagerStaticBlockSingleton.getInstance();
    System.out.println(b.doSomething());

    if (a == b) {
      System.out.println("Doing the same thing");
    }    
  }
}
