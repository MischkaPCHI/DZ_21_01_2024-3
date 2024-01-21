public class Employee {
    private String name;
    private int yearsInWork;

    public Employee(String name, int yearsInWork) {
        this.name = name;
        this.yearsInWork = yearsInWork;
    }

    public String getName() {
        return name;
    }

    public int getYearsInWork() {
        return yearsInWork;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearsInWork=" + yearsInWork +
                '}';
    }
}
