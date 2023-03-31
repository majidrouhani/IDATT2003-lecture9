package edu.ntnu.idatt2001.lectures.dp.singeleton.enums.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * An example of using enum as singleton class
 * 'instance' is the constant in the enum.
 */
class SerializeApp {

  public static void main(String[] args) {
    EnumSingleton serInstance = EnumSingleton.INSTANCE;
    serInstance.setValue(5);

    // Print the value before serializing
    System.out.println("Initial value: " + serInstance.getValue());

    // Serialization
    String filename = "file.ser";
    try (FileOutputStream file = new FileOutputStream(filename)) {
      ObjectOutputStream out = new ObjectOutputStream(file);
      out.writeObject(serInstance);
      out.close();
      System.out.println("Object has been serialized");
    } catch (IOException ex) {
      System.out.println("IOException is caught");
    }

    // Change the value of instance
    serInstance.setValue(20);
    System.out.println("Value changed: " + serInstance.getValue());

    // Deserialization
    EnumSingleton desInstance = null;
    try (FileInputStream file = new FileInputStream(filename)) {
      ObjectInputStream in = new ObjectInputStream(file);
      desInstance = (EnumSingleton) in.readObject();
      in.close();
      System.out.println("Object has been deserialized ");


      System.out.println("Deserialized value: " + desInstance.getValue());
    } catch (IOException ex) {
      System.out.println("IOException is caught");
    } catch (ClassNotFoundException ex) {
      System.out.println("ClassNotFoundException is caught");
    }
  }
}