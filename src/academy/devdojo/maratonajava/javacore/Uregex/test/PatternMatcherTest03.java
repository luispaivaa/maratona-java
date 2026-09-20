package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        /**
         * \d = todos os dígitos
         * \D = Tudo o que não for dígito
         * \s = Espaços em branco \t  \n  \f  \r
         * \S = Todos carecteres excluindo os brancos
         * \w = a-z A-Z, dígitos, _
         * \W = tudo o que não for no \w
         * []
         * **/
//        String regex = "[0-5]";
//        String regex = "[a-zA-Z]";
        String regex = "0[xX][0-9a-fA-F]";
        String texto = "abbaaaba";
        String texto2 = "jhhhol@4ihp5 %¨$&&6\tn0,zKK|//2@1!¹1";
        String texto3 = "12 0x 0X 0xFFABC 0X108 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto3);
        System.out.println("texto:  " + texto3);
        System.out.println("índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println();
        System.out.println("Posições encontradas:");
        while (matcher.find()){
            System.out.print("Posição: " + matcher.start() + " | Caracter: " + matcher.group()+"\n");
        }
    }
}
