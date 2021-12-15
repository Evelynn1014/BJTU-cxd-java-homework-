//20301107 刘佳垚  2021.3.27
import java.awt.font.TextAttribute;
public class Cat extends Animal implements Pet{
    //This class must include a String attribute to store the name of the pet.
    //Define a constructor that takes one String parameter that specifies the cat's name. This constructor must also call the superclass constructor to specify that all cats have four legs.
    //Define another constructor that takes no parameters. Have this constructor call the previous constructor (using the this keyword) and pass an empty string as the argument.
    //Implement the Pet interface methods.
    //Implement the eat method.
    String name;
    public Cat(String name){
        super(4);
        this.name = name;
    }
    public Cat(){
        this(null);

    }
    public String getName(){return name;}
    public void setName(String name){
        this.name = name;
    }
    public void play(){
        System.out.println("Cat Play! MIU MIU MIU");
    }
    public void eat(){
        System.out.println("Eat fish");
    }
}
