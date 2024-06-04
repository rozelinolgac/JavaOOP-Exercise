package Classes;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.model = "Audi A3";
        System.out.println(audi.model);
        System.out.println(audi.type);
        audi.type = "Sports";
        System.out.println(audi.type);
        audi.speed = 10;
        System.out.println(audi.model + " Hızı : " + audi.speed);
        audi.increaseSpeed(190);
        audi.printSpeed();


        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.speed = 20;
        System.out.println(bmw.model + " Hızı : " + bmw.speed);
        bmw.decreaseSpeed(1);
        bmw.printSpeed();


        Car mercedes = new Car();
        mercedes.model = "Mercedes";
        mercedes.speed = 30;
        System.out.println(mercedes.model + " Hızı : " + mercedes.speed);

        //****

        CarTwo car1 = new CarTwo("BMW",20);
        System.out.println(car1.model);
        car1.printInfo();

        CarTwo car2 = new CarTwo();
        car2.color="red" ;





    }
}

