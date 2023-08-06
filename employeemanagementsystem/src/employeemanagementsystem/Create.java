package employeemanagementsystem;
import java.io.*;
import java.util.*;
public class Create {
	private static final String filepath = "resources/EmployeeData.txt";
	 public Create(int id,String name, int age, long salary) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath, true))) {
	            writer.write(id + "," + name + "," + age + "," + salary);
	            writer.newLine();
	            System.out.println("Record created successfully.");
	        
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	 public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter employee id: ");
		 int id=sc.nextInt();
		 System.out.println("enter employee name: ");
		 String name=sc.next();
		 System.out.println("enter employee age: ");
		 int age=sc.nextInt();
		 System.out.println("enter employee salary: ");
		 long salary=sc.nextLong();
		 new Create(id,name,age,salary);
		 sc.close();
	 }
}
