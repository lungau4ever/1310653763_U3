/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg_aufgabe4;

/**
 *
 * @author Manuel Dorfer
 */
public class Aufruf {
    
    public static void main (String[]args){
        Liste eins = new Liste(3);
        eins.save(2.0);
        eins.save(5.0);
        eins.save(200.0);
        
        System.out.println(eins.toString());
       
    }

   
     
}
