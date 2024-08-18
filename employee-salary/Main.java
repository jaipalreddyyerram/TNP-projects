import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int operation = 3, operationInput = 0;
        while(operation != 0){
            System.out.println("1. Full-time employee");
            System.out.println("2. Part-time employee");
            System.out.println("0. Exit");
            operationInput = sc.nextInt();

            if(operationInput!=1 && operationInput!=2 && operationInput!=0){
                System.out.println("Enter correct input");
            } 
            else if(operationInput==1){
                sc.nextLine(); 
                FullTimeEmployee objfull = new FullTimeEmployee();
                System.out.println("Enter name of the employee");
                String nameOfEmployee = sc.nextLine();
                objfull.setEmployeeName(nameOfEmployee);

                double employeeSalary;
                int employeeExtraHours;

                System.out.println("Enter the employee monthly salary");
                employeeSalary = sc.nextDouble();

                System.out.println("Enter the employee extra working hours");
                employeeExtraHours = sc.nextInt();

                objfull.setSalary(employeeSalary, employeeExtraHours);

                System.out.println("Employee Name: " + objfull.getEmpName());
                System.out.println("Employee Salary: " + objfull.getSalary());
            } 
            else if(operationInput==2){
                sc.nextLine(); 
                PartTimeEmployee objpart = new PartTimeEmployee();
                System.out.println("Enter name of the employee");
                String nameOfEmployee = sc.nextLine();
                objpart.setEmployeeName(nameOfEmployee);

                int employeeExtraHours;

                System.out.println("Enter the employee working hours");
                employeeExtraHours = sc.nextInt();

                objpart.setSalary(employeeExtraHours);

                System.out.println("Employee Name: " + objpart.getEmpName());
                System.out.println("Employee Salary: " + objpart.getSalary());
            }
            operation = operationInput;
        }
        sc.close();
    }
}
