package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro de ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro de IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro de IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro de ArithmeticException");
        } catch (RuntimeException e) {
            // A exceção mais genérica deve sempre ser deixada no último catch.
            // Da mais específica para a mais genérica
            System.out.println("Dentro de RunTimeException");
        }


        try {
            talvezLanceException();
            // Poderia ser resumido a apenas um catch mais genérico. Como por exemplo: catch (Exception e) {}.
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
