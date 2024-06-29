package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Calisan calisan = new Calisan("Rozelin",26);
        Akademisyen akademisyen = new Akademisyen("Rozi",26);
        Memur memur = new Memur("Roz",26);
        calisan.giris();
        akademisyen.giris();
        memur.giris();

        Calisan calisan1 = new Akademisyen("ROZ",20);  // akademisyen özelliklerini taşıyan bir calışan
        calisan1.giris();
        System.out.println("....................");

        Calisan [] calisanlar = {calisan,akademisyen,memur,calisan1};
        Calisan.listele(calisanlar);  // Çalışsan sınıfından çağırıyoruz.


    }
}
