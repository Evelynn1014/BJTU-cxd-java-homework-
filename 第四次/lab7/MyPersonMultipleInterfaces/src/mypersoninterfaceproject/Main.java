//20301107 刘佳垚 2021.3.26
package mypersoninterfaceproject;

public class Main {

    public static void main(String[] args) {
        //have a text
        Person ad = new Person(4, "Zoo", "fox");
        System.out.println("The street number is " + ad.getStreetNumber());
        System.out.println("The street name is " + ad.getStreetName());
        System.out.println("The country is " + ad.getCountry());

    }

}
