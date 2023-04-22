package BMS;

public class DemoUser extends User{
    public DemoUser(String name, int age) {
        // no banking services provided
        // just for demonstration of banking services
        super(name, age);
    }
    public void showUserDetails() {
        System.out.println("******Demo User*******");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
