/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg_aufgabe5;

/**
 *
 * @author Manuel Dorfer
 */
public class Aufruf5 {
    
    public static void main (String[]args){
        Liste5 <BenennbarAbstract> eins = new Liste5(3);
        
        BenennbarAbstract zwei = new Car5();
        BenennbarAbstract drei = new Boat5();
        BenennbarAbstract vier = new Vehicle5();
     
        eins.save(zwei);
        eins.save(drei);
        eins.save(vier);
        
        System.out.println(eins.toString());
       
    }

   
     
}
