package IO_package;
import java.io.*;

// serialization (the process of writting object into the file is callrd serialization)
// Serializable interface is need to be implement other wise it will give you error

class Employee implements Serializable{
    int empid ;
    String empName;
    int empSalary;

    Employee(int empid,String empName,int empSalary){
        this.empid = empid;
        this.empName = empName;
        this.empSalary = empSalary;
    }
    Employee(){
        // deafault constructor
    }

}
public class program8 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("emp.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Employee emp = new Employee(101,"john",60000);
        oos.writeObject(emp);
        System.out.println("Object stored in file");
        oos.close();
        fos.close();
        
    }
}
