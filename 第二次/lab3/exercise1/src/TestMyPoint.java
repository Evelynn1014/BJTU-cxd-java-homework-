//20301107 刘佳垚 2021.3.12
public class TestMyPoint {

    public static void main(String[] args) {
        MyPoint start = new MyPoint();
        MyPoint end = new MyPoint();
        start.x = 10;
        start.y = 10;
        end.x = 20;
        end.y = 30;
        System.out.println("Start point is " + start);
        System.out.println("End point is " + end);
        //Declare a new variable of type MyPoint and call it stray.
        //Assign stray the reference value of the existing variable end.
        MyPoint stary = end;
        System.out.println("\nStary point is " + stary);
        System.out.println("End point is " + end);

        stary.x = 47;
        stary.y = 25;
        //start has not changed which indicates that it is independent of the other two variables.
        System.out.println("\nStary point is " + stary);
        System.out.println("End point is " + end);

    }

}
