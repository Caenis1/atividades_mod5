package atividades_mod5;

/**
 * Classe responsável por realizar operações matemáticas básicas.
 * 
 * Fornece métodos para adição, subtração, multiplicação e divisão.
 * Todos os métodos trabalham com números inteiros.
 */
public class Calculadora {

    /**
     * Realiza a soma de dois números inteiros.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da soma entre a e b
     */
    public int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração entre dois números inteiros.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return resultado de a - b
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação entre dois números inteiros.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da multiplicação entre a e b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão entre dois números inteiros.
     *
     * @param a dividendo
     * @param b divisor (não pode ser zero)
     * @return resultado da divisão inteira de a por b
     * @throws ArithmeticException se o divisor for zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return a / b;
    }
}