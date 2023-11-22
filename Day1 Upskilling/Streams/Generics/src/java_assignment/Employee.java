package java_assignment;

import java.util.HashSet;

public class Employee {
	   private int id;
	    private String name;
	    private int salary;
	    private String department;

	    public Employee(int id, String name,int salary,String department) {
	        super();
	        this.id=id;
	        this.name=name;
	        this.salary=salary;
	        this.department=department;
	    }
	    public void displayDetails() {
	        System.out.println("Id:"+id+"\n"+"Name:"+name+"\n"+"Salary:"+salary+"\n"+"Department:"+department);
	    }
	}
	class Generics05{
		public static void main(String[] args) {
	        Employee employee1=new Employee(546,"Prem",50000,"IT");
	        Employee employee2=new Employee(567,"Das",25000,"NIT");
	        Employee employee3=new Employee(597,"Lee",30000,"Marketing");

	        HashSet<Employee> hashSet=new HashSet<>();
	        hashSet.add(employee1);
	        hashSet.add(employee2);
	        hashSet.add(employee3);

	        hashSet.forEach(n -> n.displayDetails());
	    }
}