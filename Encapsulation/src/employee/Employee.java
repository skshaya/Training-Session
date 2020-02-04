package employee;

/**
 *
 * @author Shaya
 */
class Employee {
    private int eNo;
    private String name;
    private int salary;
    private String companyName="Virtusa";

    public void seteNo(int eNo) {
        this.eNo = eNo;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setsalary(int salary){
        this.salary=salary;
    }
    
    public int geteNo() {
        return eNo;
    }
    public String getname(){
        return name;
    }
    public int getsalary(){
        return salary;
    } 
    public String getcompanyName(){
        return companyName;
    }
}
