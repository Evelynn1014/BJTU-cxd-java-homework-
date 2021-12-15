//20301107 刘佳垚 2021.3.13
public class Text {

    public static void main(String[] args) {

        boolean word1 = new NestedLoops().isSubString("cat", "The cat in the hat.");
        System.out.println("isSubString(\"cat\", \"The cat in the hat.\") is " + word1);

        boolean word2 = new NestedLoops().isSubString("bat", "The cat in the hat.");
        System.out.println("isSubString(\"bat\", \"The cat in the hat.\") is " + word2);
        //verify that the boundary conditions
        boolean word3 = new NestedLoops().isSubString("The", "The cat in the hat.");
        System.out.println("isSubString(\"The\", \"The cat in the hat.\" is " + word3);

        boolean word4 = new NestedLoops().isSubString("hat", "The cat in the hat.");
        System.out.println("isSubString(\"hat\", \"The cat in the hat.\" is " + word4);
    }
}
