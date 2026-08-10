package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(0,3));

    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero.
     */

    public static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal. Divisor não pode ser zero.");
            // Como se trata de uma exceção do tipo runTime, não há necessidade de, na decalração do método, informar que ele poderá lançar uma exceção do tipo RunTime.
            // Só é obrigatório declarar a exceção na assinatura do método quando as exceções forem do tipo Exception.
        }
        return a / b;
    }
}