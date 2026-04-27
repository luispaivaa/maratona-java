package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        /*
         * Arithmetic operators ->   +  -  /  *
         * The result of any operation between two int numbers, will always be an int number.
         */
        int num1 = 10;
        int num2 = 20;
        double result = num1 / (double) num2;
        double secResult = num1 / num2;
        System.out.println(result);
        System.out.println(secResult);

        /*
         * Rest  % - return the division remainder
         * Even or Odd
         */
        int rest = 20 % 2;
        System.out.println(rest);

        /*
         * Comparison Operators   <  >  <=  >=  ==  !=
         * Only returns boolean values
         */

        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThenTwenty = 10 < 20;
        boolean isTenEqualsTwenty = 10 == 20;
        boolean isTenEqualsTen = 10 == 10.0;
        boolean isTenDifferentTwenty = 10 != 20;


        System.out.println("isTenGreaterThanTwenty "+isTenGreaterThanTwenty);
        System.out.println("isTenLessThanTwenty "+isTenLessThenTwenty);
        System.out.println("isTenEqualsTen "+isTenEqualsTen);
        System.out.println("isTenEqualsTwenty "+isTenEqualsTwenty);
        System.out.println("isTenDifferentTwenty "+isTenDifferentTwenty);


        /*
         * Logical Operators    &&(AND)    ||(or)    !
         * Always returns boolean values
         */

        int age = 23;
        float wage = 3500f;
        boolean isInLawGreaterThanThirty = age >= 30 && wage >= 4612;
        boolean isInLawLessThanThirty = age < 30 && wage >= 3381;
        System.out.println("isInLawGreaterThanThirty "+isInLawGreaterThanThirty);
        System.out.println("isInLawLessThanThirty "+isInLawLessThanThirty);

        double totalValueCheckingAccount = 200;
        double totalValueSavingsAccount  = 1670;
        float videoCardValue = 1500;
        boolean isVideoCardAffordable = totalValueCheckingAccount > videoCardValue || totalValueCheckingAccount > videoCardValue;
        System.out.println("isVideoCardAffordable "+isVideoCardAffordable);

        /*
        * Attribution Operators   =   +=   -=   *=   /=   %=
         */

        double bonus = 1800;
        bonus += 1000; // bonus = bonus + 1000;  ->  2800
        bonus -= 1000; // bonus = bonus - 1000; ->  1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);


        // Increment ++ and Decrement --
        int counter = 0;
        counter += 1; //counter = counter + 1;
        counter++;
        counter--;
        ++counter;
        --counter;
        int counter2 = 0;

        System.out.println(counter);
        System.out.println(counter2++); // First EXECUTE then INCREMENT
        System.out.println(++counter2); // First INCREMENT then EXECUTE
        System.out.println(counter2);

    }
}
