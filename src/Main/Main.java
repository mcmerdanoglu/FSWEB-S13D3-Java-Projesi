package Main;

import Answers.Person;
import Answers.Wall;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person person1 = new Person("Jim","Dough",18,
                "developer",200, false, true);

        Person person2 = new Person("John", "Doe", 20);

        System.out.println("Person Info---------------");
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Age: " + person2.getAge());
        System.out.println("isTeen: " + person1.isTeen());
        System.out.println("isTeen: " + person2.isTeen());


        Wall wall = new Wall(5,4);

        System.out.println("Wall Info---------------");
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}