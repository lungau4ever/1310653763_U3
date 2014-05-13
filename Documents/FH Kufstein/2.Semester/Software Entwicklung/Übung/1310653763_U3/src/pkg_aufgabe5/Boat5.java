/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg_aufgabe5;

/**
 *
 * @author Manuel DOrfer
 */
public class Boat5 extends Vehicle5{
    
    private double draft,cargo;
    private short propeller;

    public Boat5(short w,color f, short ps, short d, short s, boolean st, double dr, double c, short p) {
        super(w,f, ps, d, s, st);
        this.draft = dr;
        this.cargo = c;
        this.propeller = p;
    }

    Boat5() {
        
    }

  public void unload() throws InterruptedException{
      cargo=0;
      Thread.sleep(5000);
  }

    public double getDraft() {
        return draft;
    }

    public double getCargo() {
        return cargo;
    }

    public short getPropeller() {
        return propeller;
    }

    public void setDraft(double dr) {
        this.draft = dr;
    }

    public void setCargo(double c) {
        this.cargo = c;
    }

    public void setPropeller(short p) {
        this.propeller = p;
    }
    
    @Override
    public String toString(){
       return "Mein Wasserfahrzeug hat "+this.getPs()+" und einen Tiefgang von "+this.getDraft()+" m";
    }
    
}
