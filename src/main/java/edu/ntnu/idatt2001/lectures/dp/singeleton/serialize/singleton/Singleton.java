package edu.ntnu.idatt2001.lectures.dp.singeleton.serialize.singleton;

public class Singleton implements java.io.Serializable {

  private static Singleton instance = null;

  private int value = 0;

  private Singleton() {
  }

  
  /** 
   * @return Singleton
   */
  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

  
  /** 
   * @param value
   */
  public void setValue(int value) {
    this.value = value;
  }

  
  /** 
   * @return int
   */
  public int getValue() {
    return this.value;
  }
}