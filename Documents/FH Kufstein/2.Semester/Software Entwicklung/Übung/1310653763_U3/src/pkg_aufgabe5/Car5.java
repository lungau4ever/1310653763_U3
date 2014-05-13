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
public class Car5 extends Vehicle5{
    private boolean aircondition=false;
    private short airbag;
    
    
    
    public Car5(short w,color f, short ps, short d, short s, boolean st, boolean ac, short ab) {
        super(w,f, ps, d, (short)0, st);
        aircondition =ac;
        airbag=ab;
    }

    public Car5() {
        super();
    }
    
      public void startAircondition() {
          if(aircondition==false){
                this.aircondition = true;
            }
          else{
              System.out.println("Klima läuft bereits");
          }
      }
     public void stopAircondition() {
          if(aircondition){
                this.aircondition = false;
            }
          else{
              System.out.println("Klima bereits aus");
          }
      }

    public boolean isAircondition() {
        return aircondition;
    }

    public short getAirbag() {
        return airbag;
    }

    public void setAircondition(boolean ac) {
        this.aircondition = ac;
    }

    public void setAirbag(short ab) {
        this.airbag = ab;
    }
   @Override
    public String toString(){
        return "Mein Auto hat "+getPs()+" PS und fährt mit "+getSpeed()+" km/h";
    }  
     
}
