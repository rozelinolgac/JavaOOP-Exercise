package Classes;

public class CarTwo {
    String type;
    String model;
    String color="Blue";
    int speed;

    CarTwo(String model,int speed) {
        this.model=model;   // kullanımda nitelik ile parametre aynı olmalı
        this.speed=speed;   // this > sınıfa ait değişken demek
    }
    CarTwo(){
        System.out.println("Parametresiz Constructor");
    }

    void printInfo(){
        System.out.println(this.model);
        System.out.println(this.color);
    }

}
