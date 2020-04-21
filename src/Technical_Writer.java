/**
 * Technical_Writer.java class that represents a Technical Writer that inherits from employee.
 * @author Terry Balla
 * @version 1
 */
public class Technical_Writer extends Employee {

    private int vacationL = 1;
    private int vacationH = 2;

    /**
    * Parameterless constructor
    */
    public Technical_Writer ()
    {
        super();
    }

    /**
     * Parameterless constructor
     *@param name A variable of type String
     *@param baseSalary A variable of type double
     *@param yearsOfExperience A variable of type int
     *@param yearsAtCompany A variable of type int
     */
    public Technical_Writer(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany) {
        super(name,baseSalary,yearsOfExperience,yearsAtCompany);
            }

    public int getVacationL() {
        return vacationL;
    }

    public void setVacationL(int vacationL) {
        this.vacationL = vacationL;
    }

    public int getVacationH() {
        return vacationH;
    }

    public void setVacationH(int vacationH) {
        this.vacationH = vacationH;
    }

    /**
     * Returns the technical writer name, salary and motto
     * @return A value of data type String
     */
    public String toString(){
        return super.getName() + " $ " +  super.getBaseSalary() + " " + motto() + vacation();
    }
    /**
     * Returns a Technical writer motto
     * @return A value of data type String
     */
    public String motto(){
        return  "You can always edit a bad page. You can’t edit a blank page.";
    }

    /**
     * Returns vacation time as string
     * @return A value of type String
     */
    public String vacation(){
        if (super.getYearsAtCompany() >= 2) {
            return "\nYou have " + 7 * getVacationH() + " days of vacation time";
        }
        else if (super.getYearsAtCompany() == 1) {
            return "\nYou have " + 7 * getVacationL() + " days of vacation time";
        }
        else {
            return "\nYou have " + 0 + " days of vacation time";
        }


    }
}
