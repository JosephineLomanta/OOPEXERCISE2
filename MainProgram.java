public class MainProgram {      // Main Class
    public static void main(String[] args) {
        Family family;     // super class object
        Mother mother = new Mother("Taylor Grey", 153, "Teacher");      // subclass object
        Father father = new Father("Francis Grey", 175, "Manager");     // another subclass object
        
        family = mother;
        // calling the accessors from the super class object
        System.out.println(family.makeGreeting() + " " + "My name is " + family.getName() + ".");
        System.out.println("My height is " + family.getHeight() + "cm" + " And I work as a " + mother.getOccupation() + ".");
        System.out.println("");
         
        family = father;
        System.out.println(family.makeGreeting() + " " + "My name is " + family.getName() + ".");
        System.out.println("My height is " + family.getHeight() + "cm" + " And I work as a " + father.getWork() + ".");
    }  
}
