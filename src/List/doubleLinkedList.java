package List;

import Excepciones.isEmptyException;
import Node.Node;
import java.util.Iterator;

public class doubleLinkedList<T extends Comparable<T>> implements Iterable<T>, Comparable<T> {
    
    private Node<T> head, tail;
    private long lenght;
    
    public doubleLinkedList() {
        head = new Node<>();
        tail = new Node<>();
        lenght = 0;
    }
    
    public doubleLinkedList(T value) {
        this();
        Node<T> _new = new Node<>(value);
        head.setNext(_new);
        tail.setBack(_new);
        lenght++;
    }
    
    public doubleLinkedList(Node<T> node) {
        this(node.getValue());
    }
    
    public boolean add(T value) {
        Node<T> _new = new Node<>(value);
        if (_new == null)
            return false;
        else {
            try {
                isEmpty();
                Node<T> tmp = tail.getBack();
                tmp.setNext(_new);
                _new.setBack(tmp);
                tail.setBack(_new);
            }catch (isEmptyException e) {
                head.setNext(_new);
                tail.setBack(_new);
            }
            lenght++;
            return true;
        }
        
    }
    
    public boolean add(Node<T> node) {
        return add(node.getValue());
    }
    
    public boolean removeAll(T value){return false;}
    public boolean remove(T value) {return false;}
    public boolean remove(Node<T> node){return false;}
    //  encuentra el nodo y regresa el nodo buscando por el inicio
    private Node<T> search(Node<T> head){return null;}
    //  encuentra el nodo y regresa el nodo buscando por el final
    private Node<T> rSearch(Node<T> tail){return null;}
    public boolean addAt(T value, int position){return false;}
    public boolean addAt(Node<T> node, int position){return false;}
    public boolean addAfter(T after, T value){return false;}
    public boolean addBefore(T value){return false;}
    public boolean removeAfter(){return false;}
    public boolean removeBefore(){return false;}
    public boolean addStart(T value){return false;}
    public boolean addStart(){return false;}
    public Node<T> getElementAt(){return null;}
    public boolean isEmpty() throws isEmptyException {
        if (head.getNext()==null) {
            throw new isEmptyException("La lista está vaciá");
        }
        else
            return true;
    }
    
    public long lenght() {
        return this.lenght;
    }
    
    public void rprint() {
        rprint(tail);
    }
    
    public void rprint(Node<T> node) {
        if (node.getBack() == null)
            return;
        else {
            System.out.println(node.getBack().getValue());
            rprint(node.getBack());
        }
    }
    
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> cpy = head.getNext(), sub_head;
            @Override
            public boolean hasNext() {
                if (cpy == null)
                    return false;
                else {
                    sub_head = cpy;
                    cpy = cpy.getNext();
                    return true;
                }
            }
            
            @Override
            public T next() {
                return sub_head.getValue();
            }
        };
    }

    @Override
    public int compareTo(T t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
