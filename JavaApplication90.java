
package javaapplication90;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Stack;

public class JavaApplication90 {

    public static void main(String[] args) {
        Stack periodicos = new Stack(); //pila desordenada
        ArrayList ordenar = new ArrayList();
        periodicos.push(new Periodico(3, "Los Tiempos"));
        periodicos.push(new Periodico(2, "Los Tiempos"));
        periodicos.push(new Periodico(1, "Opinion"));
        periodicos.push(new Periodico(4, "Los Tiempos"));
        periodicos.push(new Periodico(5, "Opinion"));
        periodicos.push(new Periodico(6, "Los Tiempos"));
        
        //extraer datos
        int j = periodicos.size();
        while(j>=1){
            Periodico p = (Periodico)periodicos.pop();
            ordenar.add(p);
            j--;
        }
        
        //mostrando desordenada
      
        System.out.println("Pila desordenada");
        
        for(int i=0;i<ordenar.size();i++){
            Periodico pp = (Periodico)ordenar.get(i);
            System.out.println("Periodico con valor "
                    +pp.getPeso()+" periodico "
                    +pp.getPeriodico());
        }
        
        ordenar.sort(Comparator.comparing(Periodico::getPeso));
        
        //pila ordenada
        System.out.println("Pila Ordenada");
        for(int i=0;i<ordenar.size();i++){
            Periodico pp = (Periodico)ordenar.get(i);
            System.out.println("Periodico con valor "
                    +pp.getPeso()+" periodico "
                    +pp.getPeriodico());
        }
        
        
        
    }
    
}
