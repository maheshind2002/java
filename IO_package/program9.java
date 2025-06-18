package IO_package;
import java.io.*;


// Deserialization(Reading the data from the file is call deserialization)
// Serializable interface should be implemented
// transient is use in front of the variable when we dont have to put the vaule or print the deafault value

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
    public String toString(){
        return "empid :" + empid + "\n"+ "empName :"+empName +"\n"+"empSalary :"+ empSalary;
    }
}
public class program9 {
     public static void main(String[] args) throws IOException,ClassNotFoundException
     {
        FileInputStream fis = new FileInputStream("emp.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee emp1 = (Employee) ois.readObject();
        System.out.println(emp1);
        ois.close();
        fis.close();
        
        
     }
}
