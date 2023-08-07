/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class main {

    public static void main(String[] args) {
    
    Login();
    
    }
    
    public static void Login(){
        System.out.println("Please Login");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = sc.nextLine();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter password:");
        String password = sc1.nextLine();
       
        if (username.equals("Memati") && password.equals("12345")) {
            System.out.println();
            System.out.println("*Successful Login*");
            System.out.println();
            try {
                Menu m = MenuUtil.showMenu();
                m.process();
                
            } catch (Exception e) {
                System.out.println("An error occurred! Please enter the correct sections");
            }
        } else {

            System.out.println("wrong answer");
        }

    }
}
