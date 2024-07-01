package demo;

public class Person {
    String f_name;
    String l_name;
    

    public Person(){
        this.f_name = "John";
        this.l_name = "Doe";       
    }

    public Person(String firstname, String lastname){
        this.f_name = firstname;
        this.l_name = lastname;
    }
}
