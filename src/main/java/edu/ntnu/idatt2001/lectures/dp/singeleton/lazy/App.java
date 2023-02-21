package edu.ntnu.idatt2001.lectures.dp.singeleton.lazy;

public class App {

  public static void main(String[] args) {
        
    LazyInitializedSingleton l1 = LazyInitializedSingleton.getInstance();

    LazyInitializedSingleton l2 = LazyInitializedSingleton.getInstance();
    
    System.out.println(l1.doSomething());
    System.out.println(l2.doSomething());
    
    if (l1 == l2) {
      System.out.println("Same instance");
    }
  }
}
