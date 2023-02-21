package edu.ntnu.idatt2001.lectures.dp.singeleton.enumsingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class SerializeApp {

  public static void main(String[] args) {
    EnumSingleton object = EnumSingleton.INSTANCE;
    object.setValue(10);
    System.out.println(object.getValue());
    
    String filename = "file.ser";

    // Serialization
    try (FileOutputStream file = new FileOutputStream(filename)) {
      // Saving of object in a file
      ObjectOutputStream out = new ObjectOutputStream(file);

      // Method for serialization of object
      out.writeObject(object);

      out.close();

      System.out.println("Object has been serialized");

    } catch (IOException ex) {
      System.out.println("IOException is caught");
    }

    object.setValue(20);
    System.out.println(object.getValue());
    
    EnumSingleton object1 = null;

    // Deserialization
    try (FileInputStream file = new FileInputStream(filename)) {
      // Reading the object from a file
      ObjectInputStream in = new ObjectInputStream(file);

      // Method for deserialization of object
      object1 = (EnumSingleton) in.readObject();

      in.close();

      System.out.println("Object has been deserialized ");
      System.out.println("Value = " + object1.getValue());
    } catch (IOException ex) {
      System.out.println("IOException is caught");
    } catch (ClassNotFoundException ex) {
      System.out.println("ClassNotFoundException is caught");
    }
  }
}