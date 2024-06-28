package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation("roz",26);
        System.out.print(encapsulation.getName()+"  ");
        System.out.println(encapsulation.getAge());

        encapsulation.setAge(0);
        encapsulation.setName("rozelin");
        System.out.print(encapsulation.getName()+"  ");
        System.out.println(encapsulation.getAge());

        Encapsulation encapsulation1 = new Encapsulation(null,-9);
        System.out.print(encapsulation1.getName()+"  ");
        System.out.print(encapsulation1.getAge()+"  ");
        encapsulation1.surname="Olgac";
        System.out.println("Public olan değer : "+encapsulation1.surname);

    }
}
