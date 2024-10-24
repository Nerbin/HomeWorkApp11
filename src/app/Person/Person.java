package app.Person;

public class Person {
    public static String name = "";
    public static int age = 0;
    public static String profession = "";


    public Person(String name, int age, String profession) {
        this.name=name;
        this.age=age;
        this.profession=profession;
    }

    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }
    public static void displayInfo(){
        System.out.printf("\nІм'я: %s, Вік: %d , Професія: %s ",name,age,profession);
    }
}


