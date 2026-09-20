package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        /**
         * \d = todos os dígitos
         * \D = Tudo o que não for dígito
         * \s = Espaços em branco \t  \n  \f  \r
         * \S = Todos carecteres excluindo os brancos
         * \w = a-z A-Z, dígitos, _
         * \W = tudo o que não for no \w
         * []
         * ? - 0 ou uma
         * * - zero ou mais
         * + - uma ou mais
         * {n-m} de n até m ocorrências
         * () agrupamento
         * | ou
         * exemplo:  o(v|c)o   -->   ovo ou oco
         * $ - fim da linha
         * // . 1.3 = 123, 133, 1@3, 1A3
         * **/
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.[(a-zA-Z)]+)+";
        String texto = "luffy@hotmail.com, 12luis@gmail.com, #0!zoro@mail.com.br, pa1vaU@proton.br";
        System.out.println("Email válido ? " + "#0!zoro@mail.com.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println();
        System.out.println("Posições encontradas:");
        while (matcher.find()){
            System.out.print("Posição: " + matcher.start() + " | Caracter: " + matcher.group()+"\n");
        }
    }
}
