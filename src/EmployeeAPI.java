import java.util.ArrayList;
import java.util.Collection;

public class EmployeeAPI
{
    private ArrayList<Employee> employees;
    private EmployeeAPI employeeAPI;

    public EmployeeAPI()
    {
        employees = new ArrayList<>();
    }


    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    //TODO
    public void addEmployee(Employee employee)
    {
        //get the employee information;
        //add it to employee arraylist;
    }

    //TODO
    public boolean addEmployeeToDepartment(int x, int y)
    {
        //find the employee;
        //add the employee to department arraylist;
        //show department list with employee added to it;
        return true;
    }

    public Employee getEmployee(int index)
    {
        Employee employee = null;
        if (Utilities.validIndex(index, employees))
        {
            employee = employees.get(index);
        }
        return employee;
    }

    public Employee removeEmployee(int index)
    {
        if (Utilities.validIndex(index, employees))
        {
            Employee employee = employees.get(index);
            employees.remove(index);
            return employee;
        }
        return null;
    }

    public int numberOfEmployees() {return employees.size();}

    public String listEmployees()
    {
        if (employees.size() <= 0)
        {
            return "No employees in list";
        }else
        {
            String listOfEmployees = "";
            for (int i = 0; i < employees.size(); i++)
            {
                listOfEmployees = listOfEmployees + i + ": " + employees.get(i) + "\n";
            }
            return listOfEmployees;
        }
    }

    /**
     * @param manager builds and returns a list of employees(and their associated index num in the arraylist)
     *                by their manager. each on a new line
     * @return this manager does not exist; if the manager doesnt exist
     *          This manager has no employees in their department; if the manager exists, but has no employees
     *                                                              in their department
     */
    //TODO
    public String listManagerEmployees(Manager manager) {return null;}

    /**
     * builds and returns a list of employees who are managers
     * @return No Managers in the system; if there are no anagers in the system
     */
    //TODO
    public String listManagerEmployees()
    {
        return null;
    }

    /**
     * @param index searches through the employees collection for the employee with the supplied second name
     * @return the position of the employee; if employee exists
     * otherwise return -1
     */
    //TODO
    //public int searchEmployees(String index) {return null;}

    //TODO
    //public double totalSalariesOwed() {return null;}

    //TODO
    //public double avgSalariesOwed() {return null;}

    /**
     * calculates the employee with the highest (total) salary
     * @return employee object of that employee
     *          null; if no employees
     */
    //TODO
    public Employee employeeWithHighestPay() {return null;}

    /**
     * sorts the employees object in ascending alphabetical order (firstname) of employees
     */
    //TODO
    public void sortEmployeesByFirstName(){Collection.sort(employees);}

    /**
     * sorts the employees object in ascending alphabetical order (secondname) of employees
     */
    //TODO
    public void sortEmployeesBySecondName(){
        Collection.sort(employees);
    }

    //TODO
    private void swapEmployees(ArrayList<Employee> employees, int x, int y)
    {
        //get list of all employees
        //take first name index num to be swapped
        //take second name index num and switch with first index num
        //display updated employee list
    }

    //TODO
    public void load() {}

    //TODO
    public void save() {}
}
