package oop.person;

public class PersonMain {
    public static void main(String[] args) {

        Person person = new Person();

        Person person1 = new Person("Sergey", 36);
        Person person2 = new Person("Ivan", 39);

        person1.talk("Tell about yourself");
        person1.move("left");

        person2.talk("Tell about yourself, please ");
        person2.move("right");

        person.toString();
    }
}
