package OopPrinciples;

// Encapsulation is the process of wrapping code and data together into a single unit.
// It is a protective barrier that keeps the data safe within the class and accessible only through the class's methods.
// It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.
// Key features: 
// 1. Data Hiding: Prevents unauthorized access to internal data by using private access modifiers
// 2. Controlled Access: Provide access to data using public mehtods (eg. getters and setters)
public class Encapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("John");
        obj.setAge(25);
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
