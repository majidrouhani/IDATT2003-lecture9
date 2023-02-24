package edu.ntnu.idatt2001.lectures.dp.singeleton.enums.singleton;

public enum EnumSingleton {
  INSTANCE(10);

  EnumSingleton(int value) {
    this.setValue(value);
  }

  int value;

  int getValue() {
    return value;
  }

  void setValue(int value) {
    this.value = value;
  }
}