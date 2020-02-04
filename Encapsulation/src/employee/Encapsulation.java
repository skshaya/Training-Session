package employee;

/**
 *
 * @author Shaya
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee1.seteNo(1);
        employee1.setname("Shaya");
        employee1.setsalary(25000);
        employee2.seteNo(2);
        employee2.setsalary(31000);
        employee2.setname("Ashan");
        System.out.println(employee1.geteNo()+" "+employee1.getname()+" "+employee1.getsalary()+" "+employee1.getcompanyName());
        System.out.println(employee2.geteNo()+" "+employee2.getname()+" "+employee2.getsalary()+" "+employee2.getcompanyName());
    }
    
}
