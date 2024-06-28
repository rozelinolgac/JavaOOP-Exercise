package Inheritance;

public class Main {
    public static void main(String[] args) {
        Akademisyen akademisyen = new Akademisyen(null,18,"Ceng");
        akademisyen.name="Rozelin";
        akademisyen.age=26;
        System.out.print(akademisyen.name+" isimli "+akademisyen.age+" yaşında olan "
        +akademisyen.departman+" departmanında çalışan personel ");
        akademisyen.login();
        akademisyen.setDepartman("mat");
        System.out.println(akademisyen.getDepartman());
    }
}
