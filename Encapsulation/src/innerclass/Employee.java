package innerclass;

/**
 *
 * @author Shaya
 */
 class Employee {
     
    protected class ProtectedEmployee{//Inner class can declared private, public,protected but private inner class not access other classes 
        
    private int eId;
    private String name;
    
    public void seteId(int eid){
    this.eId=eid;
    }
    public void setname(String name){
    this.name=name;
    }
    
    public int geteId(){
    return eId;
    }
    public String getname(){ 
    return name;
    }
  
    }
    public void display(){
    ProtectedEmployee pe = new ProtectedEmployee();
    pe.seteId(1);
    pe.setname("Shaya");
        System.out.println(pe.geteId()+" "+pe.getname());
    }
}
