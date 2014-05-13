/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg1310653763_u3;

/**
 *
 * @author xxx
**/
public class Vehicle implements Benennbar {
    
    private short wheels,ps,doors,speed;
    public enum color {black,silver,red,grey,yellow,blue};
    private boolean started=false;
    private String name;
    
    @Override
    public String getName() {
       return name;
    }

    @Override
    public void setName(String _n) {
       name = _n;
    }
    
      public Vehicle()
   {
       
   }

    public Vehicle(short w,color f, short ps, short d, short s, boolean st) {
        this.wheels = w;
        this.ps = ps;
        this.doors = d;
        this.speed = s;
        this.started = st;
        speed=0;
        f=color.black;
        
        
    }

    public void start() {
        this.started = true;
    }
    
      public void stop() {
        this.started = false;
    }
      public void accelerate(short s) {
          if(started&&((speed+s)<(short)250)){
            speed=(short)(s+speed);  
          }
          else if(started&&((speed+s)>(short)250)){
             speed=(short)250; 
          }
        }
    public void slow(short s) {
          if(started&&(speed-s>=(short)0)){
            speed=(short)(speed-(short)s);  
          }
          else if(started&&((speed+s)>(short)250)){
             speed=(short)250; 
          }
        }

    public short getWheels() {
        return wheels;
    }

    public short getPs() {
        return ps;
    }

    public short getDoors() {
        return doors;
    }

    public short getSpeed() {
        return speed;
    }

    public boolean isStarted() {
        return started;
    }

    public void setWheels(short w) {
        this.wheels = w;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public void setDoors(short d) {
        this.doors = d;
    }

    public void setSpeed(short s) {
        this.speed = s;
    }

    public void setStarted(boolean st) {
        this.started = st;
    }
    
 
    
}
