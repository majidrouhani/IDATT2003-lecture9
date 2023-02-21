package edu.ntnu.idatt2001.lectures.dp.singeleton.serialize.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class App {

  public static void main(String[] args) {
    Singleton serObject = Singleton.getInstance();
    serObject.setValue(10);
    
    String filename = "file.ser";

    // Serialization
    try (FileOutputStream fos = new FileOutputStream(filename)) {
      // Saving of object in a file
      ObjectOutputStream out = new ObjectOutputStream(fos);

      // Method for serialization of object
      out.writeObject(serObject);
      out.close();
      System.out.println("Object has been serialized");

    } catch (IOException ex) {
      System.out.println("IOException is caught");
    }

    Singleton desObject = null;

    // Deserialization
    try (FileInputStream file = new FileInputStream(filename)) {
      // Reading the object from a file
      ObjectInputStream in = new ObjectInputStream(file);

      // Method for deserialization of object
      desObject = (Singleton) in.readObject();

      in.close();

      System.out.println("Object has been deserialized ");
      System.out.println("Value = " + desObject.getValue());

      serObject.setValue(20);
      desObject.setValue(30);

      //We have ended up with two object
      System.out.println("Serialized object = " + serObject.getValue());
      System.out.println("Deserialized object = " + desObject.getValue());

    }

    catch (IOException ex) {
      System.out.println("IOException is caught");
    } catch (ClassNotFoundException ex) {
      System.out.println("ClassNotFoundException is caught");
    }
  }
}