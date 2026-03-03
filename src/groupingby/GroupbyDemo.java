package groupingby;
import java.util.*;
import java.util.stream.Collectors;

public class GroupbyDemo
{
    public static void main(String[] args)
    {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 3000),
                new Employee("Bob", "IT", 4000),
                new Employee("Charlie", "HR", 3500),
                new Employee("Dave", "IT", 4500),
                new Employee("Eve", "Finance", 5000)
        );

        // Group employees by department
        Map<String, List<Employee>> grpemp = employees.stream()
                                                      .collect(Collectors.groupingBy(employee -> employee.department));


        // Print the grouped employees
        grpemp.forEach((department, employeeList) ->
        {
            System.out.println("Department: " + department);
            employeeList.forEach(System.out::println);
        });


        // Partition numbers into even and odd
        Map<Boolean, List<Employee>> partitionlist = employees.stream().collect(Collectors
                                                                     .partitioningBy(employee -> employee.getSalary()>4000));

        System.out.println("Partition numbers more 4000");
        partitionlist.get(true).forEach(System.out::println);

        System.out.println("Partition numbers less 4000");
        partitionlist.get(false).forEach(System.out::println);




    }
}
