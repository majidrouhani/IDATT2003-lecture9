package edu.ntnu.idatt2001.lectures.dp.singeleton.enums.singleton;

public class EnumSingletonApp {

  public static void main(String[] args) {
    EnumSingleton singleton = EnumSingleton.INSTANCE;

    System.out.println(singleton.getValue());
    singleton.setValue(2);
    System.out.println(singleton.getValue());
  }
}