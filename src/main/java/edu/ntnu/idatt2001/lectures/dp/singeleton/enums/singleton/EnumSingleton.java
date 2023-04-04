package edu.ntnu.idatt2001.lectures.dp.singeleton.enums.singleton;

/**
 * An enum with one value 'INSTANCE'
 */
public enum EnumSingleton {
  INSTANCE(10);

  private EnumSingleton(int value) {
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