package Lab8.Task1;

public class Task1 {
    public static void main(String[] args) {
        Employee employee  = new Employee ("V", 23 , 1000000);

        System.out.println("Перед:");
        System.out.println(employee.getName() + " " + employee.getAge());

        employee.setName("Johnny Silverhand");
        employee.setAge(34);

        System.out.println("Після:");
        System.out.println(employee.getName() + " " + employee.getAge());
    }
}

