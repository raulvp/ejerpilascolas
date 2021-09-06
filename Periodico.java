
package javaapplication90;

import java.util.Date;

public class Periodico {
   private int peso;
   private String periodico;

    public Periodico(int peso, String periodico) {
        this.peso = peso;
        this.periodico = periodico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getPeriodico() {
        return periodico;
    }

    public void setPeriodico(String periodico) {
        this.periodico = periodico;
    }
    
   @Override
    public String toString(){
        return "El peso es: "+peso+" y el periodico "+periodico;
    }
   
   
}
