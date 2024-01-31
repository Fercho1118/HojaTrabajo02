/**
 * Clase VectorStack
 * Felipe Aguilar - 23195
 * Fernando Rueda - 23748
 * Clase que implementa un stack utilizando un vector.
 * Fecha de creación: 29/01/2024
 * Fecha de última modificación: 29/01/2024
 */
import java.util.Vector;

/**
 * Implementación de un stack utilizando un vector.
 * 
 * @param <T> El tipo de los elementos en el stack.
 */
public class VectorStack<T> implements UVGStack<T> {
    private Vector<T> stack;

    /**
     * Constructor que inicializa el stack.
     */
    public VectorStack() {
        stack = new Vector<T>();
    }

    /**
     * Inserta un elemento al stack.
     * 
     * @param item El elemento a insertar.
     */
    @Override
    public void push(T item){
        stack.add(item);
    }

    /**
     * Elimina y retorna el elemento superior del stack.
     * 
     * @return El elemento superior del stack. o null si el stack está vacío.
     */
    @Override
    public T pop(){
        if (!isEmpty()){
            return stack.remove(stack.size() -1);
        }
        return null;
    }

    /**
     * Observa el elemento superior del stack sin eliminarlo.
     * 
     * @return El elemento superior del stack, o null si el stack está vacío.
     */
    @Override
    public T top(){
        if (!isEmpty()){
            return stack.get(stack.size() -1);
        }
        return null;
    }

    /**
     * Verifica si el stack está vacío.
     * 
     * @return true si la pila está vacía, false si no lo está.
     */
    @Override
    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
