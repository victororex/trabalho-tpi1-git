public class Calculadora {

    /**
     * Executa uma operação matemática básica.
     * @param operacao
     * @param operacao Tipo da operação: "soma"
     * @param operacao Tipo da operação: "divisao"
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da operação
     */
    public double calcular(String operacao, int a, int b) {
        switch (operacao.toLowerCase()) {
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);
            case "soma":
                return a + b;
            
            case "divisao":
                if (b == 0) {
                    throw new IllegalArgumentException("Divisão por zero não é permitida!");
                }
                return (double) a / b;
        }
    }

    // Método principal para testar
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.calcular( "", 0, 0 );
        System.out.println("Soma: " + calc.calcular("soma", 10, 5));
        System.out.println("Divisão: " + calc.calcular("divisao", 10, 5));
    }
}

