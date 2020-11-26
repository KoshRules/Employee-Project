import java.util.HashMap;

public class School
{
    private String name;
    private HashMap<String, Manager> departments;

    /**
     * @param name max 30 characters
     * @param departments HashMap from dept name to dept manager
     */
    //TODO
    public School(String name)
    {
        if (Utilities.max30Chars(name)) this.name = name;
        else this.name = name.substring(0, 30);

        departments = new HashMap<String, Manager>();
    }

    public String getName() {
        return name;
    }

    //TODO
    public void setName(String name) {
        this.name = name;
    }

    //TODO
    public Manager getManager(String){}

    //TODO
    public boolean addDept(String dept, Manager){}

    //TODO
    public Manager deleteDept(String dept){}

    //TODO
    public String displayManagerName(String managerName){}

    //TODO
    public String displayAllEmployeesFromDept(String allEmployees){}
}
