import java.util.ArrayList;
import java.util.List;

public class EmployeeAwards {
    public static List<Employee> employeeAwards(List<Employee> employees,int yearsInWork){
        List<Employee> result = new ArrayList<>();

        for (Employee employee : employees){
            if (employee.getYearsInWork() >= yearsInWork){
                result.add(employee);
            }
        }
        return result;
    }
}
