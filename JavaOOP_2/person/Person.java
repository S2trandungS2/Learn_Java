package JavaOOP_2.person;
public class Person {
    public String name;
    public int age;
    public String gender;
    String address;
    String phone;

    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }

    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }


}
