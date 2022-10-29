public abstract class Family {      // Super class
    protected String name;
    protected double height;
    
    // constructor
    public Family(String name, double height) {
    this.name = name;
    this.height = height;
    }
    
    
    // this method will be overriden by its subclasses
    public abstract String makeGreeting();
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
}
