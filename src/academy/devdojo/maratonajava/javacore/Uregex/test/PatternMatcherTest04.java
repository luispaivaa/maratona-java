package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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
         *
         * **/
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)"; //expressão regular para encontrar números HEXADECIMAIS
        String texto = "12 0x 0X 0xFFABC 0X10G 0x1";
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
