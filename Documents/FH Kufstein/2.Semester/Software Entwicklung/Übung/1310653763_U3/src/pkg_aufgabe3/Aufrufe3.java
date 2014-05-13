package pkg_aufgabe3;


import pkg_aufgabe3.BenennbarAbstract;
import pkg_aufgabe3.Car3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuel Dorfer
 */
public class Aufrufe3 {

    public static void main(String[] args) {
    
        BenennbarAbstract namedCar=new Car3(); 
        namedCar.setName("Seppi");
        System.out.println("Das erste Auto heißt " + namedCar.getName());
        
         BenennbarAbstract namedCar2=new Car3(); 
        namedCar2.setName("Weißer Blitz");
        System.out.println("Das zweite Auto heißt " + namedCar2.getName());
    }
    
}
