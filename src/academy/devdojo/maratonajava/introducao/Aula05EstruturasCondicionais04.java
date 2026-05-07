package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
         double annualWage = 54400;
         double firstRange = 9.70 / 100;
         double secondRange = 37.35 / 100;
         double thirdRange = 49.50 / 100;
         double taxValue;

         if(annualWage <= 34712){
             taxValue = annualWage * firstRange;
         }else if(annualWage >= 34713 && annualWage <= 68507){
             taxValue = annualWage * secondRange;
         }else {
             taxValue = annualWage * thirdRange;
         }
        System.out.println(taxValue);
    }
}
