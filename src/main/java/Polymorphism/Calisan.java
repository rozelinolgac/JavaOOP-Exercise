package Polymorphism;

public class Calisan {
    String name;
    int age;

    public Calisan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void giris(){
        System.out.println("Çalışan giriş yaptı");
    }

    public static void listele(Calisan [] array) {
        for (Calisan c : array) {
            c.giris();
        }
    }

}
