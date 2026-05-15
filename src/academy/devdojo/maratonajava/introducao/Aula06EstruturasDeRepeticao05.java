package academy.devdojo.maratonajava.introducao;
// Dado o valor de um carro, descubra em quantas ele pode ser parcelado
// Condição valorParcela >= 1000

public class Aula06EstruturasDeRepeticao05 {
    public static void main (String [] args){
        double totalValue = 30000; //car value
        for(int payment = (int) totalValue; payment >= 1; payment-- ){
            double paymentValue = totalValue / payment;
            if(paymentValue < 1000){
                continue;
            }
            System.out.println("Payment "+ payment + " R$ "+ paymentValue);
        }
    }
}
