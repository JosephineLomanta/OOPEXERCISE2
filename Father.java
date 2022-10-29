public class Father extends Family{     // another subclass of Family superclass
    private String work;
    
    public Father(String name, double height, String work) {
        // call the superclass constructor and pass the name and height parameters
        super(name, height);
        this.work = work;
    }

    @Override
    public String makeGreeting() {   // overriding the superclass method "makeGreeting"
        return "Hi Guys! ";
    }
    
    public String getWork() {
        return work;
    }
    
    public void setWork(String work) {
        this.work = work;
    }
}