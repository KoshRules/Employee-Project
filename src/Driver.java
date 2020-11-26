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
        System.out.println("  1) ");
        System.out.println("  2) ");
        System.out.println("  3) ");
        System.out.println("-------------");
        System.out.println("--------");
        System.out.println("  ) Save to XML");
        System.out.println("  ) Load from XML");
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
                case 20:
                    try {
                        //.save();
                    }catch (Exception e){
                        System.out.println("Error Reading from file: " + e);
                    }
                    break;
                case 21:
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
