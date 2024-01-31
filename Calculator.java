public class Calculator {

    public int evaluatePostfix(String expression, UVGStack<Integer> stack) {
        String[] tokens = expression.split(" ");

        for (String token : tokens) {

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
