    public class Calculadora {

    /**
     * Executa uma operação matemática básica.
<<<<<<< HEAD
     * @param operacao
     * @param operacao Tipo da operação: "soma"
     * @param operacao Tipo da operação: "divisao"
=======
     * @param operacao Tipo da operação: "subtracao", "multiplicacao"
>>>>>>> parent of 97307b4 (Update calculadora.java)
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da operação
     */
    public double calcular(String operacao, int a, int b) {
        switch (operacao.toLowerCase()) {
<<<<<<< HEAD
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);
            case "soma":
                return a + b;
            
            case "divisao":
                if (b == 0) {
                    throw new IllegalArgumentException("Divisão por zero não é permitida!");
                }
                return (double) a / b;
=======
            case "subtracao":
                return a - b;
            case "multiplicacao":
                return a * b;
>>>>>>> parent of 97307b4 (Update calculadora.java)
        }
    }

    // Método principal para testar
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
<<<<<<< HEAD

        calc.calcular( "", 0, 0 );
        System.out.println("Soma: " + calc.calcular("soma", 10, 5));
        System.out.println("Divisão: " + calc.calcular("divisao", 10, 5));
=======
        System.out.println("Subtração: " + calc.calcular("subtracao", 10, 5));
        System.out.println("Multiplicação: " + calc.calcular("multiplicacao", 10, 5));
>>>>>>> parent of 97307b4 (Update calculadora.java)
    }
}