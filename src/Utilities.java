import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utilities {
    static boolean onlyContainsNumbers(String text)
    {
        return (text.matches("[0-9]+"));
    }

    static boolean max30Chars(String str)
    {
        return (str.length() <=30);
    }

    static boolean max10Chars(String str)
    {
        return (str.length() <= 10);
    }

    static boolean validIntRange(int start, int end, int num)
    {
        return (num >= start && num <= end);
    }

    static boolean validNonNegative(int num)
    {
        return (num >= 0);
    }

    static boolean validPositive(int num)
    {
        return (num > 0);
    }

    static boolean validEmail(String email)
    {
        return (email.contains("@") && email.contains("."));
    }

    //TODO
    static boolean validPPS(String pps){}

    //TODO
    static boolean validLecturerLevel(int lecturer){}

    //TODO
    static boolean validManagerLevel(int manager){}

    //TODO
    static boolean validAdminLevel(int admin){}

    //TODO
    static boolean validDoubleNonNegative(double DnonNeg){}

    //TODO
    static boolean validIndex(int index, ArrayList){}
    //static boolean validIndex(int num, ArrayList values){return (num >= 0 && num < values.size());}

    //TODO
    public static float getSalaryForLecturerLevel(int lecturer)
    {
        return
    }

    //TODO
    public static float getSalaryForAdminGrade(int admin)
    {
        return
    }
}
