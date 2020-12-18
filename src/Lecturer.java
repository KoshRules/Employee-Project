/**
 * Lecturer Class
 */
public class Lecturer extends Employee
{
    private int level = 1;

    /**
     * @param fName same as before
     * @param sName same as before
     * @param ppsNum same as before
     * @param level this is the lecturer's salary level. it should be between 1 and 3(inclusive).
     */
    public Lecturer(String fName, String sName, String ppsNum, int level)
    {
        super(fName, sName, ppsNum);

        if (Utilities.validLecturerLevel(level))
        this.level = level;
        else
            this.level = 1;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (Utilities.validLecturerLevel(level)) this.level = level;
    }

    /** takes the salary associated with his/her salary level as per:
     * lvl 1 1000
     * lvl 2 2000
     * lvl 3 3000
     * @return double
     * utilities method to calculate
     */
    public double calculateSalary(){return Utilities.getSalaryForLecturerLevel(getLevel());}

    /**
     * @param lecturer
     * @return true if the current object have the same values in the four fields of both objects
     *          false otherwise
     * (hint) use equals from Employee superclass
     */
    public boolean equals(Lecturer lecturer){return (this.level == lecturer.level && super.equals(lecturer));}

    @Override
    public String toString()
    {
        return "Lecturer{" + super.toString() +
                "level=" + level + '}';
    }
}
