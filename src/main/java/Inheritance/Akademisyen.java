package Inheritance;

public class Akademisyen extends Calisan{
     String departman;

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    Akademisyen(String name, int age, String departman){
         super(name,age); // Ana sınıfının constructorunu çağırmak için
         this.departman=departman;
     }


}

