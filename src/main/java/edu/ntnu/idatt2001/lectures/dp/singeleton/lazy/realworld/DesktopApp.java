package edu.ntnu.idatt2001.lectures.dp.singeleton.lazy.realworld;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class DesktopApp {

  public static void main(String[] args) {
    Desktop desktop = Desktop.getDesktop();

    try {

      File file = new File("desktop.txt");
      desktop.edit(file);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
