package p5;

import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.LinkedList;

public class Lists {
    public static void RunTimes​(){
        
        ArrayList<ArrayList<Integer>> myRandomArray = new ArrayList<>();
        LinkedList<ArrayList<Integer>> myRandomLinked = new LinkedList<>(); 
        ArrayList<Integer> RandomArray = new ArrayList<Integer>();
        ArrayList<Integer> RandomLinked = new ArrayList<Integer>();
            
        for (int i = 0 ; i < 1000; i++) {
            RandomArray.add(i, (int) (Math.random()*2000000)+1);
            RandomLinked.add(i, (int) (Math.random()*2000000)+1);
        }
        
        for (int j = 0; j < 1000; j++) {
            myRandomArray.add(RandomArray);
            myRandomLinked.add(RandomLinked);
        }
        
        
        long time_start, time_end, time_min = Long.MAX_VALUE;
        boolean found;
        int centro, inf , sup, totalSum;
        
        // Insertado en la primera posicion del array
        totalSum = 0;
        for (int i = 0; i < myRandomArray.size(); i++) {
            time_start = System.nanoTime();
                myRandomArray.get(i).add(0, (int) (Math.random() * 200000 + 1));
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = (time_end - time_start);
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomArray.size()) + " nanosegundos de media en insertar en primera posicion en un array.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
        
        // Insertado en la primera posicion del linked
        totalSum = 0;
        for (int i = 0; i < myRandomLinked.size(); i++) {
            time_start = System.nanoTime();
                myRandomLinked.get(i).add(0, (int) (Math.random() * 200000 + 1));
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomLinked.size()) + " nanosegundos de media en insertar en primera posicion en un linked.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
        
        // Insertado en mitad del array
        totalSum = 0;
        for (int i = 0; i < myRandomArray.size(); i++) {
            time_start = System.nanoTime();
                myRandomArray.get(i).add(myRandomArray.get(i).size()/2, (int) (Math.random() * 200000 + 1));
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomArray.size()) + " nanosegundos de media en insertar a mitad de un array.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
        
        // Insertado en mitad del linked
        totalSum = 0;
        for (int i = 0; i < myRandomLinked.size(); i++) {
            time_start = System.nanoTime();
                myRandomLinked.get(i).add(myRandomLinked.get(i).size()/2, (int) (Math.random() * 200000 + 1));
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomLinked.size()) + " nanosegundos de media en insertar a mitad de un linked.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
        
        // Insertado al final del array
        totalSum = 0;
        for (int i = 0; i < myRandomArray.size(); i++) {
            time_start = System.nanoTime();
                myRandomArray.get(i).add(myRandomArray.get(i).size(), (int) (Math.random() * 200000 + 1));
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomArray.size()) + " nanosegundos de media en insertar al final de un array.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
       
        // Insertado al final del linked
        totalSum = 0;
        for (int i = 0; i < myRandomLinked.size(); i++) {
            time_start = System.nanoTime();
                myRandomLinked.get(i).add(myRandomLinked.get(i).size(), (int) (Math.random() * 200000 + 1));
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomLinked.size()) + " nanosegundos de media en insertar al final de un linked.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;

        // Borrado en la primera posicion del array
        totalSum = 0;
        for (int i = 0; i < myRandomArray.size(); i++) {
            time_start = System.nanoTime();
                myRandomArray.get(i).remove(0);
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomArray.size()) + " nanosegundos en borrar en primera posicion en un array.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
       
        // Borrado en la primera posicion del linked
        totalSum = 0;
        for (int i = 0; i < myRandomLinked.size(); i++) {
            time_start = System.nanoTime();
                myRandomLinked.get(i).remove(0);
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomLinked.size()) + " nanosegundos en borrar en primera posicion en un linked.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
        
        // Borrado en mitad del array
        totalSum = 0;
        for (int i = 0; i < myRandomArray.size(); i++) {
            time_start = System.nanoTime();
                myRandomArray.get(i).remove(myRandomArray.get(i).size()/2);
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomArray.size()) + " nanosegundos en borrar en mitad de un array.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
       
        // Borrado en mitad del linked
        totalSum = 0;
        for (int i = 0; i < myRandomLinked.size(); i++) {
            time_start = System.nanoTime();
                myRandomLinked.get(i).remove(myRandomLinked.get(i).size()/2);
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomLinked.size()) + " nanosegundos en borrar en mitad de un linked.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
                
        // Borrado al final del array
        totalSum = 0;
        for (int i = 0; i < myRandomArray.size(); i++) {
            time_start = System.nanoTime();
                myRandomArray.get(i).remove(myRandomArray.get(i).size()-1);
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomArray.size()) + " nanosegundos en borrar al final de un array.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
       
        // Borrado al final del linked
        totalSum = 0;
        for (int i = 0; i < myRandomLinked.size(); i++) {
            time_start = System.nanoTime();
                myRandomLinked.get(i).remove(myRandomLinked.get(i).size()-1);
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomLinked.size()) + " nanosegundos en borrar al final de un linked.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
        
        // Borrado en la primera posicion del array por valor
        totalSum = 0;
        for (int i = 0; i < myRandomArray.size(); i++) {
            time_start = System.nanoTime();
                if(myRandomArray.get(i).get(0) == 4)
                    myRandomArray.get(i).remove(0);
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomArray.size()) + " nanosegundos en borrar el 4 al principio de un array.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
       
        // Borrado en la primera posicion del linked por valor
        totalSum = 0;
        for (int i = 0; i < myRandomLinked.size(); i++) {
            time_start = System.nanoTime();
                if(myRandomLinked.get(i).get(0) == 4)
                    myRandomLinked.get(i).remove(0);
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomLinked.size()) + " nanosegundos en borrar el 4 al principio de un linked.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
        
        // Borrado en mitad del array por valor
        totalSum = 0;
        for (int i = 0; i < myRandomArray.size(); i++) {
            time_start = System.nanoTime();
                if(myRandomArray.get(i).get(myRandomArray.get(i).size()/2) == 4)
                    myRandomArray.get(i).remove(myRandomArray.get(i).size()/2);
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomArray.size()) + " nanosegundos en borrar el 4 en mitad de un array.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
       
        // Borrado en mitad del linked por valor
        totalSum = 0;
        for (int i = 0; i < myRandomLinked.size(); i++) {
            time_start = System.nanoTime();
                if(myRandomLinked.get(i).get(myRandomLinked.get(i).size()/2) == 4)
                    myRandomLinked.get(i).remove(myRandomLinked.get(i).size()/2);
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomLinked.size()) + " nanosegundos en borrar el 4 en mitad de un linked.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
                
        // Borrado al final del array por valor
        totalSum = 0;
        for (int i = 0; i < myRandomArray.size(); i++) {
            time_start = System.nanoTime();
                if(myRandomArray.get(i).get(myRandomArray.get(i).size()-1) == 4)
                    myRandomArray.get(i).remove(myRandomArray.get(i).size()-1);
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomArray.size()) + " nanosegundos en borrar el 4 al final de un array.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
       
        // Borrado al final del linked por valor
        totalSum = 0;
        for (int i = 0; i < myRandomLinked.size(); i++) {
            time_start = System.nanoTime();
                if(myRandomLinked.get(i).get(myRandomLinked.get(i).size()-1) == 4)
                    myRandomLinked.get(i).remove(myRandomLinked.get(i).size()-1);
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomLinked.size()) + " nanosegundos en borrar el 4 al final de un linked.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;

        // Busqueda en un array con funciones propias
        totalSum = 0;
        for (int i = 0; i < myRandomArray.size(); i++) {
            time_start = System.nanoTime();
                myRandomArray.contains(4);
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomArray.size()) + " nanosegundos en buscar en un array con funciones propias.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
       
        // Busqueda en un linked con funciones propias
        totalSum = 0;
        for (int i = 0; i < myRandomLinked.size(); i++) {
            time_start = System.nanoTime();
                myRandomLinked.contains(4);
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomLinked.size()) + " nanosegundos en buscar en un linked con funciones propias.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
        
        // Busqueda en un array implementando algoritmo
        totalSum = 0;
        for (int i = 0; i < myRandomArray.size(); i++) {
            time_start = System.nanoTime();
                found = false;
                for(int j = 0 ;  j < myRandomArray.get(i).size() && !found ; j ++ ){
                    if(myRandomArray.get(i).get(j) == 4)
                        found = true;
                }
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomArray.size()) + " nanosegundos en buscar en un array implementando el algoritmo.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
       
        // Busqueda en un linked implementando algoritmo
        totalSum = 0;
        for (int i = 0; i < myRandomLinked.size(); i++) {
            time_start = System.nanoTime();
                found = false;
                for(int j = 0 ;  j < myRandomLinked.get(i).size() && !found ; j ++ ){
                    if(myRandomLinked.get(i).get(j) == 4)
                        found = true;
                }
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomLinked.size()) + " nanosegundos en buscar en un linked implementando el algoritmo.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
        
        
        
        
        // Busqueda en un array implementando busqueda binaria
        totalSum = 0;
        for (int i = 0; i < myRandomArray.size(); i++) {
            sort(myRandomArray.get(i));
            time_start = System.nanoTime();
                inf=0;
                sup=myRandomArray.get(i).size()-1;
                found = false;

                while(inf <= sup && !found){ 
                    centro = (sup + inf) / 2;
                    if(myRandomArray.get(i).get(centro) == 4) 
                            found = true;
                    else if(4 < myRandomArray.get(i).get(centro) )
                        sup=centro - 1;
                    else  
                        inf=centro + 1;
                }
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomArray.size()) + " nanosegundos en buscar en un array implementando busqueda binaria.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
       
        // Busqueda en un linked implementando busqueda binaria
        totalSum = 0;
        for (int i = 0; i < myRandomLinked.size(); i++) {
            sort(myRandomLinked.get(i));
            time_start = System.nanoTime();
                inf=0;
                sup=myRandomLinked.get(i).size()-1;
                found = false;

                while(inf <= sup && !found){ 
                    centro = (sup + inf) / 2;
                    if(myRandomLinked.get(i).get(centro) == 4) 
                            found = true;
                    else if(4 < myRandomLinked.get(i).get(centro) )
                        sup=centro - 1;
                    else  
                        inf=centro + 1;
                }
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomLinked.size()) + " nanosegundos en buscar en un linked implementando busqueda binaria.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
        
        // Vaciado de un array
        totalSum = 0;
        for (int i = 0; i < myRandomArray.size(); i++) {
            time_start = System.nanoTime();
                myRandomArray.get(i).clear();
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomArray.size()) + " nanosegundos en vaciar un array.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
       
        // Vaciado de un linked
        totalSum = 0;
        for (int i = 0; i < myRandomLinked.size(); i++) {
            time_start = System.nanoTime();
                myRandomLinked.get(i).clear();
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myRandomLinked.size()) + " nanosegundos en vaciar un linked.");
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
    }
}
