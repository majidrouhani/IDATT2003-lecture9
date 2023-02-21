package edu.ntnu.idatt2001.lectures.dp.singeleton.enumsingleton;

public enum EnumSingleton {
  INSTANCE;
  
  int value;

  int getValue() {
      return value;
  }

  void setValue(int value) {
      this.value = value;
  }
}