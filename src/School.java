import java.util.HashMap;

public class School
{
    private String name;
    private HashMap<String, Manager> departments;

    /**
     * @param name max 30 characters
     * departments HashMap from dept name to dept manager
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
    public Manager getManager(String dept){ return null;}

    //TODO
    public boolean addDept(String dept, Manager manager){
        if (departments.containsKey(dept) == false) {
            departments.put(dept, manager);
            return true;
        }
        return false;
    }

    //TODO
    public Manager deleteDept(String dept){
        if (departments.containsKey(dept)) {
            Manager manager = departments.get(dept);
            departments.remove(manager);
            return manager;
        }
        else
            return null;
    }

    //TODO
    public String displayManagerName(String managerName){ return "";}

    //TODO
    public String displayAllEmployeesFromDept(String allEmployees){

       return "";

    }
}
