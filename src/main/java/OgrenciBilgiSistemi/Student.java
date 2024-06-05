package OgrenciBilgiSistemi;

public class Student {
    Course courseTurkce, courseMatamatik, courseFen;
    String studentName;
    int studentNumber;
    int studentClass;
    double avarage;
    double turkceOrtalamasi, matematikOrtalamasi, fenOrtalamasi;


    Student(String studentName, int studentClass, Course courseTurkce, Course courseMatamatik, Course courseFen) {
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.courseTurkce = courseTurkce;
        this.courseMatamatik = courseMatamatik;
        this.courseFen = courseFen;
    }

    void addBulkExamNote(int turkceOralNote, int matOralNote, int fenOralNote, int turkceExamNote, int matExamNote, int fenExamNote) {


        // Sözlü notları :
        if (turkceOralNote >= 0 && turkceOralNote <= 100) {
            this.courseTurkce.courseOralNote = turkceOralNote;
        }
        if (matOralNote >= 0 && matOralNote <= 100) {
            this.courseMatamatik.courseOralNote = matOralNote;
        }
        if (fenOralNote >= 0 && fenOralNote <= 100) {
            this.courseFen.courseOralNote = fenOralNote;
        }

        // Sınav notları :

        if (turkceExamNote >= 0 && turkceExamNote <= 100) {
            this.courseTurkce.courseExamNote = turkceExamNote;
        }

        if (matExamNote >= 0 && matExamNote <= 100) {
            this.courseMatamatik.courseExamNote = matExamNote;
        }

        if (fenExamNote >= 0 && fenExamNote <= 100) {
            this.courseFen.courseExamNote = fenExamNote;
        }


    }


    double calcAvarage() {

        turkceOrtalamasi = (this.courseTurkce.courseOralNote * 0.2) + (this.courseTurkce.courseExamNote * 0.8);
        matematikOrtalamasi = (this.courseMatamatik.courseOralNote * 0.2) + (this.courseMatamatik.courseExamNote * 0.8);
        fenOrtalamasi = (this.courseFen.courseOralNote * 0.2) + (this.courseFen.courseExamNote * 0.8);

        return avarage = (turkceOrtalamasi + matematikOrtalamasi + fenOrtalamasi) / 3;
    }

    void printNote() {
        System.out.println("Türkçe Ortalaması : " + turkceOrtalamasi);
        System.out.println("Matematik Ortalaması : " + matematikOrtalamasi);
        System.out.println("Fen Ortalaması : " + fenOrtalamasi);
        System.out.println("Not ortalaması : " + avarage);
    }

    void isPass() {
        calcAvarage();
        if (avarage >= 60) {
            System.out.println(studentName + " sınıfını başarılı bir şekilde geçmiştir, not bilgileri aşağıdaki gibidir.");
        } else {
            System.out.println(studentName + " sınıfını başarılı bir şekilde geçememiştir, not bilgileri aşağıdaki gibidir.");
        }
        printNote();
    }


}
