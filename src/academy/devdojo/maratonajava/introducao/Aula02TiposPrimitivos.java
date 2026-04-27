package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        /*
        Tipos primitivos
        int, double, float, char, byte, short, long, boolean
          */

        int age = (int) 10000000000L;
        long bigNumber = (long) 155.95;
        double wageDouble = 2000.0;
        float wageFloat = (float) 2500.0D;
        byte ageByte = 10;
        short ageShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65; //number or letter. Whole numbers = table ASCII or UNICODE
        char secCaractere = 'M'; //number or letter. Whole numbers = table ASCII or UNICODE
        String name = "Luis Henrique"; // isn´t primitive type

        System.out.println("A idade do meu irmão é "+age+" anos. ");
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(bigNumber);
        System.out.println(wageFloat);
        System.out.println("Oi meu nome é "+name);



        /*
        Testing Casting
         */

        int teste = (int) 100.5;
        System.out.println(teste);


        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myDouble);
        System.out.println(myInt);

        double mySecDouble = 9.78d;
        int mySecInt = (int) mySecDouble;
        System.out.println(mySecDouble);
        System.out.println(mySecInt);
    }
}