//20301107 刘佳垚 2021.3.26

package mypersoninterfaceproject;
//Write AddressImpl class that implements AddressInterface
public class AddressImpl implements AddressInterface{
    int num;
    String name;
    String country;
    //implements
    public int getStreetNumber(){return num;}
    public void setStreetNumber(int streetNumber){num = streetNumber;}
    public String getStreetName(){return name;}
    public void setStreetName(String streetName){name = streetName;}
    public String getCountry(){return country;}
    public void setCountry(String country){this.country = country;}
}
