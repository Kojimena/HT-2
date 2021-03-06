/**
 * @author Jimena Hernández
 * Clase que implementa el stack
 * @version 19/02/2022
 */
import java.util.Vector;

public class MyStack<E> implements Stack<E> {
    
    private Vector<E> vec;

    public MyStack(){
        vec = new Vector<E>();
    }

    /** 
    * @param element
    * Agregar elementos 
    */
    public void push(E element) { 
		vec.addElement(element);
		
	}

    /**
     * 
     * @return 
     * Eliminar el utlimo valor dentro de la pila
     */
    public E pull(){
        return (vec.remove(vec.size()-1));
    }

    /**
     * 
     * @return 
     * Devuelve true si está vacío y false si esta lleno
     */
    public boolean isEmpty(){
        return vec.isEmpty();
    }

    /**
     * 
     * @return 
     * Devolver el ultimo valor 
     */
    public E peek() {
        return vec.get(vec.size()-1);
    }

    /**
     * 
     * @return 
     * Devuelve el tamaño del vector
     */
    public int count() {
        return vec.size();
    }



}
