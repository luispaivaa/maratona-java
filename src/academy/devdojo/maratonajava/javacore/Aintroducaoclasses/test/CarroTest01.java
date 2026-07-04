package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Celta";
        carro1.marca = "Chevrolet";
        carro1.ano = 2007;

        carro2.nome = "Fusca";
        carro2.marca = "Volkswagem";
        carro2.ano = 1994;

        //carro1 = carro2;

        System.out.println("Nome: " + carro1.nome + " " + "Marca: " + carro1.marca + " " + "Ano: " + carro1.ano);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Nome: " + carro2.nome + " " + "Marca: " + carro2.marca + " " + "Ano: " + carro2.ano);

    }
}
