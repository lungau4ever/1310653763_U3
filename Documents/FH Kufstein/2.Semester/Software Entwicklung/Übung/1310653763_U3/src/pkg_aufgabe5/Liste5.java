/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg_aufgabe5;

/**
 *
 * @author Manuel Dorfer
 * @param <Test>
 */
public class Liste5<Test extends BenennbarAbstract> {

    BenennbarAbstract[] array;

    public Liste5(int groesse) {
        array = new BenennbarAbstract[groesse];
    }

    @Override
    public String toString() {
        String listenInhalt = "";
        for (BenennbarAbstract a : array)
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

