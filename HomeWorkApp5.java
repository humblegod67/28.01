package lesson1;
import java.util.ArrayList;
import java.util.List;

public class HomeWorkApp5 {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public HomeWorkApp5 (String name, String position, String email, String phoneNumber, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        List<HomeWorkApp5> employees = new ArrayList<>();
        employees.add(new HomeWorkApp5("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30));
        employees.add(new HomeWorkApp5("Petrov Petr", "Manager", "ppetr@mailbox.com", "892312313", 40000, 44));
        employees.add(new HomeWorkApp5("Sidorov Sidor", "Salesman", "ssidor@mailbox.com", "892312314", 25000, 25));
        employees.add(new HomeWorkApp5("Kozlov Kozel", "Accountant", "kkozel@mailbox.com", "892312315", 35000, 35));
        employees.add(new HomeWorkApp5("Kuznetsov Kuzel", "Driver", "kkuzel@mailbox.com", "892312316", 20000, 20));

        System.out.println("Employees older than 40 years:");
        for (HomeWorkApp5 employee : employees) {
            if (employee.age > 40) {
                employee.printInfo();
                System.out.println();
            }
        }
    }
}