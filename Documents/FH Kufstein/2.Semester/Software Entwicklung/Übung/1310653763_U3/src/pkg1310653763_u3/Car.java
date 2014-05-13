/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg1310653763_u3;

/**
 *
 * @author xxx
 */
public class Car extends Vehicle{
    private boolean aircondition=false;
    private short airbag;
    
    
    
    public Car(short w,color f, short ps, short d, short s, boolean st, boolean ac, short ab) {
        super(w,f, ps, d, (short)0, st);
        aircondition =ac;
        airbag=ab;
    }

    public Car() {
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
