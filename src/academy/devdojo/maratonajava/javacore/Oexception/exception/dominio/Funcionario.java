package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {
    @Override
    public void salvar() throws LoginInvalidoException{
        System.out.println("Salvando funcionário.");
        // Na sobreescrita de um método, NÃO É OBRIGATÓRIO passar as exceções que contém na assinatura do método original.
    }
}
