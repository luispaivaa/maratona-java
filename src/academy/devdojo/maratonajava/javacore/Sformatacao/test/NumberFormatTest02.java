package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt-br", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getCurrencyInstance();
        numberFormats[1] = NumberFormat.getCurrencyInstance(localeBR);
        numberFormats[2] = NumberFormat.getCurrencyInstance(localeJP);
        numberFormats[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 12366.300;

        for (NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "￥12366,300";
        try {
            System.out.println(numberFormats[2].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
