/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author user
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileUtility {

    public static boolean writeObjectToFile(Serializable object, String name) throws RuntimeException {

        try ( FileOutputStream fout = new FileOutputStream(name);  ObjectOutputStream oos = new ObjectOutputStream(fout);) {

            oos.writeObject(object);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    
    
    public static Object readFileDeserialize(String name) {
        Object obj = null;

        try ( FileInputStream fi = new FileInputStream(name);  ObjectInputStream in = new ObjectInputStream(fi)) {
            obj = in.readObject();
        } finally {
            return obj;
        }
    }

}
