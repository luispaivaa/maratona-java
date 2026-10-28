package academy.devdojo.maratonajava.javacore.ZZAcomportamentos.test;

import academy.devdojo.maratonajava.javacore.ZZAcomportamentos.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> carList = List.of(new Car("blue", 2016), new Car("red", 2020), new Car("black", 2014));

    public static void main(String[] args) {
        System.out.println(filterRedCar(carList));
        System.out.println(filterCarByColor(carList, "blue"));
        System.out.println(filterCarByYearBefore(carList, 2020));
    }

    private static List<Car> filterRedCar(List<Car> cars){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("red")){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterCarByYearBefore(List<Car> cars, int year) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
