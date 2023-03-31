package edu.ntnu.idatt2001.lectures.dp.singeleton.enums.singleton;

/**
 * An example of using enum as singleton class
 * 'instance' is the constant in the enum.
 */
public class EnumSingletonApp {

  public static void main(String[] args) {
    EnumSingleton instance = EnumSingleton.INSTANCE;

    System.out.println(instance.getValue());
    instance.setValue(2);
    System.out.println(instance.getValue());
  }
}