package Inheritance;

public class Calisan {
    protected String name;
    public int age;

    public Calisan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String login(){

        return "sisteme giriş yaptı";
    }
}
