public class FullTimeEmployee extends Employee{
    private String Name;
    private double salary;
    private int Hour;
    public void setEmployeeName (String Name){
        this.Name=Name;
    }
    public void setSalary(double salary, int Hour){
        this.salary=salary;
        this.Hour=Hour;
    }
    public String getEmpName(){
        return Name;
    }
    public double getSalary(){
        return salary+(Hour*1000);
    }
}
