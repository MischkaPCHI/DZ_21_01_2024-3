import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Дан List<Employee>. У каждого Employee задано имя и стаж работы в фирме.
        Руководство решило премировать N сотрудников, которые работают дольше всех.
        Учтите, что если например, нужно премировать 3 сотрудника,
        но при этом в компании 5 старейших сотрудников с одинаковым стажем,
        необходимо премировать всех пятерых. Или например, есть 2 старейших сотрудника со стажем 10 лет,
        и еще 5 со стажем 9 лет - премируем всех семерых.
        Необходимо написать метод, который вернет новый List<Employee> премируемых сотрудников.
        (* Если нет идей, подсказка на следующей странице)
         */

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jack",7));
        employeeList.add(new Employee("Oleg",9));
        employeeList.add(new Employee("Lena",5));
        employeeList.add(new Employee("Chember",10));
        employeeList.add(new Employee("Raf",2));

        System.out.println(employeeList);

        System.out.println(EmployeeAwards.employeeAwards(employeeList,6));
    }
}