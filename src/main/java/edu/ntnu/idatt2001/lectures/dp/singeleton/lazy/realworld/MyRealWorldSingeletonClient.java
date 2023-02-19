package edu.ntnu.idatt2001.lectures.dp.singeleton.lazy.realworld;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class MyRealWorldSingeletonClient {

  public static void main(String[] args) {
    Runtime r = Runtime.getRuntime();
    System.out.println("Free memoery: " + r.freeMemory());
    System.out.println("Total memory: " + r.totalMemory());

    Desktop d = Desktop.getDesktop();

    try {
      d.edit(new File("c:/temp/books.txt"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
