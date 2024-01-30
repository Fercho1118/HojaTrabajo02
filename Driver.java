public class Driver {
    public static void main(String[] args) {
        UVGStack<Integer> stack = new VectorStack<>();
        Calculator calculator = new Calculator();
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("datos.txt"));
            String expression = reader.readLine();
            reader.close();

            if (expression != null) {
                int result = calculator.evaluatePostfix(expression, stack);
                System.out.println("El resultado de la expresión es: " + result);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}