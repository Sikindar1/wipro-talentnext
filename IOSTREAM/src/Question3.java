import java.io.*;
import java.util.Date;


class Employee implements Serializable {
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

   
    public Employee() {}

    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String toString() {
        return "Name: " + name + "\nDOB: " + dateOfBirth + "\nDepartment: " + department +
               "\nDesignation: " + designation + "\nSalary: " + salary;
    }
}

public class Question3 {
    public static void main(String[] args) {
        
        Employee emp = new Employee("Sikindar", new Date(95, 6, 15), "IT", "Software Engineer", 75000);

       
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data"))) {
            out.writeObject(emp);
            System.out.println("Employee object serialized successfully.");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("data"))) {
            Employee deserializedEmp = (Employee) in.readObject();
            System.out.println("\nEmployee object deserialized:\n");
            System.out.println(deserializedEmp);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(" Deserialization error: " + e.getMessage());
        }
    }
}
