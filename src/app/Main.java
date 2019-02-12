package app;

import List.doubleLinkedList;
import List.linkedList;
import Node.Node;
public class Main {
    
    //static linkedList<Double> dobles = new linkedList<>();
    static doubleLinkedList<Double> dobles = new doubleLinkedList<>();
    
    /*
    public static void fill(int n, int m) {
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dobles.add( (Double)Math.abs(Math.floor(Math.random()*(n-m+1)+m)));
            }
            
        }
        
    }
    */
    public static void main(String[] args) {
        
        dobles.add(9d);
        dobles.add(18d);
        dobles.add(26d);
        dobles.add(46d);
        dobles.add(260d);
        dobles.add(19d);
        dobles.add(9d);
        dobles.add(9d);
        
        dobles.rprint();
        dobles.add(10d);  
        dobles.addAt(10d, (int) 10d); 
        dobles.addStart(10d); //Añade en el inicio
        dobles.addAfter(10d, 10d); //Añade después del valor
        dobles.addBefore(10d); //Añade antes del valor
        dobles.remove(10d); //Retira la primera ocurrencua
        

        //Los métodos arriba invocados pueden utilizarse en un ciclo para repetición.

        
        dobles.removeAll(10d); //Retira todos los elementos concurrentes

        /*
        if (dobles.removeBefore(18d))
            System.out.println("Se borró el valor");
        else
            System.out.println("No se puede");
        */
        
        
        //dobles.removeAll(9d);
        
        //fill(1, 62650);
        /*
        for (Double object : dobles) {
            System.out.println(object);
        }
        */
        //Node<Double> nodo = new Node<Double>();
        //nodo.setValue(18d);
        //dobles.add(nodo);
    }
    
}
