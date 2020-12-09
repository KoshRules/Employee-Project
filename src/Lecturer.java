/**
 * Lecturer Class
 */
public class Lecturer extends Employee
{
    private int level = 1;

    /**
     * @param fName
     * @param sName
     * @param ppsNum
     * @param level
     */
    public Lecturer(String fName, String sName, String ppsNum, int level)
    {
        super(fName, sName, ppsNum);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    /** takes the salary associated with his/her salary level as per:
     * lvl 1 1000
     * lvl 2 2000
     * lvl 3 3000
     * @return double
     * utilities method to calculate
     */
    public double calculateSalary(){return Utilities.getSalaryForLecturerLevel(getLevel());}

    public boolean equals(Lecturer lecturer){return super.equals(lecturer);}


}
