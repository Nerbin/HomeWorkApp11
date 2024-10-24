package app;

import app.Person.Person;

public class HomeWork11 {
    public static void main(String[] args) {
        Person person1 = new Person("John",30,"Інженер");
        Person person2 = new Person("Mary",25,"Вчитель");
        Person person3 = new Person("Bob",35,"Лікар");

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        Person person4 = new Person("Alice",28,"Архітектор");

        System.out.println("");

        person4.displayInfo();
        person4.setProfession("Дизайнер");
        System.out.print("\nОновлена інформація про Alice:");
        person4.displayInfo();

    }

}
