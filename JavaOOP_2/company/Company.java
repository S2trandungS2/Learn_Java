package JavaOOP_2.company;

import JavaOOP_2.person.Person;

public class Company {
    Person person = new Person("Trần Dung", 27, "Nữ", "Hà Nội", "0986757558");

    public void showInfor(){
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Gender: "+ person.gender);
        System.out.println("Address: " + person.getAddress());
        System.out.println("Phone: " + person.getPhone());
    }

    public static void main(String[] args) {
        Company company = new Company();
        company.showInfor();
    }

}
