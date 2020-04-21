/**
 * Project_Manager.java class that represents a Project_Manager that inherits from employee.
 * @author Terry Balla
 * @version 1
 */
public class Project_Manager extends Employee {

    private int vacationL = 3;
    private int vacationH = 4;
    private int stock ;

    /**
     * Parameterless constructor
     */
    public Project_Manager ()
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
    public Project_Manager(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany) {
        super(name,2 * baseSalary,yearsOfExperience,yearsAtCompany);
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
     * Returns the Project_Manager name, salary and motto
     * @return A value of data type String
     */
    public String toString(){
        return super.getName() + " $ " +  super.getBaseSalary() + " " + motto() + vacation();
    }
    /**
     * Returns a Project_Manager  motto
     * @return A value of data type String
     */
    @Override
    public String motto(){
        return  "There is nothing so useless as doing efficiently that which should not be done at all.";
    }

    public String vacation(){
        if (super.getYearsAtCompany() >= 2) {
            return "\nYou have " + 7 * getVacationH() + " days of vacation time and you have " + stock + " in company stock";
        }
        else if (super.getYearsAtCompany() == 1) {
            return "\nYou have " + 7 * getVacationL() + " days of vacation time and you have " + stock + " in company stock";
        }
        else {
            return "\nYou have " + 0 + " days of vacation time";
        }



    }

    public void stockTotal(){
        stock = 100 * super.getYearsAtCompany();
    }

}
