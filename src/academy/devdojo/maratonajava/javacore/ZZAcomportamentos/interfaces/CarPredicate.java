package academy.devdojo.maratonajava.javacore.ZZAcomportamentos.interfaces;

import academy.devdojo.maratonajava.javacore.ZZAcomportamentos.dominio.Car;

@FunctionalInterface //interface funcional
public interface CarPredicate {
    public boolean test(Car car);
    // (parametro) -> <expressao>
    // (Car car) -> car.getColor().equals("green");
}
