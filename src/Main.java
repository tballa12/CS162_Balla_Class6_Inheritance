public class Main {

    public static void main(String[] args) {
	 Employee rick = new Employee("rick",2000.50,2,1);
	 System.out.println(rick);
	 rick.setName("Haji");
	 rick.setBaseSalary(5000000.33);
	 System.out.println(rick);
	 Technical_Writer sam = new Technical_Writer("Sam",3000,4,1);
	 System.out.println(sam);
	 Engineer tom = new Engineer("Tom",3000,5,0);
	 Engineer john = new Engineer("John",3000,10,10);
	 Project_Manager nick = new Project_Manager("Paul",3000,2,2);
	 System.out.println(nick);
	 nick.setName("Nick");
	 nick.setYearsAtCompany(14);
	 System.out.println(nick);

	 System.out.println(tom);
	 System.out.println(john);
    }
}
