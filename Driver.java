/**
 * Clase Driver
 * Felipe Aguilar - 23195
 * Fernando Rueda - 23748
 * Clase principal que ejecuta el programa.
 * Fecha de creación: 29/01/2024
 * Fecha de última modificación: 30/01/2024
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) {
        //Creación de un stack y una calculadora.
        UVGStack<Integer> stack = new VectorStack<>();
        Calculator calculator = new Calculator();
        
        try {
            //Lectura de la expresión desde el archivo datos.txt.
            BufferedReader reader = new BufferedReader(new FileReader("datos.txt"));
            String expression = reader.readLine();
            reader.close();

            //Evaluación de la expresión si no es nula.
            if (expression != null) {
                int result = calculator.evaluatePostfix(expression, stack);
                System.out.println("El resultado de la expresión es: " + result);
            }
        } catch (IOException e) {
            //Manejo de excepciones de entrada/salida.
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}