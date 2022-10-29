public class Mother extends Family {    // subclass of Family superclass
    private String occupation;
    
    public Mother(String name, double height, String occupation) {
        // call the superclass constructor and pass the name and height parameters
        super (name, height);
        this.occupation = occupation;
    }

    @Override
    public String makeGreeting() {  // overriding the superclass method "makeGreeting"
        return "Annyeong Netizens! ";
    }
    
    public String getOccupation() {
        return occupation;
    }
    
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}