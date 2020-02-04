package memberclass;

/**
 *
 * @author Shaya
 */
public class Employee {

    public void display() {
        
    class ProtectedEmployee{
    private int eNo;
    private String name;
    
    public void seteNo(int eno){
    this.eNo=eno;
    }
    public void setname(String name){
    this.name=name;
    }
    public int geteNo(){
    return eNo;
    }
    public String getname(){
    return name;
    }
    }
    
    ProtectedEmployee ls= new ProtectedEmployee();
    ls.seteNo(1);
    ls.setname("Shaya");
        System.out.println(ls.geteNo()+" "+ls.getname());
    }
    
}
