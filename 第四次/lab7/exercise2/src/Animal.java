//20301107 刘佳垚  2021.3.27
public abstract class Animal {
    //Declare a protected integer attribute called legs, which records the number of legs for this animal.
    //Define a protected constructor that initializes the legs attribute.
    //Declare an abstract method eat.
    //Declare a concrete method walk that prints out something about how the animals walks (include the number of legs).
    protected int legs;
    protected Animal(int legs){
        this.legs = legs;
    }
    public void walk(){
        System.out.println("The animal walk using " + legs + " legs"); }
    public abstract void eat();
}