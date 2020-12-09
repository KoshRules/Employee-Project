import java.util.Scanner;

public class ScannerInput {

    public static int readNextInt(String prompt) {
        do {
            var scanner = new Scanner(System.in);
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.next());
            }
            catch (NumberFormatException e) {
                System.err.println("\tEnter a number please.");
            }
        }  while (true);
    }

    public static double readNextDouble(String prompt) {
        do {
            var scanner = new Scanner(System.in);
            try{
                System.out.print(prompt);
                return Double.parseDouble(scanner.next());
            }
            catch (NumberFormatException e) {
                System.err.println("\tEnter a number please.");
            }
        }  while (true);
    }

    public static String readNextLine(String prompt) {
        do {
            var scanner = new Scanner(System.in);
            try {
                System.out.print(prompt);
                return "";
                //return String.parseString(scanner.nextLine());
            }
            catch (Exception e) {
                System.err.println("\tEnter a string please.");
            }
        }  while (true);
    }

    public static char readNextChar(String prompt) {
        do {
            var scanner = new Scanner(System.in);
            try {
                System.out.print(prompt);
                return 'a';//return scanner.nextLine();
            }
            catch (Exception e) {
                System.err.println("\tEnter a string please.");
            }
        }  while (true);
    }
}
