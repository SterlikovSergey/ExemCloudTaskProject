public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    public void move(String side){
        if (side.equalsIgnoreCase("left")){
            System.out.println("My name is " + this.fullName + " and i moving on left");
        } else if(side.equalsIgnoreCase("right")){
            System.out.println("My name is " + this.fullName + " and i moving on right");
        } else {
            System.out.println("I do not move");
        }
    }
    public void talk(String talk){
        System.out.println(talk);
        System.out.println("Talking " + this.fullName + ":");
        System.out.println("Hello, my name is " + this.fullName + " and my age " + this.age);
    }
}
