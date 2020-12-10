/**
 * AdminWorker Class
 */
public class AdminWorker extends Employee
{
    private int grade = 1;
    private float FIXED_BONUS = 200;

    public AdminWorker(String fName, String sName, String ppsNum, int grade)
    {
        super(fName, sName, ppsNum);

        this.grade = grade;

    }

    public int getGrade() {
        return grade;
    }
    public float getFIXED_BONUS() {
        return FIXED_BONUS;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void setFIXED_BONUS(float FIXED_BONUS) {
        this.FIXED_BONUS = FIXED_BONUS;
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
    public double calculateSalary()
    {
        return Utilities.getSalaryForAdminGrade(getGrade()) + getFIXED_BONUS();
    }

    /**
     * @return true if current object have the same values in all fields of both objects
     *          false otherwise
     * use the equals from Employee superclass
     */
    public boolean equals(AdminWorker adminWorker) {
        return super.equals(adminWorker);
    }

    @Override
    public String toString() {
        return "AdminWorker{" +
                "grade=" + grade +
                '}';
    }
}
