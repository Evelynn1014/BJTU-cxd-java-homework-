//20301107 刘佳垚  2021.3.27
import java.awt.font.TextAttribute;

public class Spider extends Animal{
    //The Spider class extends the Animal class.
    //Define a default constructor that calls the superclass constructor to specify that all spiders have eight legs.
    //Implement the eat method.
    public Spider () {
        super(8);
    }
    public void eat() {
        System.out.println("Spider eat bugs");
    }
}
