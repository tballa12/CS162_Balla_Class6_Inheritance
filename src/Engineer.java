/**
 * Engineer.java class that represents a engineer that inherits from employee.
 * @author Terry Balla
 * @version 1
 */
public class Engineer extends Employee {

    private double bonus = 1000;

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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * Returns the engineer name, salary and motto
     * @return A value of data type String
     */
    public String toString(){
        signON();
        if(bonus == 0) {
            return super.getName() + " $" + super.getBaseSalary() + " " + motto() + vacation(2, 3);
        }
        else {
            return super.getName() + " $" + super.getBaseSalary() + " " + motto() + vacation(2, 3) + "\n" + super.getName() + " has earned a $"
                    + bonus + " sign on bonus.";

        }
    }

    /**
     * Returns a engineer  motto
     * @return A value of data type String
     */
    @Override
    public String motto(){
        return  "To the optimist, the glass is half full.To the pessimist, the glass is half empty.To the engineer, the glass is twice as big as it needs to be.";
    }

    /**
     * method to see if a bonus is earned and sets bonus to correct value
     */

    public void signON(){
        if (super.getYearsOfExperience() >= 10){
            this.bonus = bonus * 10;
        }
        else if(super.getYearsOfExperience() >= 5){
            this.bonus = bonus * 5;

        }
        else{
            this.bonus = 0;
        }
    }
}
