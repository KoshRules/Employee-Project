import java.util.ArrayList;
import java.util.Scanner;

public class Driver
{
    private Scanner input = new Scanner(System.in);
    //private ArrayList<> ;

    public static void main(String[] args) {new Driver();}

    public Driver()
    {
        = new ArrayList<>();
        runMenu();
    }

    private int mainMenu()
    {
        System.out.println("Menu");
        System.out.println("-------------");
        System.out.println("  1) Add an employee (Manager)");
        System.out.println("  2) Add an employee (Lecturer)");
        System.out.println("  3) Add an employee (Admin worker)");
        System.out.println("  4) Add an existing employee to a department");
        System.out.println("  5) Delete an employee");
        System.out.println("-------------");
        System.out.println("  6) Add a department to a school");
        System.out.println("  7) Delete a department from a school");
        System.out.println("  8) Find the name of the manager of a given department");
        System.out.println("  9) List all the employees in a given department");
        System.out.println("-------------");
        System.out.println("  10) Find the salary of a given employee");
        System.out.println("  11) Find the total of the salaries owed to all the employees");
        System.out.println("  12) Find the average of the salaries owed to all the employees");
        System.out.println("  13) Print the employee with the highest pay");
        System.out.println("-------------");
        System.out.println("  14) List all employees in the company in ascending alphabetical order (first name)");
        System.out.println("  15) List all employees in the company in ascending alphabetical order (second name)");
        System.out.println("-------------");
        System.out.println("  16) Search the system for an employee by second name");
        System.out.println("  17) Search the system for an employee within a given manager's department");
        System.out.println("--------");
        System.out.println("  18) Save to XML");
        System.out.println("  19) Load from XML");
        System.out.println("-------");
        System.out.println("  0) Exit");
        System.out.println("==>>");
        int option = input.nextInt();
        return option;
    }

    private void runMenu () {
        int option = mainMenu();
        while (option != 0) {

            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 18:
                    try {
                        //.save();
                    }catch (Exception e){
                        System.out.println("Error Reading from file: " + e);
                    }
                    break;
                case 19:
                    try {
                        //.load();
                    }catch (Exception e) {
                        System.out.println("Error Writing to file: " + e);
                    }
                    break;

                default:
                    System.out.println("Invalid option entered: " + option);
                    break;
            }
            System.out.println("\nPress any key to continue...");
            input.nextLine();
            option = mainMenu();
        }
        System.out.println("Exiting... bye");
        System.exit(0);
    }

    //option ??
    //Method;
    //TODO
    /*
        public void save?? ()
        {
            XStream xstream = new XStream(new DomDriver());
            ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("??.xml"));
            out.writeObject(??);
            out.close();
        }

        //option ??
        //Method;
        private void load?? ()
        {
            XStream xstream = new XStream(new DomDriver());
            ObjectInputStream is = xstream.createObjectInputStream(new FileReader("??.xml"));
            ?? = (ArrayList<??>) is.readObject();
            is.close();
        }

     */
}
