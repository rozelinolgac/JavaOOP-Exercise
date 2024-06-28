package Encapsulation;

public class Encapsulation {

    private String name;
    private int age;
    String surname;

    Encapsulation(String name,int age) {
        if(age>0) {
            this.age=age;

        }
        else {
            this.age=18;
        }
        if(name != null){
            this.name=name;
        }
        else {
            this.name="xxx";
        }


    }

    public void setName(String name){
        if(name != null){
            this.name=name;
        }
        else {
            this.name="xxx";
        }
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age) {
        if(age>0) {
            this.age=age;

        }
        else {
            this.age=18;
        }

    }
    public int getAge(){
        return this.age;
    }


}
