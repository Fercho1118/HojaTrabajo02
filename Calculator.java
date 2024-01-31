/**
 * Clase Calculator
 * Felipe Aguilar - 23195
 * Fernando Rueda - 23748
 * Clase para evaluar las expresiones en notación postfix.
 * Fecha de creación: 29/01/2024
 * Fecha de última modificación: 30/01/2024
 */
public class Calculator {
    /**
     * Evalúa una expresión en notación postfix.
     * @param expression La expresión en notación postfix.
     * @param stack El stack a utilizar para la evaluación.
     * @return El resultado de la evaluación de la expresión.
     * @throws RuntimeException si faltan operandos en un operador.
     */

    public int evaluatePostfix(String expression, UVGStack<Integer> stack) {
        String[] tokens = expression.split(" ");

        for (String token : tokens) {

            //Procesamiento de tokens.
            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token)); 
            } else {
                if (stack.isEmpty()) {
                    throw new RuntimeException("Faltan operandos para el operador " + token);
                }
                int val1 = stack.pop();

                if (stack.isEmpty()){
                    throw new RuntimeException("Faltan operando para el operador " + token);
                }
                int val2 = stack.pop();

                switch (token.charAt(0)) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                }
            }
        }

        return stack.pop();
    }
}
