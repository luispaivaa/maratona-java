package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        String usernameDB = "Light";
        String passwdDB = "L123";
        Scanner input = new Scanner(System.in);

        System.out.println("Usuário: ");
        String usernameDigitado = input.nextLine();
        System.out.println("Senha: ");
        String passwdDigitado = input.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !passwdDB.equals(passwdDigitado)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos.");
        }

        System.out.println("Usuário logado com sucesso.");
    }
}
