package edu.ntnu.idatt2001.lectures.dp.singeleton.lazy.threadsafe;

public class App extends Thread {

  public void run() {
    System.out.println("Thread is running...");

    LazyInitializedSingleton l1 = LazyInitializedSingleton.getInstance();
    System.out.println(l1.doSomething());

  }

  public static void main(String[] args) {
    App t1=new App();  
      t1.start();  
  }}
