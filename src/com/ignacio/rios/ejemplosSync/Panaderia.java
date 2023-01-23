package com.ignacio.rios.ejemplosSync;

public class Panaderia {
    private String pan;
    private boolean disponible;

    public synchronized void  hornear(String masa){
        while(disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.pan = masa;
        System.out.println("panadero horneando" + masa);
        this.disponible = true;
         notify();
    }

    public synchronized String Consumir(){

          while(disponible){
              try {
                  wait();
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }

          }
        System.out.println("cliente consumiendo" + this.pan);
          this.disponible = false;
          notify();
          return pan;

    }



}
