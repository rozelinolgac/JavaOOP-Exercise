package OgrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String courseName;
    int CourseCode;
    String prefix;
    int courseOralNote;
    int courseExamNote;
    Course(String courseName,int courseCode,String prefix){
        this.courseName=courseName;
        this.CourseCode=courseCode;
        this.prefix=prefix;
        this.courseOralNote=0;
        this.courseExamNote=0;
    }
    void addTeacher(Teacher teacher){
        if(this.prefix.equals(teacher.branch)) {
            this.teacher=teacher;
            System.out.println("Öğretmen ekleme işlemi başarılı");
            printTeacher();

        }
        else {
            System.out.println("Öğretmen bu dersi veremez");
        }

    }

    void printTeacher(){
        System.out.println(courseName+" dersini veren öğretmen bilgileri : ");
        System.out.println("Adı : "+this.teacher.name);
        System.out.println("Bölümü : "+this.teacher.branch);
        System.out.println("Telefon Numarası : "+this.teacher.phoneNumber);
        System.out.println("............");


    }


}
