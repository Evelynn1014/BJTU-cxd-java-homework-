//20301107 刘佳垚  2021.3.27
public class TestAnimals {

    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        System.out.println("Animal a is a fish ");
        Fish b  = (Fish) a;
        System.out.println("Animal a's name is " + b.getName());
        a.eat();
        a.walk();


        b.play();
        System.out.println();

        System.out.println("Animal c is a cat ");
        System.out.println("Animal c's name is " + c.getName());
        c.walk();
        c.eat();
        c.play();
        System.out.println();

        System.out.println("Animal d is a fish ");
        System.out.println("Animal d's name is " + d.getName());
        d.play();
        d.walk();
        d.eat();
        System.out.println();

        System.out.println("Animal e is a spider ");
        e.walk();
        e.eat();
        System.out.println();

        System.out.println("Animal p is a cat");
        Cat l = (Cat) p;
        System.out.println("Animal p's name is " + l.getName());
        l.walk();
        l.eat();
        l.play();
        System.out.println();
    }
}
