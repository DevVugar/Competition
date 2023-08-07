/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package main;

import service.ExitService;
import service.LogoutService;
import service.MenuService;
import service.Registration_for_contestantsService;
import service.Start_CompetitionService;

/**
 *
 * @author user
 */
public enum Menu {
    Registration_for_contestants(1, " Registration for contestants", new Registration_for_contestantsService()),
    Start_Competition(2, " Start Competition", new Start_CompetitionService()),
    Logout(3, " Logout", new LogoutService()),
    Exit(4, " Exit", new ExitService());
    

    private int number;
    private String label;
    private MenuService service;

    Menu() {
    }

    Menu(int number, String label, MenuService service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    public String getLabel() {
        return label;

    }

    @Override
    public String toString() {
        return number + label;
    }

    public void process() {
        service.process();
    }

    public int getNumber() {
        return this.number;
    }
}
