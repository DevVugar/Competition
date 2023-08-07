/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import main.main;

/**
 *
 * @author user
 */
public class LogoutService implements MenuService {

    @Override
    public void process() {
        System.out.println();
        System.out.println("**Successful Logout**");
        System.out.println();
        main.Login();
           }
    
}
