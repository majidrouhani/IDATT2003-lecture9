package edu.ntnu.idatt2001.lectures.dp.singeleton.enumsingleton;

public enum EnumSingleton {
  INSTANCE;
  
  int value;

  public int getValue() {
      return value;
  }

  public void setValue(int value) {
      this.value = value;
  }
}