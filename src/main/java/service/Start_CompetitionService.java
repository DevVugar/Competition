/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Start_CompetitionService implements MenuService {

    
    @Override
    public void process() {

        Random r = new Random();
        int a = r.nextInt(5);
        
       Scanner sc = new Scanner(System.in);
        System.out.println("**Choose correct person**"); 
        int choosenNumber=sc.nextInt();

if(a==choosenNumber){

    System.out.println("Congratulations!You find correct person");
}
else{
    System.out.println("You failed");

}  
    }

}
