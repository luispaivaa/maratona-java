package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main (String[] args){
        int age = 20;
        boolean isAuthorizedBuyAlcoholicBeverages = age >= 18;

        if (isAuthorizedBuyAlcoholicBeverages){
            System.out.println("Authorized to buy alcoholic beverages");
        }else{
            System.out.println("Is NOT authorized to buy alcoholic averages");
        }

        if(!isAuthorizedBuyAlcoholicBeverages){
            System.out.println("Isn't authorized to buy alcoholic averages");
        }

        boolean c = false;
        if(c == true){
            System.out.println("Dentro de algo que NUNCA deve ser feito");
        }

        System.out.println("Out if");
    }
}
