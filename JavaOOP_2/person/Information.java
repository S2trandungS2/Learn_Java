package JavaOOP_2.person;

public class Information {

    Person person = new Person("Trần Dung", 27, "Nữ", "Hà Nội", "0986757558");
    public void showInfor(){
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Gender: "+ person.gender);
        System.out.println("Address: " + person.address);
        System.out.println("Phone: " + person.phone);
    }
    public static void main(String[] args) {
        Information infor = new Information();
        infor.showInfor();
    }
}
