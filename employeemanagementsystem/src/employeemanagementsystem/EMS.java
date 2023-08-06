package employeemanagementsystem;
import java.util.*;

public class EMS {
    public void ems() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a CRUD operation (create, read, update, delete):");
        String operation = sc.next().toLowerCase();

        switch (operation) {
            case "c":
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
                break;
            case "r":
            	 Read r = new Read();
                 r.read();
                break;
            case "u":
            	 
                 System.out.println("Enter the employee ID you want to update:");
                 int idtofind = sc.nextInt();
                 sc.nextLine(); 

                 System.out.println("Enter the new name:");
                 String newname = sc.nextLine();

                 System.out.println("Enter the new age:");
                 int newage = sc.nextInt();

                 System.out.println("Enter the new salary:");
                 long newsalary = sc.nextLong();

                 Update u = new Update();
                 u.update(idtofind, newname, newage, newsalary);

                 
                break;
            case "d":
            	
                 System.out.println("enter employee id to delete details: ");
                 int idtodelete=sc.nextInt();
                 new Delete(idtodelete);
                break;
            default:
                System.out.println("Invalid operation");
        }
        sc.close();
    }

    public static void main(String[] args) {
        EMS e = new EMS();
        e.ems();
    }
}

