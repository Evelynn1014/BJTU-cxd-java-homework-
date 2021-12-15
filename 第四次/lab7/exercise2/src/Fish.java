//20301107 刘佳垚  2021.3.27
//Create the Fish class. Override the Animal methods to specify that fish can't walk and don't have legs.
public class Fish extends Animal implements Pet{
    String name ;
    public Fish(){
        super(0);
    }
    public String getName(){return name;}
    public void setName(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println("Fish eat plant");
    }
    public void walk(){
        System.out.println("Fish cannot walk because fish have no legs");
    }
    @Override
    public void play() {
        System.out.println("Fish play with water");
    }
}
