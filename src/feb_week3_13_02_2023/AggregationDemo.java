package feb_week3_13_02_2023;


class Employee {
    String name;
    int age;
    Address address;

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
    public class AggregationDemo {
        public static void main(String[] args) {
            // independent entity added first
            Address address1=new Address(12,101,431110,"shakultala","yerwada","maharashtra","India");
            //Dependent Entity
            Employee employee=new Employee("sujan",23,address1);
        }
    }

