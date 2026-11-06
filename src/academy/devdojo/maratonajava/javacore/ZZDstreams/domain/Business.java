package academy.devdojo.maratonajava.javacore.ZZDstreams.domain;

import java.util.ArrayList;
import java.util.List;

public class Business {
    private String name;
    private List<Person> employees = new ArrayList<>();

    public Business(String name, List<Person> employees) {
        this.name = name;
        this.employees = employees;
    }


    @Override
    public String toString() {
        return "Business{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Person> employees) {
        this.employees = employees;
    }
}
