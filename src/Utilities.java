import java.util.ArrayList;

public class Utilities {
    static boolean onlyContainsNumbers(String text) {
        return (text.matches("[0-9]+[A-Za-z]"));
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

    static boolean validEmail(String email) {
        return (email.contains("@") && email.contains("."));
    }

    static boolean validPPS(String pps) {
        if (pps != null && pps.isBlank()) return false;
        if (pps.length() == 9) {
            String digits = pps.substring(0, 6);
            String chars = pps.substring(7, 8);
            if (Utilities.onlyContainsNumbers(digits) == false) return false;
            if (Utilities.onlyContainsCharacters(chars) == false) return false;
            return true;
        }
        return false;

    }

    static float getSalaryForLecturerLevel(int lecturerLevel)
    {
        int Blvl = 1000;
        return lecturerLevel * Blvl;
    }

    static float getSalaryForAdminGrade(int adminGrade)
    {
        int Bgrade = 700;
        return adminGrade * Bgrade;
    }

    static double GetOnePercentOfSalary(double salary)
    {
        return (salary / 100) * 1;
    }

    //TODO
    static boolean validLecturerLevel(int lecturer) {
        return false;

    }

    //TODO
    static boolean validManagerLevel(int manager){
        return false;

    }

    //TODO
    static boolean validAdminLevel(int admin){
        return false;

    }

    //TODO
    static boolean validDoubleNonNegative(double DnonNeg){
        return false;

    }

    //TODO
    static boolean validIndex(int index, ArrayList list){

        return false;
    }
}
