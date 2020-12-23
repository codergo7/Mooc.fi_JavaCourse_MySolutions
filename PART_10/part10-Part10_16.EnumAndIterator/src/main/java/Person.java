public class Person {
    
    private String name;
    private Education education;

    public Person(String name, Education education) {
        this.name = name;
        this.education = education;
    }
    
    public Education getEducation(){
        
        return this.education;
    }

    public String getName() {
        return name;
    }
    

    @Override
    public String toString() {
        return this.name + ", " + this.education; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
