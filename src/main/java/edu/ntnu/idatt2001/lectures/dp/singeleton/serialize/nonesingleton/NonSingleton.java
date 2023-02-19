package edu.ntnu.idatt2001.lectures.dp.singeleton.serialize.nonesingleton;

class NonSingleton implements java.io.Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  public int a;
  public String b;

  // Default constructor
  public NonSingleton(int a, String b) {
    this.a = a;
    this.b = b;
  }
}