package Polymorphism;

public class Akademisyen extends Calisan {

    Akademisyen(String name,int age){
        super(name,age);
    }

    public void giris(){
        System.out.println("Akademisyen giriş yaptı");
    }
}
