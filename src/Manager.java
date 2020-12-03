import java.util.ArrayList;

/**
 * Manager Class
 */
public class Manager extends Employee
{
    private int grade;
    private ArrayList<Employee> deptEmployees;

    /**
     * @param deptEmployees - a collection of Employees in this manager's department. Employees should alrdy be in the employees list
     * @param grade - is an integer between 1 adn 4. managers basic salary depends on this. (default is 1)
     */
    //TODO
    public Manager(String fName, String sName, String ppsNum, int grade)
    {
        super(Employee);

        this.grade = grade;

        deptEmployees = new ArrayList<>();
    }

    public int getGrade() {
        return grade;
    }
    public ArrayList<Employee> getEmployees(){return deptEmployees;}

    //TODO
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void setEmployees(ArrayList<Employee> employees){this.deptEmployees = employees;}

    /** managers salary is caluclated by adding the follwing two valuse: grade & bonus
     * bonus is calculated by adding 1% of each of employees' full salaries
     * @return
     */
    //TODO
    public double calculateSalary()
    {
        return super.calculateSalary() + "\t" + grade + "\n";
    }

    //TODO
    public void addDeptEmployee(Employee employee) {return;}

    //TODO
    public boolean removeEmployee(int num){return num;}

    /**
     * @param manager (use equals from the Employee superclass)
     * @return - true if the current object have the same values in all fields of both objects.
     *          this will include the employees in the Managers dept (use the .equals from ArrayList here)
     *          false otherwise
     */
    //TODO
    public boolean equals(Manager manager){return manager;}

    /** add an employee object to the dept arraylist
     * @return has an index parameter of type int
     *          removes the Employee obejct at the given index
     *          returns true if a sucessful delete takes place
     *          otherwise false
     */
    //TODO
    public int numberInDept(){}

    //TODO
    @Override
    public String toString() {
        return "Manager{" +
                "deptName='" + deptEmployees + '\'' +
                ", grade=" + grade +
                '}';
    }
}
