package anonymousinner;

/**
 *
 * @author Shaya
 */
public class Employee {
    public static void main(String[] args) {
        Salary obj =new Salary() {
            @Override
            public void getSalary() {
                 System.out.println("Salary is "+salary);
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               
            }
        };
        obj.getSalary();
    }
    
}
