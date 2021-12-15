//20301107 Liu Jiayao 2021.4.14
public class MyOwnCommandLineArguments {
    String[] data;
    //Receive the ages of the all your family members (between 3 to 6 members) as command line arguments in the format as following (name then age)
    //Monica 12 Daniel 34 Shelley 23
    public MyOwnCommandLineArguments(String[] data) {
         this.data = data;
    }

    public void check() {
       if ((data.length <= 5)||(data.length >= 13)){
           System.out.println("Data error! Please enter again");
           System.exit(1);
       }
    }

    public double avg() {
        double temp = 0;
        int i = data.length/2;
        for(int t = 1; t <= data.length; t +=2 ) {
            temp += Double.parseDouble(data[t]);
        }
        return temp/i;
    }

}
