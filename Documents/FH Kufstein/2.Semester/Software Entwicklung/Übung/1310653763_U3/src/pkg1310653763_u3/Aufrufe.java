
import pkg1310653763_u3.Benennbar;
import pkg1310653763_u3.Car;

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Benennbar namedCar=new Car(); 
        //Inteface Polymorphismus
        namedCar.setName("Seppi");
        System.out.println("Das Auto heißt " + namedCar.getName());
    }
    
}
