/**
 * Project_Manager.java class that represents a Project_Manager that inherits from employee.
 * @author Terry Balla
 * @version 1
 */
public class Project_Manager extends Employee {

    private int stock = 100;

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


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Returns the Project_Manager name, salary and motto
     * @return A value of data type String
     */
    @Override
    public String toString(){
        stockTotal();
        if(super.getYearsAtCompany() == 0) {
            return super.getName() + " $" + super.getBaseSalary() + " " + motto() + vacation(3,4);
        }else{
            return super.getName() + " $" + super.getBaseSalary() + " " + motto() + vacation(3,4) + "\n" + super.getName() + " has " + stock
                    + " stock";
        }

    }

    /**
     * Returns a Project_Manager  motto
     * @return A value of data type String
     */
    @Override
    public String motto(){
        return  "There is nothing so useless as doing efficiently that which should not be done at all.";
    }

    /**
     * adds stock total
     */
    public void stockTotal(){
        stock = stock * super.getYearsAtCompany();
    }

}
