
public class Employee {

    private String firstName = null;
    private String lastName  = null;
    private int    birthYear = 0;


    public Employee(String first,String last,int    year   ) {

        firstName = first;
        lastName  = last;
        birthYear = year;
    }
    void display(){System.out.println("Firstname:"+firstName+"\n "+"LastName:"+lastName+"\n"+"Birth Year:"+birthYear);}
 public static void main(String args[]){
	 Employee employee = new Employee("Vasavi", "Suggala", 1994);
	 employee.display();
	 Employee employee2 = new Employee("VasaviSuggala", "Suggala", 1994);
	 employee2.display();
 }

}