package Lab3;


public class Teacher  extends Person{
    private String courseName;
    

    
    public Teacher(String firstName, String lastName,String emailAddress, String courseName){
        super(firstName, lastName, emailAddress);
        this.courseName = courseName;
    }
    
    public String getCourseName(){
        return this.courseName;
    }
    
    public void setCourseName(String courseName){
     this.courseName = courseName;   
    }
    
    
}
