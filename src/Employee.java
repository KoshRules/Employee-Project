/**
 *  Employee Class
 */

public abstract class Employee
{
    private String firstName;
    private String secondName;
    private String ppsNumber;

    /**
     * @param fName this must be max 10 characters
     * @param sName this must be max 10 characters
     * @param ppsNum this must be 7 digits followed by 2 alphabetic characters
     */
    public Employee(String fName, String sName, String ppsNum)
    {
        if (Utilities.max10Chars(fName)) this.firstName = fName;
        else this.firstName = "invalid format";

        if (Utilities.max10Chars(sName)) this.secondName = sName;
        else this.secondName = "invalid format";

        if (Utilities.validPPS(ppsNum)) this.ppsNumber = ppsNum;
        else  this.ppsNumber = "invalid format";
    }

    /**
     * Getters and Setters
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fName) {
        if (Utilities.max10Chars(fName)) this.firstName = fName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String sName) {
        if (Utilities.max10Chars(sName)) this.secondName = secondName;
    }

    public String getPpsNumber() {
        return ppsNumber;
    }

    public void setPpsNumber(String ppsNum) {if (Utilities.validPPS(ppsNum)) this.ppsNumber = ppsNumber; }

    public boolean equals(Employee employee){
        return (this.firstName.equals(employee.getFirstName()) &&
                this.secondName.equals(employee.getSecondName()) &&
                this.ppsNumber.equals(employee.getPpsNumber()) );
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", ppsNumber='" + ppsNumber + '\'' +
                '}';
    }

    //TODO
    /** promise any concrete subclass of Employee will implement this method
     * @return will calculate the total salary uncluding bonuses
     */
    abstract double calculateSalary();

}
