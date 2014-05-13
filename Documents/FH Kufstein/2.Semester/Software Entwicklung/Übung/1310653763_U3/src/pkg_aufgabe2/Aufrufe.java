package pkg_aufgabe2;


import pkg_aufgabe2.Benennbar;
import pkg_aufgabe2.Car;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuel Dorfer
 */
public class Aufrufe {

    public static void main(String[] args) {
    
        Benennbar namedCar=new Car(); 
        namedCar.setName("Seppi");
        System.out.println("Das erste Auto heißt " + namedCar.getName());
        
         Benennbar namedCar2=new Car(); 
        namedCar2.setName("Weißer Blitz");
        System.out.println("Das zweite Auto heißt " + namedCar2.getName());
    }
    
}
