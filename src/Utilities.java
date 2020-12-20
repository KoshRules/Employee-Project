import java.util.ArrayList;

public class Utilities {
    static boolean onlyContainsNumbers(String text) {
        return (text.matches("[0-9-A-Za-z]"));
    }

    static boolean onlyContainsCharacters(String text) {
        return (text.matches("[A-Za-z]+"));
    }

    static boolean max30Chars(String str) {
        return (str.length() <= 30);
    }

    static boolean max10Chars(String str) {
        return (str.length() <= 10);
    }

    static boolean validIntRange(int start, int end, int num) {
        return (num >= start && num <= end);
    }

    static boolean validNonNegative(int num) {
        return (num >= 0);
    }

    static boolean validPositive(int num) {
        return (num > 0);
    }

    static boolean validPPS(String pps)
    {
        if (pps.matches("^\\d{7}[a-zA-Z]{2}$"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static float getSalaryForLecturerLevel(int lecturerLevel)
    {
        int Blvl = 1000;
        if (Utilities.validLecturerLevel(lecturerLevel))
        {
            return lecturerLevel * Blvl;
        }
        else return  -1;
    }

    static float getSalaryForAdminGrade(int adminGrade)
    {
        int Bgrade = 700;
        return adminGrade * Bgrade;
    }

    static double GetOnePercentOfSalary(double salary)
    {
        return (salary / 100);
    }

    static boolean validManagerLevel(int manager){
        return (manager >= 1 && manager <=7);

    }

    static boolean validLecturerLevel(int lecturer)
    {
        return (lecturer >= 1 && lecturer <=3);
    }

    static boolean validAdminLevel(int admin){
        return (admin >= 1 && admin <=7);

    }

    static boolean validDoubleNonNegative(double DnonNeg)
    {
        return (DnonNeg >= 0);
    }

    static boolean validIndex(int num, ArrayList values){

        return (num >= 0 && num < values.size());
    }
}
