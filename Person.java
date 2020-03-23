package Lab3;

import Lab3.EmailRecipient;

public class Person implements EmailRecipient{
    private String firstName;
    private String lastName;
    private String emailAddress;
    
    public Person(String _firstName, String _lastName, String emailAddress) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.emailAddress = emailAddress;
    }
    
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String setFirstName(String firstName){
        this.firstName = firstName;
        return null;
    }
    
    public String setLastName(String lastName){
     this.lastName = lastName;
     return null ;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName;
    }

    @Override
    public String getEmailAddress() {
        return this.emailAddress;
    }
    

    
}

