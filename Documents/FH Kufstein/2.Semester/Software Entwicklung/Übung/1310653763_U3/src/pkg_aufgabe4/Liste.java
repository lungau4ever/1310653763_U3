/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg_aufgabe4;

import java.lang.reflect.Array;

/**
 *
 * @author Manuel Dorfer
 */
public class Liste<Test> {

    Test[] array;

    public Liste(int groesse) {
        array = (Test[]) (new Object[groesse]);
    }

    @Override
    public String toString() {
        String listenInhalt = "";
        for (Test a : array)
        {
            listenInhalt += a+ "\n";
        }
        return listenInhalt; 
       }
    

    public void save(Test wert) {
        for (int i = 0; i < array.length;i++) {

            if (array[i] == null) {
                array[i] = wert;
                System.out.println("saved an der Stelle: "+i);
                break;
            } 
        }

    }
}

