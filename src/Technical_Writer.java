/**
 * Technical_Writer.java class that represents a Technical Writer that inherits from employee.
 * @author Terry Balla
 * @version 1
 */
public class Technical_Writer extends Employee {

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

    /**
     * Returns the technical writer name, salary and motto
     * @return A value of data type String
     */
    public String toString(){
        return super.getName() + " $" +  super.getBaseSalary() + " " + motto() + vacation(1,2);
    }
    /**
     * Returns a Technical writer motto
     * @return A value of data type String
     */
    public String motto(){
        return  "You can always edit a bad page. You can’t edit a blank page.";
    }


}
