package edu.ntnu.idatt2001.lectures.dp.singeleton.lazy.threadsafe;

/**
 * App starting two threads using the same singleton class
 */
public class App extends Thread {

  @Override
  public void run() {
    System.out.println("Thread is running...");

    LazyInitializedSingleton lazySingleton = LazyInitializedSingleton.getInstance();
    System.out.println(lazySingleton);
    System.out.println(lazySingleton.doSomething());

  }

  public static void main(String[] args) {
    App t1 = new App();
    App t2 = new App();
    t1.start();
    t2.start();
  }
}
