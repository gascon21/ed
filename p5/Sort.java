package p5;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    
    public void RunTimes(){
        List<List<Integer>> myArrays = new ArrayList<List<Integer>>();
        List<Integer> myOrderAscArray = new ArrayList <Integer>();
        List<Integer> myOrderDesArray = new ArrayList <Integer>();
        List<Integer> myOrderRandomArray = new ArrayList <Integer>();
        List<Integer> myIdentyArray = new ArrayList <Integer>();
        String nombre;
        
        for (int i = 0 ; i < 1000; i++) {

            myOrderAscArray.add(i, i);
        }
        
        for (int i = 1000 ; i >=0 ; i--) {
             int j = 0;
             myOrderDesArray.add(j, i);
             j++;
        }
        
        for (int i = 0 ; i < 1000; i++) {

            myOrderRandomArray.add(i, (int) (Math.random()*2000000)+1);
        }
        
        for (int i = 0 ; i < 1000; i++) {

            myIdentyArray.add(i, 0);
        }
        
        for (int j = 0; j < 1000; j++) {
            myArrays.add(myOrderAscArray);
        }
        
        nombre = "array ascendente ordenado";
        AverageTimes(myArrays, nombre);
        
        myArrays.clear();
        
        for (int j = 0; j < 1000; j++) {
            myArrays.add(myOrderDesArray);
        }
        
        nombre = "array descendente ordenado";
        AverageTimes(myArrays, nombre);
        
        myArrays.clear();
        
        for (int j = 0; j < 1000; j++) {
            myArrays.add(myOrderRandomArray);
        }
        
        nombre = "array desordenado";
        AverageTimes(myArrays, nombre);
        
        myArrays.clear();
        
        for (int j = 0; j < 1000; j++) {
            myArrays.add(myIdentyArray);
        }
        
        nombre = "array con valores identicos";
        AverageTimes(myArrays, nombre);
        
        myArrays.clear();
    }
    
    public boolean RunTests(List<Integer> array){
        List<Integer> copia= new ArrayList<Integer>(array);
        copia.sort(null);
        
        return array.equals(copia);
    }
    
    public void AverageTimes(List<List<Integer>> myArrays, String nombre){
        long totalSum, time_start, time_end, time_min = Long.MAX_VALUE;
        
        // Buble sort
        totalSum = 0;
        for (int i = 0; i < myArrays.size(); i++) {
            time_start = System.nanoTime();
            BubbleSort(myArrays.get(i));
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
            if (!RunTests(myArrays.get(i)))
                System.out.println("Algoritmo incorrecto");
        }
        System.out.println("Ha tardado "+ (totalSum / myArrays.size()) + " nanosegundos ordenar con burbuja un " + nombre);
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
        
        // Selection sort
        totalSum = 0;
        for (int i = 0; i < myArrays.size(); i++) {
            time_start = System.nanoTime();
            SelectionSort(myArrays.get(i));
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
            if (!RunTests(myArrays.get(i)))
                System.out.println("Algoritmo incorrecto");
        }
        System.out.println("Ha tardado "+ (totalSum / myArrays.size()) + " nanosegundos ordenar con selection un " + nombre);
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
        
        // Insertion sort
        totalSum = 0;
        for (int i = 0; i < myArrays.size(); i++) {
            time_start = System.nanoTime();
            InsertionSort(myArrays.get(i));
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
            if (!RunTests(myArrays.get(i)))
                System.out.println("Algoritmo incorrecto");
        }
        System.out.println("Ha tardado "+ (totalSum / myArrays.size()) + " nanosegundos ordenar con insertion un " + nombre);
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
        
        // Quick sort
        totalSum = 0;
        for (int i = 0; i < myArrays.size(); i++) {
            time_start = System.nanoTime();
            QuickSort(myArrays.get(i), 0 , myArrays.get(i).size() - 1);
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
            if (!RunTests(myArrays.get(i)))
                System.out.println("Algoritmo incorrecto");
        }
        System.out.println("Ha tardado "+ (totalSum / myArrays.size()) + " nanosegundos ordenar con quick un " + nombre);
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
        
        /*
        // Merge sort
        totalSum = 0;
        for (int i = 0; i < myArrays.size(); i++) {
            time_start = System.nanoTime();
            MergeSort(myArrays.get(i));
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
            if (!RunTests(myArrays.get(i)))
                System.out.println("Algoritmo incorrecto");
        }
        System.out.println("Ha tardado "+ (totalSum / myArrays.size()) + " nanosegundos ordenar con merge un " + nombre);
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        */
        
        
        // Busqueda binaria
        totalSum = 0;
        for (int i = 0; i < myArrays.size(); i++) {
            time_start = System.nanoTime();
            BusquedaBinaria(myArrays.get(i), 4);
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myArrays.size()) + " nanosegundos hacer una busqueda binaria en un " + nombre);
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
        
        // Busqueda secuencial
        totalSum = 0;
        for (int i = 0; i < myArrays.size(); i++) {
            time_start = System.nanoTime();
            BusquedaSecuencial(myArrays.get(i), 4);
            time_end = System.nanoTime();
            totalSum += (time_end - time_start);
            if(time_end - time_start < time_min)
                time_min = time_end - time_start;
        }
        System.out.println("Ha tardado "+ (totalSum / myArrays.size()) + " nanosegundos hacer una busqueda secuencial en un " + nombre);
        System.out.println("El tiempo mas bajo ha sido de " + time_min + " nanosegundos");
        time_min = Long.MAX_VALUE;
        
    }
    
    
    public void BubbleSort(List<Integer> arraySort){
        final int N=arraySort.size();
        for(int i=N-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arraySort.get(j)>arraySort.get(j+1)){
                    int temp=arraySort.get(j);
                    arraySort.set(j,arraySort.get(j+1));
                    arraySort.set(j +1 ,temp);
                }
            }
        }
    }
    
    public void SelectionSort(List<Integer> arraySort){
        int i, j, minIndex, tmp;
        int n = arraySort.size();
        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++)
                if (arraySort.get(j) < arraySort.get(minIndex))
                    minIndex = j;
            if (minIndex != i) {
                tmp = arraySort.get(i);
                arraySort.set(i, arraySort.get(minIndex)); 
                arraySort.set(minIndex, tmp);
            }
        }
    }
    
    public void InsertionSort(List<Integer> arraySort){
        int j;
        int key;
        int i;
        for (j = 1; j < arraySort.size(); j++) {
            key = arraySort.get(j);
            for(i = j - 1; (i >= 0) && (arraySort.get(i) > key); i--) {
                arraySort.set(i + 1, arraySort.get(i));
            }
            arraySort.set(i + 1,key);
        }
    }
    
    public void QuickSort(List<Integer> arraySort, int izq, int der){
        int pivote=arraySort.get(izq);
        int i=izq;
        int j=der; 
        int aux;

        while(i<j){
           while(arraySort.get(i)<=pivote && i<j) i++;
           while(arraySort.get(j)>pivote) j--;
           if (i<j) {
               aux= arraySort.get(i);
               arraySort.set(i, arraySort.get(j));
               arraySort.set(j, aux);
           }
         }
        
        arraySort.set(izq, arraySort.get(j));
        arraySort.set(j, pivote);
          
         if(izq<j-1)
            QuickSort(arraySort,izq,j-1);
         if(j+1 <der)
            QuickSort(arraySort,j+1,der);
    }
    
    public void MergeSort(List<Integer> arraySort){
        
    }
    

    public int BusquedaBinaria(List<Integer> arraySearch, Integer dato){
        int n = arraySearch.size();
        int centro, inf=0 , sup=n-1;
        
        while(inf<=sup){ 
            centro=(sup+inf)/2;
            if(arraySearch.get(centro) == dato) 
                    return centro;
            else if(dato < arraySearch.get(centro) )
                sup=centro-1;
            else  
                inf=centro+1;
        } 
        return -1; 
    }
    
    public int BusquedaSecuencial(List<Integer> arraySearch,int dato){
        int posicion = -1;
        for(int i = 0; i < arraySearch.size(); i++){
            if(arraySearch.get(i) == dato){
                posicion = i;
            break;
            }
        }
        return posicion;
    }
}
