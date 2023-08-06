package employeemanagementsystem;
import java.util.*;
import java.io.*;

class Delete {
    public Delete(int idtodelete) {
        try {
            File inputFile = new File("resources/EmployeeData.txt");
            File tempFile = new File("resources/temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;
            boolean deleted = false;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);

                if (id==idtodelete) {
                    deleted = true;
                    continue; 
                }

                writer.write(line);
                writer.newLine();
            }

            writer.close();
            reader.close();

            if (!deleted) {
                System.out.println("Record not found for deletion ");
                tempFile.delete(); 
            } else {
                inputFile.delete();
                tempFile.renameTo(inputFile);
                System.out.println("Record deleted successfully ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employee id to delete details: ");
        int idtodelete=sc.nextInt();
        new Delete(idtodelete);
        sc.close();
    }
}

