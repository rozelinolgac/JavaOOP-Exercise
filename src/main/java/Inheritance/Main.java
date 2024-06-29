package Inheritance;

public class Main {
    public static void main(String[] args) {
        Akademisyen akademisyen = new Akademisyen(null,18,"Ceng");
        Calisan calisan = new Calisan("roz",26);
        akademisyen.name="Rozelin";
        akademisyen.age=26;
        System.out.print(akademisyen.name+" isimli "+akademisyen.age+" yaşında olan "
        +akademisyen.departman+" departmanında çalışan personel ");

        akademisyen.setDepartman("mat");
        System.out.println(akademisyen.getDepartman());

        System.out.println(akademisyen.login());




    }
}
