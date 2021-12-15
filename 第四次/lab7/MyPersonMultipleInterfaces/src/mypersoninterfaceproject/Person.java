//20301107 刘佳垚 2021.3.26
package mypersoninterfaceproject;

//Make the Person class to implement MyOwnInterface.
public class Person extends AddressImpl implements MyOwnInterface {
    AddressImpl newAdd = new AddressImpl();

    public Person(int num, String country, String name) {
        setStreetName(name);
        newAdd.name = getStreetName();
        setCountry(country);
        newAdd.country = getCountry();
        setStreetNumber(num);
        newAdd.num = getStreetNumber();

    }

    public AddressInterface getAddress() {
        return newAdd;

    }


}
