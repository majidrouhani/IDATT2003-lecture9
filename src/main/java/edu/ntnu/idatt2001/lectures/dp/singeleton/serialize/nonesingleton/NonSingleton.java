package edu.ntnu.idatt2001.lectures.dp.singeleton.serialize.nonesingleton;

class NonSingleton implements java.io.Serializable {
  
  private static final long serialVersionUID = 1L;
  private int value = 0;

  // Default constructor
  public NonSingleton(int value) {
    this.value = value;
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