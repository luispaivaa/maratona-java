package academy.devdojo.maratonajava.javacore.ZZAcomportamentos.test;

import academy.devdojo.maratonajava.javacore.ZZAcomportamentos.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZAcomportamentos.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest04 {
    private static List<Car> carList = List.of(new Car("blue", 2016), new Car("red", 2020), new Car("black", 2014));

    public static void main(String[] args) {
        List<Car> blueCars = filter(carList, car -> car.getColor().equals("blue"));
        List<Car> blackCars = filter(carList, car -> car.getColor().equals("black"));
        List<Car> carsByYears = filter(carList, car -> car.getYear() < 2020);
        System.out.println(blackCars);
        System.out.println(blueCars);
        System.out.println(carsByYears);

        List<Integer> numbers = List.of(10,22,34,13,18,49,11,12,4,1,7);
        List<Integer> numerosPares = filter(numbers, num -> num % 2 == 0);
        System.out.println(numerosPares);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element)){
                filteredList.add(element);
            }
        }
        return filteredList;
    }

}
