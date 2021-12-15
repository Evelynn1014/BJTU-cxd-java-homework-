v//20301107 刘佳垚 2021.3.19
import javax.swing.JOptionPane;

public class JavaArray {
    public static void main(String[] args) {

        String[] names = new String[3];
        // use JOptionPane.showInputDialog to get name
        names[0] = JOptionPane.showInputDialog("enter full names of one of your family numbers");
        names[1] = JOptionPane.showInputDialog("enter full names of another of your family numbers");
        names[2] = JOptionPane.showInputDialog("enter full names of another of your family numbers");
        //split form the space to find the first name
        String[] nameArrayForPerson1 = names[0].split(" ");
        String[] nameArrayForPerson2 = names[1].split(" ");
        String[] nameArrayForPerson3 = names[2].split(" ");

        // Get the lengths of strings using length() instance (non-static) method
        int lengthOfFirstNameOfPerson1 = nameArrayForPerson1[0].length();
        int lengthOfFirstNameOfPerson2 = nameArrayForPerson2[0].length();
        int lengthOfFirstNameOfPerson3 = nameArrayForPerson3[0].length();

        // Compare the lengths of the first names between person1 and person2
        //分类讨论
        //先讨论前两个人，在讨论两个人中名长的人的和第三个人
        //第一个人名字比第二个人长
        //名长相同只显示一个人
        if (lengthOfFirstNameOfPerson1 >= lengthOfFirstNameOfPerson2){
            if(lengthOfFirstNameOfPerson1 >= lengthOfFirstNameOfPerson3) {
                System.out.println(names[0] + " has the longest first name");
            }else if (lengthOfFirstNameOfPerson1 < lengthOfFirstNameOfPerson3) {
                System.out.println(names[2] + " has the longest first name");
            }
        }
        if (lengthOfFirstNameOfPerson1 < lengthOfFirstNameOfPerson2) {
            if(lengthOfFirstNameOfPerson2 >= lengthOfFirstNameOfPerson3) {
                System.out.println(names[1] + " has the longest first name");
            }else if (lengthOfFirstNameOfPerson2 < lengthOfFirstNameOfPerson3) {
                System.out.println(names[2] + " has the longest first name");
            }
        }

        //以下为完整版，可显示名长相等的全部结果
        /*if (lengthOfFirstNameOfPerson1 > lengthOfFirstNameOfPerson2) {
            if (lengthOfFirstNameOfPerson1 > lengthOfFirstNameOfPerson3) {
                System.out.println(names[0] + " has the longest first name");
            } else if (lengthOfFirstNameOfPerson1 == lengthOfFirstNameOfPerson3) {
                System.out.println(names[0] + " and " + names[2] + " both have the longest first name");
            } else {
                System.out.println(names[2] + " has the longest first name");
            }
        }
        //二人名长相等
        if (lengthOfFirstNameOfPerson1 == lengthOfFirstNameOfPerson2) {
            if (lengthOfFirstNameOfPerson1 == lengthOfFirstNameOfPerson3) {
                System.out.println(names[0] + " " + names[1] + " " + names[2] + " are all have the longest first name");
            } else if (lengthOfFirstNameOfPerson1 > lengthOfFirstNameOfPerson3) {
                System.out.println(names[0] + " and " + names[1] + " both have the longest first name");
            } else if (lengthOfFirstNameOfPerson1 < lengthOfFirstNameOfPerson3) {
                System.out.println(names[2] + " has the longest first name");
            }
        }
        //第二个人名字比第一个人长

        if (lengthOfFirstNameOfPerson1 < lengthOfFirstNameOfPerson2){
            if (lengthOfFirstNameOfPerson2 > lengthOfFirstNameOfPerson3) {
                System.out.println(names[1] + " has the longest first name");
            } else if (lengthOfFirstNameOfPerson1 == lengthOfFirstNameOfPerson3) {
                System.out.println(names[1] + " and" + names[2] + " both have the longest first name");
            } else {
                System.out.println(names[2] + " has the longest first name");
            }
        }*/


    }
}
