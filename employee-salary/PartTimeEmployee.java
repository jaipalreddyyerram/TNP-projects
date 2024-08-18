public class PartTimeEmployee extends Employee{
    private String Name;
    private int Hour;
    public void setEmployeeName (String Name){
        this.Name=Name;
    }
    public void setSalary(int Hour){
        this.Hour=Hour;
    }
    public String getEmpName(){
        return Name;
    }
    public double getSalary(){
        return (Hour*1000);
    }
}
