public class NewClassOOP {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        person.age = 50;
        person.speak();
        person.sayHello();

        Person person1 = new Person();
        person1.name = "David";
        person1.age = 35;
        person1.speak();
    }
}

class Person {
    String name;
    int age;

    void speak(){
        System.out.println("Меня зовут "+ name +", "+ "мой возраст " + age + " лет");
    }

    void sayHello(){
        System.out.println("hello");
    }
}
