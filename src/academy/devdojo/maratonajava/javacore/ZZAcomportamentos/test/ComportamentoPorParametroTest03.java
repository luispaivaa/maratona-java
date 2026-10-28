package academy.devdojo.maratonajava.javacore.ZZAcomportamentos.test;

import academy.devdojo.maratonajava.javacore.ZZAcomportamentos.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZAcomportamentos.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest03 {
    private static List<Car> carList = List.of(new Car("blue", 2016), new Car("red", 2020), new Car("black", 2014));

    public static void main(String[] args) {
        List<Car> blueCars = filter(carList, car -> car.getColor().equals("blue"));
        List<Car> blackCars = filter(carList, car -> car.getColor().equals("black"));
        List<Car> carsByYears = filter(carList, car -> car.getYear() < 2020);
        System.out.println(blackCars);
        System.out.println(blueCars);
        System.out.println(carsByYears);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

}
