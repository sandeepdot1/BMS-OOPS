package BMS;

public class User {
    public String name;
    public int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void showUserDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
