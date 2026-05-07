package academy.devdojo.maratonajava.introducao;
// Donate if wage > 5000
//(condition) ? true : false
public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double wage = 7000;

//        String donateMensage = "I'll donate 500 dollars to DevDojo";
//        String notDonateMensage = "I can't donate yet, but one day i will";
//
//        String result = wage > 5000 ? donateMensage : notDonateMensage;
//        System.out.println(result);

        //or

        String result;
        result = wage > 5000 ? "I'll donate 500 dollars to DevDojo" : "I can't donate yet, but one day i will";
        System.out.println(result);


    }
}
