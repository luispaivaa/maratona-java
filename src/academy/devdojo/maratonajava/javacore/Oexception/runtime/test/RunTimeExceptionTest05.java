package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest05 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            /**
             *  Exceções da mesma linhagem/herança não podem ser colocadas em um único catch,
             *  separadas por pipe | .
             *  Isso é uma maneira de manter o código mais organizado.
             */
            System.out.println("Dentro de ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            // A exceção mais genérica deve sempre ser deixada no último catch.
            // Da mais específica para a mais genérica
            System.out.println("Dentro de RunTimeException");
        }


        try {
            talvezLanceException();
            // Poderia ser resumido a apenas um catch mais genérico. Como por exemplo: catch (Exception e) {}.
        } catch (SQLException | IOException throwables) {
            throwables.printStackTrace();
        }

    }

    private static void talvezLanceException() throws SQLException, IOException {

    }
}
