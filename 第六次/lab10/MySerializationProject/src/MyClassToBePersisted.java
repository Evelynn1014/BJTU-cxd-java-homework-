//20301107 Liu Jiayao 2021.4.14

import java.io.Serializable;
import java.util.Date;
import java.util.Calendar;
public class MyClassToBePersisted implements Serializable{
    //Profile field, which has the following fields
    //String name
    //int age
    //String hobby
    //School field, which has the following fields
    //String nameOfSchool
    //int yearStarted (this is transient field)
    String name;
    int age;
    String hobby;
    String nameOfSchool;
    transient int yearStarted ;
    public MyClassToBePersisted(String name, int age, String hobby, String nameOfSchool,int yearStarted){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.nameOfSchool = nameOfSchool;
        this.yearStarted = yearStarted;
    }

    public void out() {
        System.out.println("name: " + name + "\nage: " + age + "\nhobby: " + hobby + "\nname of school: " + nameOfSchool + "\nyear stared: " +yearStarted);

    }
}
