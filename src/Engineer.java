/**
 * Engineer.java class that represents a engineer that inherits from employee.
 * @author Terry Balla
 * @version 1
 */
public class Engineer extends Employee {

    private int vacationL = 2;
    private int vacationH = 3;
    private double bonus ;

    /**
     * Parameterless constructor
     */
    public Engineer ()
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
    public Engineer(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany) {
        super(name,1.5 * baseSalary,yearsOfExperience,yearsAtCompany);
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
     * Returns the engineer name, salary and motto
     * @return A value of data type String
     */
    public String toString(){
        return super.getName() + " $ " +  super.getBaseSalary() + " " + motto() + vacation();
    }
    /**
     * Returns a engineer  motto
     * @return A value of data type String
     */
    public String motto(){
        return  "To the optimist, the glass is half full.To the pessimist, the glass is half empty.To the engineer, the glass is twice as big as it needs to be.";
    }

    /**
     * Returns a engineer motto
     * @return A value of data type String
     */
    public String vacation(){
        signON();
        if (super.getYearsAtCompany() >= 2) {

            if (bonus > 0){
                return "\nYou have " + 7 * getVacationH() + " days of vacation time and your sign on bonus was $" + bonus;
            }
            else {
                return "\nYou have " + 7 * getVacationH() + " days of vacation time";
            }}
        else if(super.getYearsAtCompany() == 1) {
            if (bonus > 0){
                return "\nYou have " + 7 * getVacationL() + " days of vacation time and your sign on bonus was $" + bonus;
            }
            else {
                return "\nYou have " + 7 * getVacationL() + " days of vacation time";
            }

        }
        else {
            if (bonus > 0) {
                return "\nYour sign on bonus was $" + bonus;
            }
            else{
                return "\nYou have 0 vacation days";
            }
        }


    }

    public void signON(){
        if (super.getYearsOfExperience() >= 10){
            this.bonus = 10000;
        }
        else if(super.getYearsOfExperience() >= 5){
            this.bonus = 5000;

        }
        else{
            this.bonus = 0.0;
        }
    }
}
