/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import main.Menu;
import main.MenuUtil;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Registration_for_contestantsService implements MenuService {
   
    String[] arr = new String[5];
    @Override
    public  void process() {
        

        for (int i = 0; i < 5; i++) {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter " + (i + 1) + "th person's info");
            String name = sc.nextLine();

            arr[i] = name;

        }
        System.out.println("");
        System.out.println("***Registration successful***");
        System.out.println("");
        System.out.println("All contestants:");

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " " + arr[i]);
        }

        System.out.println();
        System.out.println("Select next section:");
        Menu m = MenuUtil.showMenu();
        m.process();

        

        
    }

    public String[] getArray(){

     return arr;
}
    
    
}
