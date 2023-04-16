public class PhoneMain {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+375257406888","iPhone",100.5);
        Phone phone2 = new Phone("+375447888155","Samsung",115.8);
        Phone phone3 = new Phone("+375293706888","Nokia",50.41);

        phone1.toString();
        phone2.toString();
        phone3.toString();

        phone1.receiveCall("Valentina");
        phone1.getNumber();

        phone2.receiveCall("Sergey");
        phone2.getNumber();

        phone3.receiveCall("Aleksandra");
        phone3.getNumber();

        phone1.receiveCall("Daughter","+375293706888");
        phone2.receiveCall("Husband","+375257406888");
        phone3.receiveCall("Mam","+375447888155");

        phone1.sendMessage("Hello gays!!!","+375447888155","+375293706888","+375257770499");
        phone2.sendMessage("Hello favorite friends!!!","+375257770499","+375293706888","+375257406888");
        phone3.sendMessage("Hello my family!!!","+375257406888","+375257770499","+375447888155");

        



    }
}
