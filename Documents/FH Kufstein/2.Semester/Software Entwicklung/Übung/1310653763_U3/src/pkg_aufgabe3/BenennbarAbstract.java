/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg_aufgabe3;

/**
 *
 * @author Manuel Dorfer
 */
public abstract class  BenennbarAbstract {

    String name;
    public BenennbarAbstract() {
        
    }
    
    public String getName(){
        return name;
    }
    public void setName(String _n){
        name=_n;
    }
}