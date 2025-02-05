package goormMission;

public class Java_Employee {

    public static void main(String[] args) {
            Employee employee = new Employee("John",50000);
            Manager Manager = new Manager("Joy",40000,"Boss");

        System.out.println(employee);
        System.out.println(Manager);
    }


    static class Employee {
        private String name; //이름
        private double salary;


        //생성자 생성
        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee [Name: " + name + ", Salary: " + salary + "]";
        }
    }

    static class Manager extends Employee {
        private String position; //직책

        //생성자
        public Manager(String name, double salary, String position) {
            super(name, salary);
            this.position = position;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        @Override
        public String toString() {
            return "Manager [Name: " + getName() + ", Salary: " + getSalary() + ", Position: " + position + "]";
        }
    }

}


