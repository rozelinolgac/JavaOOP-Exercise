package Interface;

public class Main {
    public static void main(String[] args) {
        Akademisyen akademisyen = new Akademisyen();
        akademisyen.printName();

        // anonim sınıf ile nesne üretilmesi : Normalde interfacelerden nesne üretilmez
        Icalisan a = new Icalisan() {
            @Override
            public void printName() {
                System.out.println("interface nesnesi");
            }
        };
        a.printName();
    }
}
