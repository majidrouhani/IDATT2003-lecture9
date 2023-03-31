package edu.ntnu.idatt2001.lectures.dp.singeleton.serialize.nonesingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * The example illustrates the concept of object serialization.
 * In this code, some instances of NonSingleton class are created and saved in a file using serialization.
 * The objects are then read back from the file and their values are written to the screen.
 */
class App {

  public static void main(String[] args) {
    String filename = "file.ser";

    // Serialization
    try (FileOutputStream fos = new FileOutputStream(filename)) {
      // Saving of object in a file
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      // Method for serialization of object
      oos.writeObject(new NonSingleton(10));
      oos.writeObject(new NonSingleton(20));
      oos.writeObject(new NonSingleton(30));

      oos.close();

      System.out.println("Objects has been serialized");

    } catch (IOException ex) {
      System.out.println("IOException is caught");
    }

    // Deserialization
    try (FileInputStream fis = new FileInputStream(filename)) {
      // Reading the object from a file
      ObjectInputStream ois = new ObjectInputStream(fis);

      boolean cont = true;
      while (cont) {
        Object obj = null;
        obj = ois.readObject();

        if (obj != null) {
          System.out.println("Object has been deserialized. Value = " + ((NonSingleton) obj).getValue());
        } else {
          cont = false;
        }
      }

      ois.close();
    } catch (IOException | ClassNotFoundException ex) {
      ex.fillInStackTrace();
    }
  }
}