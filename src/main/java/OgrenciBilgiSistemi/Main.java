package OgrenciBilgiSistemi;

/*
Course Sınıfı Özellikleri :
Nitelikler : name,code,prefix,note,Teacher
Metotlar : Course() , addTeacher() , printTeacher()

Teacher Sınıfı Özellikleri :
Nitelikler : name,mpno,branch
Metotlar : Teacher()

Student Sınıfı Özellikleri :
Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()


Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin.
Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.
Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :
Fizik Ortalaması : (90 * 0.20) + (60* 0.80);

Course.prefix = teacher.

 */
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ayşe", 555, "TRK");
        Teacher t2 = new Teacher("Ali", 666, "MAT");
        Teacher t3 = new Teacher("Zeynep", 777, "FEN");

        Course c1 = new Course("Türkçe",111,"TRK");
        Course c2 = new Course("Matematik",222,"MAT");
        Course c3 = new Course("Fen Bilgisi",333,"FEN");

        // Öğretmenleri kurslara ekleme işlemi :

        c1.addTeacher(t1);
        c2.addTeacher(t2);
        c3.addTeacher(t3);

        Student student1 = new Student("Rozelin",5,c1,c2,c3);
        student1.addBulkExamNote(20,40,80,0,0,100);
        student1.isPass();

        Student student2 = new Student("Fırat",5,c1,c2,c3);
        student2.addBulkExamNote(100,50,23,100,54,35);
        student2.isPass();

    }
}
