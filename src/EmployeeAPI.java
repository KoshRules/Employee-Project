import java.util.ArrayList;

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

    //TODO
    public String listManagerEmployees(Manager manager) {return null;}

    //TODO
    public String listManagerEmployees() {return null;}

    //TODO
    //public int searchEmployees(String index) {return null;}

    //TODO
    //public double totalSalariesOwed() {return null;}

    //TODO
    //public double avgSalariesOwed() {return null;}

    //TODO
    public Employee employeeWithHighestPay() {return null;}

    //TODO
    public void sortEmployeesByFirstName() {}

    //TODO
    public void sortEmployeesBySecondName() {}

    //TODO
    private void swapEmployees(ArrayList<Employee> employees, int x, int y) {}

    //TODO
    public void load() {}

    //TODO
    public void save() {}
}
