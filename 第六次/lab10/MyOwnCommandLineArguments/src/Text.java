//20301107 Liu Jiayao 2021.4.14
public class Text {
    public static void main(String[] args){

      MyOwnCommandLineArguments data = new  MyOwnCommandLineArguments(args);
      data.check();
      System.out.println("The average age is" + data.avg());

    }
}
