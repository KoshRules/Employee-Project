import java.util.ArrayList;

/**
 * Manager Class
 */
public class Manager extends Employee
{
    private int grade;
    private ArrayList<Employee> deptEmployees;

    /**
     * deptEmployees - a collection of Employees in this manager's department. Employees should alrdy be in the employees list
     * @param grade - is an integer between 1 adn 4. managers basic salary depends on this. (default is 1)
     */
    //TODO
    public Manager(String fName, String sName, String ppsNum, int grade)
    {
        super(fName, sName, ppsNum);

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
        double onePercentfromEmployees = 0;
        for (Employee emp: getEmployees() ) {
            onePercentfromEmployees += Utilities.GetOnePercentOfSalary(emp.calculateSalary());
        }
        return Utilities.getSalaryForAdminGrade(this.getGrade()) + onePercentfromEmployees;
    }


    /**
     * @param employee specifies employee being added to department
     * nothing is returned
     */
    public void addDeptEmployee(Employee employee) {
        getEmployees().add(employee);
    }


    /** Remove an employee from department
     * @num isan int index from which point in the ArrayList the employee will be removed
     * returns true if a sucessful delete takes place
     * otherwise false
     */
     public boolean removeEmployee(int num){
        if (getEmployees().size()<num) return false;
        getEmployees().remove(num);
        return true;
    }

    /**
     * @param manager (use equals from the Employee superclass)
     * @return - true if the current object have the same values in all fields of both objects.
     *          this will include the employees in the Managers dept (use the .equals from ArrayList here)
     *          false otherwise
     */
    public boolean equals(Manager manager){return super.equals(manager);}


    //TODO
    public int numberInDept(){
        return getEmployees().size();
    }

    //TODO
    @Override
    public String toString() {
        return "Manager{" +
                "deptName='" + deptEmployees + '\'' +
                ", grade=" + grade +
                '}';
    }
}
