public class Main {

    public static void main(String[] args) {
	 Employee rick = new Employee("rick",1000,2,1);
	 System.out.println(rick);
	 rick.setName("Haji");
	 rick.setBaseSalary(5000000);
	 System.out.println(rick);
	 Technical_Writer sam = new Technical_Writer("Sam",1000,4,0);
	 Technical_Writer mike = new Technical_Writer("Mike",1000,4,1);
	 Technical_Writer tim = new Technical_Writer("Tim",1000,4,2);
	 System.out.println(sam);
	 System.out.println(mike);
	 System.out.println(tim);
	 Engineer tom = new Engineer("Tom",1000,0,0);
	 Engineer john = new Engineer("John",1000,5,1);
	 Engineer larry = new Engineer("Larry",1000,10,2);
	 System.out.println(tom);
	 System.out.println(john);
	 System.out.println(larry);
	 Engineer gates = new Engineer("B. Gates",10000000,40,0);
	 gates.setBonus(100000);
	 System.out.println(gates);
	 Project_Manager nick = new Project_Manager("Paul",3000,2,0);
	 Project_Manager bob = new Project_Manager("Bob",3000,2,2);
	 System.out.println(nick);
	 System.out.println(bob);
	 Project_Manager musk = new Project_Manager("E. Musk",3000,2,12);
	 musk.setStock(12000);
	 System.out.println(musk);

    }
}
