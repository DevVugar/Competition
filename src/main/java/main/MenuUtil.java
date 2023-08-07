/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main;


import java.util.Scanner;

/**
 *
 * @author user
 */
public class MenuUtil {

    public static Menu showMenu()  {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            System.out.println(menus[i]);

        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Please select menu");
        int selectedMenu = sc.nextInt();

        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber()==selectedMenu) {
           return    menus[i];
            }

        }
return null;
    }

    public static void processMenu(Menu menu) {
        menu.process();
    }
}
