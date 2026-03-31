interface Employee {
    void calculateSalary();
    void displayDetails();
}
class FullTimeEmployee implements Employee {
    String name;
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public void calculateSalary() {
        System.out.println("Salary: " + monthlySalary);
    }

    public void displayDetails() {
        System.out.println("Full-Time Employee: " + name);
    }
}
class PartTimeEmployee implements Employee{
    String name;
    double hourlyrate;
    int hoursWorked;
    PartTimeEmployee(String name,double hourlyrate,int hoursWorked){
        this.name=name;
        this.hourlyrate=hourlyrate;
        this.hoursWorked=hoursWorked;}
    public void calculateSalary(){
        System.out.println("Salary: "+hourlyrate*hoursWorked);
        
    }
    public void displayDetails(){
        System.out.println("Part-Time Employee: "+name);
    }
}
public class employeedetails{
    public static void main(String[] args){
        FullTimeEmployee fte= new FullTimeEmployee("Alice",5000);
        PartTimeEmployee pte= new PartTimeEmployee("Bob",20,80);
        fte.displayDetails();
        fte.calculateSalary();
        pte.displayDetails();
        pte.calculateSalary();

    }
    
}