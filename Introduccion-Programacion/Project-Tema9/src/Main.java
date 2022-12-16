public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.age = 15;
        customer.name = "Juan Montero";
        customer.phone = "978302594";
        customer.credit = 1500;

        System.out.println(customer.age);
        System.out.println(customer.name);
        System.out.println(customer.phone);
        System.out.println(customer.credit);

        Employee employee = new Employee();
        employee.age = 25;
        employee.name = "Pol Castillo";
        employee.phone = "978302594";
        employee.salary = 2500;

        System.out.println(employee.age);
        System.out.println(employee.name);
        System.out.println(employee.phone);
        System.out.println(employee.salary);
    }
}

class Person {
    int age;
    String name;
    String phone;
}

class Customer extends Person {
   float credit;
}

class Employee extends Person {
   float salary;
}