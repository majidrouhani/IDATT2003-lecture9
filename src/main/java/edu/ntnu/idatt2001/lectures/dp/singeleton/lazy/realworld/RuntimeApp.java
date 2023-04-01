package edu.ntnu.idatt2001.lectures.dp.singeleton.lazy.realworld;

public class RuntimeApp {

  
  /** 
   * @param args
   */
  public static void main(String[] args) {
    Runtime runTime = Runtime.getRuntime();
    System.out.println("Free memoery: " + runTime.freeMemory());
    System.out.println("Total memory: " + runTime.totalMemory());
  }
}
