import java.util.ArrayList;

/**
 * Manager Class
 */
public class Manager extends Employee
{
    private String deptName;
    private int grade;
    private ArrayList<Employee> employees;

    /**
     * @param deptName
     * @param grade
     */
    //TODO
    public Manager(String fName, String sName, String ppsNum, String deptName, int grade)
    {
        super(Employee);

        employees = new ArrayList<>();
    }

    public String getDeptName() {
        return deptName;
    }
    public int getGrade() {
        return grade;
    }
    public ArrayList<Employee> getEmployees(){return employees;}

    //TODO
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    //TODO
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void setEmployees(ArrayList<Employee> employees){this.employees = employees;}

    //TODO
    public double calculateSalary(){super(calculateSalary())}

    //TODO
    public void addDeptEmployee(Employee employee) {return;}

    //TODO
    public boolean removeEmployee(int num){return num;}

    //TODO
    public int numberInDept(){}

    //TODO
    @Override
    public String toString() {
        return "Manager{" +
                "deptName='" + deptName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
