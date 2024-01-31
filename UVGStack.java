/**
 * Interfaz UVGStack
 * Felipe Aguilar - 23195
 * Fernando Rueda - 23748
 * Interfaz para una estructura de datos tipo stack.
 * Fecha de creación: 29/01/2024
 * Fechade última modificación: 30/01/2024
 */

 /**
  * @param <T> El tipo de los elementos de un stack.
  */
public interface UVGStack <T>{
    public void push(T x);
    public T pop();
    public T top();
    public boolean isEmpty();
}
