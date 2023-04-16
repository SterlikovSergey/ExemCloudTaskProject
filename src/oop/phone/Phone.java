public class Phone {
    private String number;
    private String model;
    private double weight;

    public String getNumber() {
        return number;
    }

    public Phone(String number, String model, double weight) {
        this(number,model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void receiveCall(String name){
        System.out.println("Calling " + name);
    }
    public void receiveCall(String name, String number){
        System.out.println("name is incoming a caller :" + name + " number incoming caller: " + number);
        System.out.println("Your number is phone: " + this.number);
    }
    public void sendMessage(String message,String ...number){
        System.out.println("message: " + message + " sending on numbers: ");
        for(String i: number){
            System.out.println(i);
        }
        System.out.println("sender number: " + this.number);
    }
}
