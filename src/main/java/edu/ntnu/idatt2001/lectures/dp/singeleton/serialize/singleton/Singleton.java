package edu.ntnu.idatt2001.lectures.dp.singeleton.serialize.singleton;

public class Singleton implements java.io.Serializable {

  private static Singleton INSTANCE = null;
  
  private int value = 0;
      
  private Singleton() {
  }

  public static Singleton getInstance() {
    if (INSTANCE == null) {
      synchronized (Singleton.class) {
        if (INSTANCE == null) {
          INSTANCE = new Singleton();
        }
      }
    }
    return INSTANCE;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }  
}