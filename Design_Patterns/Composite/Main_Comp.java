package Design_Patterns.Composite;

import java.util.ArrayList;
import java.util.List;

class Developer implements compInterface {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Developer: " + name);
    }
}

class Manager implements compInterface{
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Manager: " + name);
    }
}

class Department implements compInterface{
    private String name;
    private List<compInterface> people = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(compInterface person) {
        people.add(person);
    }

    public void removeEmployee(compInterface person) {
        people.remove(person);
    }


    public void display() {
        System.out.println("Department: " + name);
        for (compInterface current : people) {
            current.display();
        }
    }
}