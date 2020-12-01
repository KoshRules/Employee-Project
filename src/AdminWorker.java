/**
 * AdminWorker Class
 */
public class AdminWorker extends Employee
{
    private int grade;

    //TODO
    public AdminWorker(String fName, String sName, String ppsNum, int grade)
    {
        super(Employee);
    }

    /** method takes the salary calculated by adding
     * fixed bonus for all Admin workers (200)
     * salary grade
     *          grade 1 700
     *          grade 2 1400
     *          grade 3 2100
     *          grade 4 2800
     *          grade 5 3500
     *          grade 6 4200
     *          grade 7 4900
     *  same grade/salary values as managers, use utilites method aswell
     * @return double
     */
    public double calculateSalary(){return "";}

    public int getGrade() {
        return grade;
    }

    //TODO
    public void setGrade(int grade) {
        this.grade = grade;
    }

    //TODO
    @Override
    public String toString() {
        return "AdminWorker{" +
                "grade=" + grade +
                '}';
    }
}
